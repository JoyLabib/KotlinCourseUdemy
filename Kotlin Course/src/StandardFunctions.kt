// they are also called scope functions
// they execute code in the context of an object
// creats a temporary scope while the code is executed

fun main(args: Array<String>){
    //letFunction()
    //withFunction()
    //runFunction()
    //applyFunction()
    //alsoFunction()
    takeIfAndTakeUnlessFunction()
}

/////////////LET FUNCTION///////////
//Allows us to run code on an object
fun letFunction(){
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
        .let { filteredList ->
            println(filteredList)
            println("Size of list is ${filteredList.size}")
        }
//        .let(::println)

    println("Input a number")
    val input = readLine()
    input?.let {
        val number = it.toInt()
        println("The double of your number is ${number*2}")
    }

    val animals1 = arrayListOf<String?>()
    for(i in 1..3){
        println("Input an animal")
        val input = readLine()
        input?.let {
            if (it == "")
                animals1.add(null)
            else
                animals1.add(it)
        }
    }

    animals1.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }

    //Exercise
    val clients = arrayListOf<String?>()
    do{
        println("Input client name")
        val input = readLine()
        input?.let {
            if(it.toLowerCase() != "stop") {
                if (it == "")
                    clients.add(null)
                else
                    clients.add(it)
            }
        }
    } while(input?.toLowerCase() != "stop")
    println(clients)

    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }
}

/////////////WITH FUNCTION///////////
//perform a block of code on an object
fun withFunction(){
    val person = Person()
    with(person) {
        firstName = "Joy"
        lastName = "Labib"
        age = 22
        printInfo()
    }

    with(Store()) {
        shoes = 25
        shirts = 35
        jackets = 45
        printInventory()
    }
}

class Person{
    var firstName = ""
    var lastName = ""
    var age = 0
    fun printInfo(){
        println("$firstName $lastName is $age years old")
    }
}

class Store{
    var shoes = 10
    var shirts = 20
    var jackets = 30

    fun printInventory(){
        println("The store has $shoes shoes, $shirts shirts, and $jackets jackets")
    }
}

/////////////RUN FUNCTION///////////
// Same as with but invokes as an extension function

fun runFunction(){
    val rest = Restaurant1().run {
        standardDish = "Koshary"
        todaySpecial = "Molokheya"
        printInfo()
        this
    }
    println(rest)

    val myLaptop = Laptop1().run {
        turnOff()
        turnOn()
        this
    }
    println(myLaptop)

}

class Restaurant1{
    var standardDish = ""
    var todaySpecial = ""
    fun printInfo(){
        println("The standard dish is $standardDish")
        println("Today's special is $todaySpecial")
    }
}

class Laptop1 {
    fun turnOn(){
        println("The laptop is turning on")
    }
    fun turnOff(){
        println("The laptop is turning off")
    }
}
/////////////APPLY FUNCTION///////////
// it can be used to apply some functionality and return a result
fun applyFunction(){
    Lock().unlock(
        Key().apply {
            secretCode = "123"
            carve()
        }
    )

    println("Enter your name")
    val input = readLine()?:""
    CoffeeShop1().sellCoffee(input)
}

class Lock{
    fun unlock(key: Key){
        println("Unlocked lock with key $key")
    }
}
class Key{
    var secretCode = ""
    fun carve(){
        println("Carving the key with code $secretCode")
    }
}

class CoffeeCup{
    var clientName = ""
    fun prepareCoffee(){
        println("The coffee is being prepared")
    }
}
class CoffeeShop1{
    fun sellCoffee(name: String){
        CoffeeCup().apply {
            clientName = name
            prepareCoffee()
            println("Serving coffee to client $clientName")
            println(this)
        }
    }
}

/////////////ALSO FUNCTION///////////
//It is used for performing some additional actions on an object
fun alsoFunction(){
    Book().apply {
        printBook()
    }
        .also {
            println("LOG: Pringting book $it")
            println("Sending an email about book $it")
        }

    Car3().apply {
        buildCar()
    }
        .also {
            println("LOG: Building the car $it")
            println("Sending a message to the police that car $it is built")
        }
}

class Book{
    fun printBook(){
        println("Printing a book")
    }
}

class Car3{
    fun buildCar(){
        println("Building a car")
    }
}
/////////////TAKEIF & TAKEUNLESS FUNCTION///////////
// TAKE IF: It returns the object if the predicate values to true, otherwise return null
// TAKE UNLESS: It returns the object if the predicate values to false, otherwise return null

fun takeIfAndTakeUnlessFunction(){
    val numbers = listOf(3,65,78,41,22,66,28,15,9,100)
    println(numbers)
    val newNumbers = arrayListOf<Int>()
    for(number in numbers){
        number.takeIf { it % 2 == 0 }
            ?.let { newNumbers.add(it) }
    }
    println(newNumbers)

    val clients = listOf("Alex", "Joy", "Adam", "Emad", "Gehan")
    println(clients)
    val newClients = arrayListOf<String>()
    for (client in clients){
        client.takeUnless { it[0] == 'A' }
            ?.let { newClients.add(it) }
    }
    println(newClients)

    val numbers2 = arrayListOf<Int>()
    println("Enter 10 numbers")
    for(i in 1..10){
        val input = readLine()?:""
        val num = input.toInt()

        num.takeIf { it % 2 != 0 }
            .takeUnless { it == 3 || it == 13 }
            ?.let { numbers2.add(it) }

    }
    println(numbers2)
}
