fun main(args: Array<String>) {
    val x = 25.2
    val y = 3
    val z = x*y
//    println(z)
//    println(x::class.java)
//    println(y::class.java)
//    println(z::class.java)

    val nbOfPeople = 750000000000
//    println(nbOfPeople::class.java)

    //Exercise: Numbers
//    println("Please enter any number:")
//    val num = readLine()?:""
//    val mul = num.toInt()*2.2
//    println(mul::class.java)

//    val cats = 3
//    val longCats = cats.toLong()
//    println(cats::class.java)
//    println(longCats::class.java)
//
//    val fewPeople = nbOfPeople.toInt()
//    println(fewPeople)
//    println(nbOfPeople::class.java)
//    println(fewPeople::class.java)

//    Exercise: Type Conversions
    println("Please enter any number of type double:")
    val db = readLine()?:""
    val mul = db.toDouble()*4.14159
    println(mul::class.java)
    println(mul)

}