package OOP.FourPrinciples

import OOP.Doctor
import OOP.Engineer

fun main(args: Array<String>){
    val birdie = Parrot()
    birdie.fly()

    val son = Son()
    son.printName()
}

open class Bird {
    open var color = "grey"
    open var speed = 50

    open fun fly(){
        println("$color Bird can fly up to $speed kph")
    }
}

class Parrot: Bird() {
    override var color = "green"
    override var speed = 75

    override fun fly(){
        super.fly()
        println("A ${super.color} bird can fly up to ${super.speed} kph")
    }
}

open class Father {
    open var firstName = "Emad"
    var lastName = "Labib"

    open fun printName(){
        println("My name is: $firstName $lastName")
    }
}

class Son: Father(){
    override var firstName = "Philo"

    override fun printName(){
        super.printName()
        println("My father's name is: ${super.firstName} ${super.lastName}")
    }
}