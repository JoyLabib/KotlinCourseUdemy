package OtherConcepts

//It allows us to create non null, non initialized variables
//Need to initialize the variable before using it.
//Accessing it before initializing it throws an exception
//Only used on var variables
//Use .isInitialized to check initialization

fun main(args: Array<String>){
    lateinit var networkService: String
    networkService = getNetworkService2()
    println(networkService)

    val myCountry = Country().apply { setName("Egypt") }
    println("Hello ${myCountry.getName()}!")

    lateinit var message: String
    val primeNumbers = listOf(1, 3, 5, 7, 11, 13, 17, 23)
    message = "The chosen prime number is ${selectPrimeNumber(primeNumbers)}"
    println(message)
}

fun getNetworkService2() = "Network Service"

class Country {
    private lateinit var name: String

    fun setName(name: String){
        this.name = name
    }

    fun getName() = name
}

fun selectPrimeNumber(primes: List<Int>) = primes.random()