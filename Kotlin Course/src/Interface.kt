fun main (args: Array<String>){
    val myOven: Oven = getOven()
//    myOven.turnOn()
//    myOven.cook(150)
//    myOven.turnOff()

    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()

    val factory = CarFactory()
    val myCar = factory.provideCar()

    myCar.speed = 80
    myCar.drive()
    myCar.park()

    val coffeeShop1 = CoffeeShop()
    var myCoffee: Coffee? = null
    for(i in 1..5){
        myCoffee = coffeeShop1.buyCoffee()
        myCoffee?.wakeUp()
        myCoffee?.quenchThirst()
    }
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int){
        println("Cooking at $temp degrees")
    }
}

class Bosch: Oven {
    override val temperature = 180

    override fun turnOn() {
        println("Turning On")
    }

    override fun turnOff() {
        println("Turning Off")
    }
}

fun getOven(): Oven{
    return Bosch()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant: Restaurant{
    override fun provideFood() {
        println("Serving food at local restaurant")
    }

    override fun provideBill() {
        println("Please pay the bill: 30")
    }
}

class FancyRestaurant: Restaurant{
    override fun provideFood() {
        println("Serving food at the fancy restaurant")
    }

    override fun provideBill() {
        println("Please pay the bill: 100")
    }
}

interface Car{
    var speed: Int
    fun drive()
    fun park()
}

class BMW: Car {
    override var speed: Int = 250
    override fun drive() {
        println("BMW is driving at $speed kph")
    }
    override fun park() {
        println("BMW is parking")
    }
}

class CarFactory{
    fun provideCar(): Car{
        return BMW()
    }
}

interface Coffee{
    fun wakeUp()
    fun quenchThirst()
}

class Arabica: Coffee{
    override fun wakeUp() {
        println("Waking you up with some Arabica")
    }

    override fun quenchThirst() {
        println("Quenching your Arabica thirst! ")
    }
}

class Robusta: Coffee{
    override fun wakeUp() {
        println("Waking you up with some Robusta")
    }

    override fun quenchThirst() {
        println("Quenching your Robusta thirst! ")
    }
}

class CoffeeShop{
    fun buyCoffee(): Coffee{
        val randomNumber:Long = System.currentTimeMillis()
        return if(randomNumber % 2 == 0L)
            Arabica()
        else
            Robusta()
    }
}