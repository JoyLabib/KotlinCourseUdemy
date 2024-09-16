fun main(args: Array<String>) {
    var a: String? = "I like my room"
//    println(a?.substring(3,6))

    var b: Double? = 13.94
    b = b?.times(6)
//    println(b?.toFloat())

//    println("Input your name:")
//    var name = readLine()
//    println(name?.length)

//    println("Input a number:")
//    var input = readLine()
//    var num: Double? = input?.toDouble()
//    num = num?.times(7)
//    println(num)
//    println(num?.toString()?.length)

//    var catName: String? = null
//    println(catName?:"This cat has no name")
////    catName = "Kitty"
//    println(catName?:"Kitty".length)

    println("A product costs 29.99, How many product you want to buy?")
    var num = readLine()
    var num1 = num?.toInt()?:1
    println(num1?.times(29.99))
}