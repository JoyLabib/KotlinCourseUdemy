fun main(args: Array<String>){
//    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
//    println(count)
//
//    val count2 = mapOf<Int, String>()
//    println(count2)
//
//    println(count[2])
//    println(count.keys)4

    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    count[5] = "five"
    println(count)

    val countMore = mapOf(Pair(20, "twenty"), Pair(30, "thirty"))
    count.putAll(countMore)
//    println(count)

    count.remove(20)
//    println(count)

    count.replace(2, "twotwo")
//    println(count)

//    count.clear()
//    println(count.size)
//    println(count.containsKey(2))
//    println(count.containsValue("two"))
//    println(count.isEmpty())

    var attendance = hashMapOf<String, Int>(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept",6253))
    attendance.put("26 Sept", 4532)
    val peopleOn25 = attendance["25 Sept"]?:0
    val peopleOn26 = attendance["26 Sept"]?:0
    println("People attended on 25 and 26 September are ${peopleOn25+peopleOn26}")
    println("Is 22 Sept data available? ${attendance.containsKey("22 Sept")}")
}