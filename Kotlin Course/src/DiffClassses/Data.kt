package DiffClassses

import kotlin.random.Random

//Data class for storing data
// Primary constructor has at least one parameter
// It can have a body but tat is not required
fun main(args: Array<String>){
    val myUser = User("Joy", "joy@gmail.com", "123456")
//    println(myUser.toString())
//    println(myUser)

    //.equals() OR == : compares the data inside the object
    val myUser1 = User("Joy", "joy@gmail.com", "123456")
//    println(myUser == myUser1)

    //.copy : copy the info from an object + change some parameters
    val myUser2 = myUser.copy(email = "joooy@gmail.com")
//    println(myUser2)

    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alice", "alice@yahoo.com", 5))
    customers.add(Customer("Joy", "joy@yahoo.com", 3))
    customers.add(Customer("Bassel", "bassel@yahoo.com", 8))
    println(customers)

    val newCustomer = customers[1].copy(email = "jojo@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)

    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())
    val newArticles = arrayListOf<Article>()
    for(article in articles){
        val newArticle = article.copy(title = article.title + "  for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEach { println(it) }
}

fun sendEmail(customers: ArrayList<Customer>){
    customers.forEach { println("Sending an email to ${it.email}") }
}

fun getArticle(): Article{
    val randomTitle = "Title" + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(1000)
    return Article(randomTitle, "Some content", numberOfReaders)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)