package OOP.FourPrinciples

// private = visible only in the class
// protected =  visible to the class and the inherited classes
// internal = visible within the same package
// public (default) = visible to any class

fun main(args: Array<String>){
    val myLock = EncriptionLock(42)
//    println(" Does the key 35 unlock my lock? ${myLock.unlock(35)}")
//    println(" Does the key 69 unlock my lock? ${myLock.unlock(69)}")
//    println(" Does the key 74 unlock my lock? ${myLock.unlock(74)}")
//    println(" Does the key 12 unlock my lock? ${myLock.unlock(12)}")
//    println(" Does the key 42 unlock my lock? ${myLock.unlock(42)}")

    val rest = Franchise()
    rest.prepareBurgers()
}

class EncriptionLock (private val privateKey: Int){
    fun unlock(publicKey: Int) = formula(publicKey) == privateKey
    private fun formula(publicKey: Int) = publicKey / 2 + 5
}

open class OriginalRestaurant{
    protected fun applyFormula(): String{
        return "Prepare burgers with love and care"
    }
}

class Franchise: OriginalRestaurant() {
    fun prepareBurgers(){
        println("Preparing burgers according to the secret formula")
        println(applyFormula())
    }
}