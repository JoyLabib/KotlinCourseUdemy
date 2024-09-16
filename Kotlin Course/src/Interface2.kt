fun main(args: Array<String>){
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.feed()

    myFood = FrenchRestaurant().todaySpecial()
    myFood.feed()

    val dealer = CarDealer()
    var myCar = dealer.rentAffordableCar()
    myCar.rent()
    myCar = dealer.rentLuxuryCar()
    myCar.rent()
}

interface Food{
    fun feed()
}

class FastFood: Food{
    override fun feed() {
        println("Fast food will feed you")
    }
}

class FrenchFood: Food{
    override fun feed() {
        println("French food will feed you and delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food{
        return FastFood()
    }
}

class FrenchRestaurant {
    fun todaySpecial(): Food{
        return FrenchFood()
    }
}

interface RentalCar{
    var price: Int
    fun rent()
}

class AffordableCar: RentalCar{
    override var price = 1000

    override fun rent() {
        println("The affordable car costs $price")
    }
}

class LuxuryCar: RentalCar{
    override var price = 3000

    override fun rent() {
        println("The luxury car costs $price")
    }
}

class CarDealer{
    fun rentAffordableCar(): RentalCar{
        return AffordableCar()
    }
    fun rentLuxuryCar(): RentalCar{
        return LuxuryCar()
    }
}