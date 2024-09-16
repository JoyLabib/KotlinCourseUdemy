package DiffClassses

fun main(args: Array<String>){
    val myCar = Car4()
    myCar.drive()

    val myPlane = Airplane()
    myPlane.takeOff()
}

// a nested class ia a class created inside another one

class Car4{
    var speed =100
    fun drive(){
        println("Driving at $speed")
    }

    inner class Engine{
        var rpm = 1000
        fun run(){
            println("Engine is running at $rpm rpm")
            this@Car4.speed = 50
            this@Car4.drive()
        }
    }
}

class Computer{
    fun bootUp(){
        val os = OperatingSystem()
        os.startOS()
        println("Computer ready")
    }
    inner class OperatingSystem{
        fun startOS(){
            println("OS Started")
        }
    }
}

class Airplane{
    private val engine1 = Engine("engine1")
    private val engine2 = Engine("engine2")

    fun takeOff(){
        println("Getting ready to take off")
        engine1.startEngine()
        engine2.startEngine()
        println("Taking off")
    }
    private inner class Engine(val name: String){
        fun startEngine(){
            println("Engine $name started")
        }
    }
}