package OOP.moreOn

fun main(args: Array<String>){
    val myCar = newCar()
    val myLaptop = Laptop("Windows 10")
    val web = WebBrowser()
}

class newCar{
    val model = "BMW"
    val topSpeed = 100

    init{
        println("This car is a model $model and has a top speed of $topSpeed")
    }
}

class Laptop(val operatingSystem: String){
    init{
        println("Operating system $operatingSystem is installing")

    }
}

class WebBrowser{
    init{
        println("Web browser is connecting")
        println("https://www.google.com/")
    }
}