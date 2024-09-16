package OOP.FourPrinciples

import tictactoe.placeComputerMove

fun main(args: Array<String>){
    val pug = Pug("Pug")
    pug.run()
    pug.play()
    pug.bark()

    val husky = Husky("Husky")
    husky.run()
    husky.play()
    husky.bark()

    val golden = Golden("Golden")
    golden.run()
    golden.play()
    golden.bark()

    val ovenBosch = Bosch()
    val roaster = Rooaster()
    ovenBosch.cooking()
    roaster.cooking()


}

abstract class Dog(name: String){
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String): Dog(name){
    override fun run(){
        println("A $name can run")
    }
    override fun bark(){
        println("A $name cannot bark")
    }
    override fun play(){
        println("A $name cannot play")
    }
}

class Golden(val name: String): Dog(name){
    override fun run(){
        println("A $name can run")
    }
    override fun bark(){
        println("A $name cannot bark")
    }
    override fun play(){
        println("A $name can play")
    }
}

class Husky(val name: String): Dog(name){
    override fun run(){
        println("A $name can run")
    }
    override fun bark(){
        println("A $name can bark")
    }
    override fun play(){
        println("A $name cannot play")
    }
}

abstract class Oven{
    val cookingSpeed = 120
    open val avgTemperature = 100

    abstract fun cooking()
}

class Bosch: Oven(){
    override val avgTemperature = 210
    override fun cooking(){
        println("Bosch oven is cooking in $cookingSpeed seconds at $avgTemperature temperature")
    }
}

class Rooaster: Oven(){
    override fun cooking(){
        println("Roasters roast at $avgTemperature for $cookingSpeed minutes")
    }
}

