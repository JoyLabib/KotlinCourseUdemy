package OOP.moreOn

import kotlin.random.Random

fun main(args: Array<String>){
//    println(Car4.provideDrivingInstructions())
    val course = KotlinCourse()
//    course.getCourseInfo()
//    KotlinCourse.getCourseMetaInfo()

    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)

    val myBook = Book(Book.getEditor())
    println(myBook.editor.name)
}

class Car4{
    companion object{
        fun provideDrivingInstructions(): String {
            return "Drive safe!"
        }
    }
}

class KotlinCourse{
    fun getCourseInfo(){
        println("Kotlin course is a java based development language")
    }

    companion object{
        fun getCourseMetaInfo(){
            println("Kotlin course is not a difficult language to learn")
        }
    }
}

class Lock(key: Key){
    val secretCode: String
    init{
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object{
        fun createKey() = Key()
    }

    fun generateSecret(): String{
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key){
        if(key.secretCode == secretCode)
            println("Lock is open")
        else
            println("Key is not correct")
    }
}

class Key{
    var secretCode: String = ""
        set(value){
            if(field == "")
                field = value
        }
}

class Book(val editor: Editor){
    companion object{
        fun getEditor() = Editor("J.Labib")
    }
}

class Editor(val name: String){

}