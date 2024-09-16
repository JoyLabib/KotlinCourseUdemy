package DiffClassses

fun main(args: Array<String>){
    val color = Colors.BLUE
    when(color){
        Colors.RED -> println("You choose red")
        Colors.GREEN -> println("You choose green")
        Colors.BLUE -> println(" You choose blue")
    }
    println(Colors.BLUE.timeUsed)
    println(Colors.RED.name)
    println(Colors.GREEN.ordinal)

    var currentState = GameState.STARTED
    for(i in 1..8){
        println("$i. $currentState")
        currentState = changeState(currentState)
    }

    val olympics = Olympics()
    println(olympics.getMedal(3))
    println(olympics.getMedal(7))
    println(olympics.getMedal(1))

}

enum class Colors(val timeUsed: Int){
    RED(3),
    GREEN(5),
    BLUE(8)
}

fun changeState(currentState: GameState): GameState{
    when(currentState){
        GameState.STARTED -> return GameState.PLAYED
        GameState.PLAYED -> return GameState.GAMEOVER
        GameState.GAMEOVER -> return GameState.STARTED
    }
}

enum class GameState{
    STARTED,
    PLAYED,
    GAMEOVER
}

enum class Medal(val position: Int){
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics{
    fun getMedal(position: Int): Medal{
        return when(position){
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun getPosition(medal:Medal) = medal.position

}