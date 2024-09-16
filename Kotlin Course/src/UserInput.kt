import kotlin.random.Random

fun main(args: Array<String>) {
//    println(Random.nextInt())
//    println(Random.nextInt(10))
//    println(Random.nextInt(20, 30))
//    println(Random.nextDouble(300.0))


//    println("Input sth:")
//    val input = readLine()
//    println("You wrote $input")

//    val inputNumber = readLine()?:""
//    println("you wrote this minus 2: ${inputNumber.toInt() + 2}")

    println("Please enter your birth year:")
    val year = readLine()?:""
    println("You age is ${2024 - year.toInt()}")
}
