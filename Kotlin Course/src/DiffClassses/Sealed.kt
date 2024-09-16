package DiffClassses

import kotlin.random.Random

fun main(args: Array<String>){
    val myvehicle = getVehicle()
    when(myvehicle){
        is Car -> println("A car is faster")
        is Bicycle -> println("A bicycle is more healthy")
    }

    for(i in 1..10){
        val prize = lottery()
        when(prize){
            is Vacation -> println("Vacation is fun !relax")
            is FranceLibrary -> println("Wow I was a car")
            is GiftCard -> println("yay, a gift card!")
        }
    }
}

fun getVehicle(): Vehicle = Pegaus()
fun lottery(): Prize{
    val number = Random.nextInt(3)
    return when(number){
        0 -> FranceLibrary()
        1 -> VW()
        else -> Dollar10()
    }
}
abstract class Vehicle

sealed class Car: Vehicle()
sealed class Bicycle: Vehicle()
class BMW: Car()
class Pegaus: Bicycle()

abstract class Prize
sealed class Card: Prize()
sealed class Vacation: Prize()
sealed class GiftCard: Prize()

class VW: Card()
class FranceLibrary: Vacation()
class Dollar10: GiftCard()

