package hangman

import kotlin.random.Random

val words = listOf("chair", "bed", "desk", "room", "carpet", "glass", "cup", "bag", "jeans", "slipper", "trash", "books", "phone", "planner", "pen", "tissues", "mirror", "joy", "prayer", "notebook")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main(args: Array<String>){
    setupGame()
}

fun setupGame(){
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
    println(word)

    for(i in word.indices){
        guesses.add('_')
    }

    var gameOver = false

    do{
        printGameStatus()
        println("Please enter a letter:")
        val input = readLine()?:""

        if(input.isEmpty()){
            println("That's not a valid input!")
        } else{
            val letter = input[0].toUpperCase()
            if(word.contains(letter)) {
                for( i in word.indices){
                    if(word[i] == letter)
                        guesses[i] = letter
                }
                if(!guesses.contains('_'))
                    gameOver = true
            }else{
                println("Sorry that is not part of the word!")
                remainingGuesses--
                mistakes++
                if(mistakes == 6)
                    gameOver = true
            }
        }
    }while(!gameOver)

    if(mistakes == 6){
        printGameStatus()
        println("Sorry, you lost. The word was \n$word")
    } else {
        println("\nCongratulations, you win!")
        println("The word was \n$word")
    }
}

fun printGameStatus(){
    when(mistakes){
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("Word: ")
    for(element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}

fun print0Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}