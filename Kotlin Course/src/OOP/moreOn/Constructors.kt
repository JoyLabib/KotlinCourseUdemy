package OOP.moreOn

fun main(args: Array<String>){
    val myBMW = Car("BMW", 220)
    val myCar2 = Car2()
    val myZizi = Car2("Suzuki")
    val myFerrari = Car2("Ferrari", 300)

//    println(myBMW)
//    println(myCar2)
//    println(myZizi)
//    println(myFerrari)

    val table1 = Table()
    val table2 = Table(5)
    val table3 = Table(4, 200)

//    table1.printInfo()
//    table2.printInfo()
//    table3.printInfo()

    val user1 =UserAccount()
    val user2 = UserAccount("Joy")
    val user3 = UserAccount("Philo", 50)
    val user4 = UserAccount("Gigi", 10)
}

class Car( var model: String, var topSpeed: Int){

}

class Car2 {
    constructor(){
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String){
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newSpeed: Int){
        model = newModel
        topSpeed = newSpeed
    }

    var model:String? = null
    var topSpeed = 100
}

class Table{
    constructor(){
        legs = 3
        height = 120
    }

    constructor(newLegs: Int){
        legs =  newLegs
        height = 130
    }

    constructor(newLegs: Int, newHeight: Int){
        legs = newLegs
        height = newHeight
    }

    var legs = 4
    var height = 150

    fun printInfo(){
        println("This table has $legs legs and a height of $height")
    }
}

class UserAccount{
    constructor(){
        username = "Haha"
        balance = 150
        canAfford()
    }

    constructor(newName: String){
        username = newName
        balance = 300
        canAfford()
    }

    constructor(newName: String, newBalance: Int){
        username = newName
        balance = newBalance
        canAfford()
    }

    var username = "No one"
    var balance = 0
    val shirtPrice = 20

    fun canAfford(){
        if(balance > shirtPrice){
            println("$username can afford ${balance / shirtPrice} shirts with the balance $balance")
        } else {
            println("$username can not afford any shirts")
        }
    }
}