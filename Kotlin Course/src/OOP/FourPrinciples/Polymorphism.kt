package OOP.FourPrinciples

// Overriding = overide a methos in two diff classes
// Overloading = write the same name of a method but with diff types/numbers of parameters
fun main(args: Array<String>){
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("fr")
    translator.sayHello("es")
    translator.sayHello("de")

    val tv = TV()
    tv.getChannel("s")
    tv.getChannel("r", true)
    tv.getChannel("l", "13:00")
}

class Translator {
    fun sayHello(){
        println("English: Hello!")
    }

    fun sayHello(language: String){
        when(language){
            "fr" -> println("French: Bonjour!")
            "es" -> println("Spanish: Hola!")
            else -> println("English: Hello!")
        }
    }
}

class TV{
    fun getChannel(id: String){
        println("Regular broadcast for channel $id")
    }

    fun getChannel(id: String, subtitles: Boolean){
        println("Regular broadcast for channel $id")
        if(subtitles)
            println("with subtitles")
        else
            println("without subtitles")
    }

    fun getChannel(id: String, time: String){
        println("Broadcast for channel $id at $time time")
    }
}