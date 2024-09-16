//Lambda function is an anonymous function (has no name)
//It can have parameters, and can be assigned to a variable
//The variable can be passed as a parameter to a new function (higher order functions)

fun main(args: Array<String>) {
//    val names = arrayListOf("Alice", "Bob", "Mark", "Dan")
//    val myLambda = { name: String -> println("Hello $name") }
//    sayHello(names, myLambda)
    //    sayHello(names, { name: String -> println("Hello $name") })
    //    sayHello(arrayListOf("Alice", "Bob", "Mark", "Dan"), { name: String -> println("Hello $name") })

//    val numbers: ArrayList<Int> = arrayListOf(3, 8, 6, 5, 412, 5615, 45)
//    println(numbers)
//    val newNumbers: ArrayList<Int> = update(numbers) {number -> number/10}
//    println(newNumbers)

//    val clients = arrayListOf("Mark", "Peter", "Joy", "Bassel")
//    val messages = getMessages(clients) {name -> "Hello $name, how are you?"}
//    println(clients)
//    println(messages)
//
//    for(i in 0..clients.size-1){
//        println("Message for ${clients[i]}")
//        println(messages[i])
//        println()
//    }

    //Common HOFs
    val clients = listOf("Alice", "Bob", "Joy", "Rita")
    //clients.forEach { println("Hello $it") }
//    clients.filter { it.length < 5 }
//        .forEach { println("Hello $it")}
//    val sizes = clients.map { it.length }
//    println(sizes)
//    val sorted = clients.sortedBy{ it.length }
//    println(sorted)
//    val max = clients.maxBy { it.length }
//    println(max)
//    val min = clients.minBy { it.length }
//    println(min)

    val numbers = setOf(3, 456, 56, 78, 9, 987, 365)
    println(numbers.filter { it in 10..99})

    println(clients.sortedBy { it[it.length-1] })

    val ints = listOf(23, 65, 78, 71, 93, 785, 656, 489, 123, 654, 741)
    println(ints.maxBy { it.toString()[1].toInt() })
    println(ints.maxBy { it / 10 % 10 })

    //Exercise
    val subset = ints.map {
        if( it%2 == 0)
            it / 2
        else
            it * 2
    }
        .filter { it > 25 }
    println(subset)
}

// a HOF is a function that takes another function as a parameter
fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit){
    for(name in names){
        doSomething(name)
    }
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for(i in 0..numbers.size-1){
        if(numbers[i]%2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}

fun getMessages(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages: ArrayList<String> = arrayListOf<String>()
    for(client in clients){
        messages.add(getMessage(client))
    }
    return messages
}