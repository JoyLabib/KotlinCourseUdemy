import java.lang.Exception
import kotlin.IllegalStateException

fun main(args: Array<String>) {
//    val test = readLine()
//    try{
//        println(test?.toInt())
//    } catch (e: Exception){
//        e.printStackTrace()
//        println("An exception happened \n ${e.localizedMessage}")
//    } finally {
//        println("The execution has completed")
//    }
//
//    var test1 = readLine()
//    throw IllegalStateException("I don't like this input")

//    var input = readLine()
//    try{
//        var num = input?.toInt()?.times(5)
//        println("The number is ${num}")
//    } catch(e: Exception){
//        println("An exception happened \n ${e.localizedMessage}")
//        e.printStackTrace()
//    }

    println("What product you want to buy?")
    var product = readLine()
    println("How many products you need?")
    var how = readLine()
    try{
        println("The total for your ${how} ${product} is ${how?.toInt()?.times(9.99)}")
    } catch(e: Exception) {
        println("An exception happened \n ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Transaction completed")
    }
}