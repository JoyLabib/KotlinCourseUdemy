package OOP

fun main(args: Array<String>){
    val math = Math()
    println("3 + 7 = ${math.add(3,7)}")
    println("15 - 7 = ${math.sub(15,7)}")
    println("3 * 7 = ${math.mul(3,7)}")
    println("21 / 7 = ${math.div(21,7)}")

}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}