package OOP.moreOn

fun main(args: Array<String>){
    val myCar = WeirdCar()
    myCar.speed = 100
//    println("car.name ${myCar.name}")
//    println("car.speed ${myCar.speed}")
    val account = BankAccount()
    account.amount = 500
    account.amount = 1500
    account.amount = 10500

    val note = PostItNote()
//    println(note.msg)
    note.updateMessage("Meeting at 3")
//    println(note.msg)

    val myBox = Box()
//    println("Contents is ${myBox.contents}")
    myBox.updateContents("Jewellery")
//    println("Contents is ${myBox.contents}")

    val myTable = Table2()
    myTable.printInfo()
    myTable.updateDim(150, 250)
    myTable.printInfo()
}

class WeirdCar{
    var name = ""
    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High speed car $value"
            field = value
        }
}

class BankAccount {
    var creditRating  = 500
    var account: Int = 0
        get() = field
        set(value){
            if(value > account)
                creditRating++
            else
                creditRating--
            field = value
            println("New credit rating is $creditRating")
        }
    var interestRate = 0.0
    var amount: Int = 0
        get() = field
        set(value){
            if(value < 1000)
                interestRate = 1.0
            else if(value < 10000)
                interestRate = 0.5
            else
                interestRate = 0.2
            field = value
            println("The client has $value and has an interest rate of $interestRate")
        }
}

class PostItNote{
    var msg: String = "No message"

    fun updateMessage(msg: String){
        this.msg = msg
    }
}

class Box{
    var contents: String = ""

    fun updateContents(contents: String){
        this.contents = contents
    }
}

class Table2{
    var height = 120
    var size = 200

    fun updateDim(height: Int, size: Int){
        this.size = size
        this.height = height
    }

    fun printInfo(){
        println("Table height is $height and size is $size")
    }
}

