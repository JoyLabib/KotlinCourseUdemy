fun main(args: Array<String>){
    //If Conditional
//    println("Please input the funds amount")
//    val input = readLine()?:""
//    var clientFunds = input.toInt()
//    val price = 50
//    var products = 0
//
//    if(clientFunds > price){
//        clientFunds -= price
//        products++
//        println("You have purchased $products products")
//        println("You have $clientFunds funds")
//    } else {
//        println("You have insufficient funds to purchase the product")
//    }

    //Exercise 1:
//    val hasEggs = false
//    val hasBacon = false
//
//    if(hasEggs){
//        if(hasBacon){
//            println("You spent ${12*5+20*2} dollars")
//        }
//        println("You spent ${12*5} dollars")
//    } else{
//        println("You didn't find eggs, you spent 0 money")
//    }

    //Exercise 2:
//    println("input your grade (1 to 100)")
//    val input = readLine()?:"0"
//    val number = input.toInt()
//    if(number > 100)
//        println("Wrong number")
//    else {
//        val grade = if (number >= 90)
//            "A"
//        else if (number >= 80)
//            "B"
//        else if (number >= 70)
//            "C"
//        else if (number >= 60)
//            "D"
//        else if (number >= 50)
//            "E"
//        else
//            "F"
//        println("Your Grade is $grade")
//    }

//    println("Please enter your age")
//    val input = readLine()?:"1"
//    var age = input.toInt()
//    if(age == 0) age = 1
//    val result = if(age in 1..12)
//        "a child"
//    else if(age in 13..17)
//        "a teen"
//    else
//        "an adult"
//
//    println("User is $result")
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
    //When Conditional

//    println("How many meals do you have a day?")
//    val input = readLine()?:"3"
//    val meals = input.toInt()
//    when(meals){
//        in 0..2 -> println("You should eat more")
//        3 -> println("That's perfect")
//        else -> println("You should eat less")
//    }

//    println("Input the current hour")
//    val input = readLine()?:"0"
//    var hour = input.toInt()
//    if(hour > 23) hour = 23
//    val timeOfDay = when(hour) {
//        in 6..11 -> "morning"
//        in 12..14 -> "noon"
//        in 15..17 -> "afternoon"
//        in 18..21 -> "evening"
//        else -> "night"
//    }
//    println("At $hour:00 it is $timeOfDay")

//    println("Input your name")
//    val input = readLine()?:""
//    var name = input.toString()
//    when(name[0]){
//        'A','B','C' -> println("Hey bro $name")
//        in 'D'..'F' -> println("hi $name, hru?")
//        else -> println("Hellooooo")
//    }

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
    //For Loop

//    for(i in 1..10){
//        println("#$i: Hello hru?")
//    }
//
//    var total = 0
//    for(i in 1..100){
//        total += i
//    }
//    println("Total is $total")
//
//    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
//    for(customerName in customers.keys){
//        val purchases = customers[customerName]
//        println("$customerName purchased $purchases items")
//    }

    // Exercise 1
//    println("Pleaser enter a year:")
//    val input = readLine()?:"2024"
//    val year = input.toInt()
//    for(i in 1..12){
//        val message = when(i){
//            1 -> "January: 31 days"
//            2 -> if(year % 4 ==0) "February: 29 days" else "February: 28 days"
//            3 -> "March: 31 days"
//            4 -> "April: 30 days"
//            5 -> "May: 31 days"
//            6 -> "June: 30 days"
//            7 -> "July: 31 days"
//            8 -> "August: 31 days"
//            9 -> "September: 30 days"
//            10 -> "October: 31 days"
//            11 -> "November: 30 days"
//            12 -> "December: 31 days"
//            else -> ""
//        }
//        println(message)
//    }

//    println("enter a max value")
//    val input = readLine()?:"0"
//    val max = input.toInt()
//    for(i in max downTo 0){
//        if(i % 7 == 0)
//            println(i)
//    }
//
//    for(i in 1..10){
//        for(j in 1..i){
//            print("\uD83D\uDE00")
//        }
//        println()
//    }

//    println("Please enter the matrix size")
//    val input = readLine()?:"10"
//    val size = input.toInt()
//    for(i in 1..size){
//        for(j in 1..size){
//            when(i*j % 3){
//                0 -> print("\uD83D\uDE00\t")
//                1 -> print("\uD83E\uDD28\t")
//                2 -> print("\uD83D\uDE31\t")
//            }
//        }
//        println()
//    }

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
    //While Loop

//    var i = 0
//    while(i < 10){
//        i++
//        println("$i: Hello")
//    }
//
//    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
//    var index = 0
//    while(index < cats.size){
//        println("Hello ${cats[index]}")
//        index++
//    }
//
//    println("Enter a number:")
//    val input = readLine()?:"10"
//    val num = input.toInt()
//    var j = 1
//    var result = 1L
//    while(j <= num){
//        result *= j
//        j++
//    }
//    println("$num! = $result")

    //Exercise 1
//    println("Please enter a large number:")
//    val input = readLine()?:"20"
//    var num = input.toInt()
//    var i = 0
//    while(i < num){
//        if(i%7 == 0)
//            println("$i is divisible by 7")
//        i++
//    }
//    var finished = false
//    do{
//        println("Please enter a number greater than 100")
//        val input = readLine()?:""
//        var num = input.toInt()
//        if(num > 100){
//            println("Thanks")
//            finished = true
//        } else
//            println("$num is not greater than 100. Please try again!")
//    } while(!finished)

//    var finished = false
//    do{
//        println("Please enter a number:")
//        val input = readLine()?:""
//        var num = input.toInt()
//        var factorial = 1
//        var i = 1
//        while(i <= num){
//            factorial *= i
//            i++
//        }
//        if(factorial >= 3000000){
//            println("Thanks, $num! = $factorial")
//            finished = true
//        } else
//            println("$num! = $factorial is smaller than 3000000. Please try again!")
//    } while(!finished)

    //Exercise 2
//    val usernames = hashSetOf("john", "bob", "alice")
//    var finished = false
//    do{
//       println("Please enter a username")
//        val input = readLine()?:""
//        var user = input.toString()
//        var found = false
//        for(username in usernames){
//           if(username == user)
//               found = true
//       }
//        if(!found){
//            finished = true
//            println("Your new username is $user")
//        }  else
//            println("$user is the username you chose and it is already taken, please enter another one!")
//    } while(!finished)

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

    //Break and Continue
//    val animals = arrayListOf<String>()
//    for(i in 1..5){
//        println("Please enter an animal:")
//        val input = readLine()?:""
//        if(input == "snake"){
//            println("Sorry we cannot accept snakes")
//            break
//        }
//        animals.add(input)
//        println("Current animals $animals")
//    }

//    val clients = arrayListOf("Anna", "Bob", "Carol", "David")
//    for(client in clients){
//        if(client[0] == 'C')
//            continue
//        println("Hello $client")
//    }

    //Exercise
    while(true){
        println("Please enter your age")
        val input = readLine()?:""
        if(input == "stop")
            break
        val age = input.toInt()
        if(age < 18){
            println("Sorry you cannot go in")
            continue
        }
        println("Welcome to the club!")
    }
}