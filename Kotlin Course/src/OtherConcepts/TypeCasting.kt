package OtherConcepts

import kotlin.random.Random

fun main(args: Array<String>){
    val value = "Testing strings"
    if(value is String)
        println("This string has ${value.length} characters")

    val myCar: Car = getCar()
    if(myCar !is BMW)
        println("This is not my favorite brand")

    if(myCar is BMW)
        (myCar as BMW).drive()

//    for(i in 1..10) {
//        val bmwCar: BMW? = myCar as? BMW
//        bmwCar?.drive()
//
//        val service: NetworkService = getNetworkService()
//        (service as? FTPService)?.transferFile()
//    }

    val animals = getAnimal()
    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}

open class Car {}
class BMW: Car() {
    fun drive(){
        println("Driving my BMW")
    }
}

fun getCar(): Car = Car()

open class NetworkService {}
class FTPService: NetworkService() {
    fun transferFile() {
        println("Transferring a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    return if(Random.nextInt() % 2 == 0)
        NetworkService()
    else
        FTPService()
}

open class Animal {}
class Dog: Animal() {
    fun bark(){
        println("The dog is barking")
    }
}
class Cat: Animal() {
    fun purr(){
        println("The cat is purring")
    }
}

fun getAnimal(): ArrayList<Animal> {
    val animals = arrayListOf<Animal>()
    for (i in 1..20){
        animals.add(
            if(Random.nextInt() % 2 == 0)
                Dog()
            else
                Cat()
        )
    }
    return animals
}