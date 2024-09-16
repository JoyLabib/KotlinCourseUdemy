package OtherConcepts

import kotlin.random.Random

//lazy variables are initialized when needed
fun main(args: Array<String>){
    val someLargeVariables: String by lazy {
        "Some large values"
    }

    if(Random.nextInt() % 2 == 0)
        println(someLargeVariables)

    val list: List<Int> by lazy { generateList() }
    println("Should the list be generated? (yes/no)")
    val input: String = readLine()?:""
    if(input == "yes")
        println(list)

    val newUser: NewUser by lazy { NewUser() }
    val banned: List<String> = listOf("Alice", "bob", "Carol")
    println("Please enter a username")
    val input1 = readLine()?:""
    if(!banned.contains(input1))
        newUser.printWelcome()
}

fun generateList(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..1000)
        integers.add(Random.nextInt(1000))
    return integers
}

class NewUser{
    fun printWelcome() {
        println("Hello to the course!")
    }
}