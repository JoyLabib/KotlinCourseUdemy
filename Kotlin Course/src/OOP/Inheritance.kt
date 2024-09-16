package OOP

fun main(args: Array<String>){
//    val myDoggy = Corgi()
//    myDoggy.size = 10
//    println(myDoggy.size)
//    myDoggy.bark()
//    myDoggy.play()
//    val myLaptop = Laptop()
//    val myApple = Apple()
//    myApple.screenSize = 13
//    myApple.name = "Apple macbook"
//
//    myLaptop.run()
//    myApple.run()

//    val boeing737 = Boeing()
//    val a320 = Airbus()
//
//    boeing737.speed = 700
//    a320.speed = 800
//
//    boeing737.name  = "Boeing 737"
//    a320.name = "Airbus a320"
//    boeing737.ascend()
//    a320.descend()
//    boeing737.descend()
//    a320.ascend()

    val eng = Engineer()
    val doc = Doctor()

    eng.name = "Engineer"
    doc.name = "Doctor"

    eng.salary = 15000
    doc.salary = 25000

    eng.work()
    eng.study()
    eng.work()

    doc.study()
    doc.study()
    doc.study()
    doc.work()
}

open class Dog{
    var size = 0
    fun bark(){
        println("Bark")
    }

    fun play(){
        println("Play")
    }
}

class Corgi: Dog(){

}

open class Laptop {
    var screenSize = 15
    var speed = 1200
    var name = "Generic laptop"
    
    fun run(){
        println("Running $name with screen size $screenSize and speed $speed")
    }
}

class Apple: Laptop() {

}

open class Airplane{
    var speed = 1000
    var altitude = 20000
    var name = "Generic airplane"

    fun ascend(){
        altitude += 1000
        println("$name has an altitude of $altitude and speed $speed")
    }

    fun descend(){
        altitude -= 1000
        println("$name has an altitude of $altitude and speed $speed")
    }
}

class Boeing: Airplane(){

}
class Airbus: Airplane(){

}

open class Job{
    var name = "Generic job"
    var revenue = 0
    var salary = 10000

    fun work(){
        revenue += salary
        println("$name revenue $revenue")
    }

    fun study(){
        salary += 5000
        println("$name salary $salary")
    }
}

class Doctor: Job(){

}

class Engineer: Job(){

}



