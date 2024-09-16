fun main(args: Array<String>) {
    var tvShows = "many"
//    println(tvShows)
    tvShows = "too many"
//    println(tvShows)

    val color = "blue"
//    color = "red" /Can't change the val value, only var

    var slashes = "Two types of slashes: \\ and /"
//    println(slashes)

    var url = "http://www.google.com"
//    println(url)
    var bunny = "(\\(\\"
//    println(bunny)
    bunny = "(-.-)"
//    println(bunny)
    bunny = "o_(\")(\")"
//    println(bunny)

//    println(bunny.length)
//    println(color.capitalize())
//    println(slashes.decapitalize())
//    println(color.get(2))  // OR     println(color[2])

    var text = "     there   are   too   many  spaces    "
//    println(text.trim())

    var croc = "crocodile"
//    println(croc.substring(3))
//    println(croc.substring(3,6))

    println("My pet is a $croc, and I have ${2 - 2} of them")

    val client = "Mary"
    val products = 3
    val price = 30
    println("Hey $client, you need to pay ${products * price} to the cashier")
}
