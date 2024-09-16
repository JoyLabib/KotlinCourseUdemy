fun main(args: Array<String>){
//    for(i in 1..3){
//        nemasi3alUser()
//    }
//    //multiplyNumber()
//    println("Please enter an animal")
//    val animal = readLine()?:""
//    val lifeSpan = getLifeSpan(animal)
//    println("A $animal hasa lifespan of $lifeSpan years")

    //MORE ON FUNCTIONS

//    println("5 * 2 = ${multiply(5)}")
//    println("5 * 7 = ${multiply(5, 7)}")
//    feedAnimal(setOf("dog", "bear","shark"))

//    printSize("Hello I am Joy")
//    printSize(8)
//    taxApplied(mapOf(Pair("cake", 3.99), Pair("milk", 1.99), Pair("can of soda", 2.55)))

    println(sumOfIntegers(4, 8, 5, 7, 3, 9))
    println(sumOfIntegers(44, 87, 55, 67, 13, 9))
    println(sumOfIntegers(43, 89, 45, 77, 32, 99))
    awesomeBank(hashMapOf(Pair("Alice", 546.0), Pair("Mark", 756.2), Pair("George", 111.6)))
}
fun printHello(){
    println("Hello Everyone!")
}
fun multiplyNumber(){
    println("Please enter a number")
    val input = readLine()?:""
    val number = input.toInt()
    println("$number * 17 = ${number*17}")
}
fun nemasi3alUser(){
    println("Please enter you name")
    val input1 = readLine()?:""
    println("Please enter your birth year")
    val input2 = readLine()?:""
    val age = input2.toInt()
    println("Hello $input1! you have ${2024-age-1} or ${2024-age} years old")
}

fun getLifeSpan(name: String): Int {
    val lifeSpan = when(name){
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifeSpan
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier

fun feedAnimal(animal: String){
    println("Feeding the $animal")
}

fun feedAnimal(animals: Collection<String>){
    for(animal in animals){
        feedAnimal(animal)
    }
}

fun printSize(message: String){
    println("$message has a size of ${message.length}")
}

fun printSize(size: Int){
    var message = ""
    for( i in 1..size){
        message += 'a'
    }
    println("A message of size $size is $message")
}

fun taxApplied(product: String, price: Double?){
    println("The price of $product after the 20% taxes got applied is ${price?.times(1.2)}")
}
fun taxApplied(products: Map<String,Double>) {
    for(product in products.keys){
        taxApplied(product, products[product])
    }
}

fun sumOfIntegers(vararg numbers: Int): Int{
    var sum = 0
    for(number in numbers){
        sum += number
    }
    return sum
}

fun awesomeBank(users: HashMap<String, Double?>) {
    println(users)
    fun doubleAmount(amount: Double?) = amount?.times(2)

    for(user in users.keys){
        users[user] = doubleAmount(users[user])
    }
    println(users)
}

fun greetTheUsers(){
    fun greetUser(name: String){
        println("Hello $name!")
    }
    do{
        println("Please enter a name")
        val input = readLine()?:""
        if(input == "")
            break
        greetUser(input)
    } while(true)
}