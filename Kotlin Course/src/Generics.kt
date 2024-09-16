//Generics:
//A class can have type parameters
//The type can be used by variables and methods
//Useful when a class can handle multiple types of parameters
fun main(args: Array<String>){
    val myBox = Box<String>()
    myBox.display(("I want to sleep"))

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(1, 2, 3, 4, 5))

    val type1 = Type<Float>()
    type1.printMessage(45.98F)

    val type2 = Type<HashMap<String, Int>>()
    type2.printMessage(hashMapOf(Pair("Joy", 1), Pair("Philo", 2), Pair("Sama", 3), Pair("Rita", 4)))

    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Joy", "Bassel"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Philo", "Emad", "Emad", "Gehan"))

    val geo1 = Geomtry<Shape>()
    geo1.getMessage(Square(), 5)

    val geo2 = Geomtry<Shape>()
    geo2.getMessage(Circle(), 8)
}

class Box<T>{
    fun display(item: T){
        println(item)
    }
}
class Car5{

}

class Info<T>{
    fun getLength(items: T){
        println(items.toString().length)
    }
}

class Type<T>{
    fun printMessage(item: T){
        println("The item converted to a string is ${item.toString()}")
    }
}

//Type constraints:
//We can restrict the type of generic parameters

class Printer<T: Collection<String>> {
    fun iterate(collection: T){
        collection.forEach{ println(it.toString()) }
    }
}

abstract class Shape{
    abstract fun getArea(size: Int): Double
}
class Square: Shape() {
    override fun getArea(size: Int) = size * size.toDouble()
}
class Circle: Shape() {
    override fun getArea(size: Int) = size * size * 3.1415
}

class Geomtry<T: Shape>{
    fun getMessage(shape: T, size: Int) {
        println("The area of this shape is ${shape.getArea(size)}")
    }
}
