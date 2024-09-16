package OOP

fun main(args: Array<String>) {
    val jetpack = Jetpack()
    jetpack.burn(10)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(2)
    println("User height is ${jetpack.userHeight}")
    jetpack.burn(5)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(8)
    println("User height is ${jetpack.userHeight}")
}

class Jetpack{
    var userHeight = 0

    fun burn(seconds: Int){
        println("Burning for $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int){
        println("Stopping for $seconds seconds")
        userHeight -= 3 + seconds
        if(userHeight < 0)
            userHeight = 0
    }
}