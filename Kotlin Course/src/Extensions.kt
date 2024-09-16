//Extensions allow us to extend a class that we don't own or cannot modify without the need to inherit from that class

fun main(args: Array<String>){
    val name = "Philopatir"
    println(name.slim())

    println(name.betterLength)
    println("SomeString".getCustomName())
    println(3.getCustomNumber())
    println(23.5F.getCustomDecimal())

    val arr = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(arr.getCustomSize())

    Book3.printME()
    String.getClassType()
    Double.getClassType()
}

//Extension functions: add functions to classes that we don't own or cannot modify
fun String.slim() = this.substring(1, length-1)
//Extension properties: add properties to classes

val String.betterLength:Int
    get() = 200

fun String.getCustomName() = "I am very tired"
fun Int.getCustomNumber() = 28
fun Float.getCustomDecimal() = 6.28

fun ArrayList<Int>.getCustomSize() = "The array contains $size elements"

//Companion object:
//If a class has a companion object defined, we can extend it with functions and properties
//

class Book3{
    companion object{

    }
}

fun Book3.Companion.printME(){
    println("Book has been printed")
}

fun String.Companion.getClassType(){
    println("This is a String class")
}

fun Double.Companion.getClassType(){
    println("This is a Double class")
}