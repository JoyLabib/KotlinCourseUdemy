fun main(args: Array<String>) {
//    val numbers = setOf(66, 37, 6, 42)
//    println(numbers)
//    val numbers2 = setOf<Int>()
//    println(numbers2)
//    val numbers3 = setOf(6, 5, 2, null, 8, 7, null, 4, null)
//    println(numbers3)

    val numbers = hashSetOf(3, 4, null, 83, 56)
    val noNumbers = hashSetOf<Int>()
//    println(numbers)

    numbers.add(44)
//    println(numbers)
    numbers.remove(83)
    val toRemove = hashSetOf(2, 3, null)
    numbers.removeAll(toRemove)
//    println(numbers)

    val customers = hashSetOf("john", "maria", "joy", "bassel")
    customers.add("philo")
//    println(customers)
    customers.remove("john")
//    println(customers)

//    println(numbers)
//    println(numbers.size)
//    println(numbers.contains(4))
//    println(numbers.contains(3))
//    println(numbers.isEmpty())

    val newNumbers = hashSetOf(4, 5, 7, 44)
//    println(numbers.intersect(newNumbers))
    newNumbers.clear()
//    println(newNumbers)

    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    var yesColors = acceptedColors.intersect(myColors)
    println("You can only wear: $yesColors")
    acceptedColors.add("red")
    yesColors = acceptedColors.intersect(myColors)
    println("You can now wear: $yesColors")

}
