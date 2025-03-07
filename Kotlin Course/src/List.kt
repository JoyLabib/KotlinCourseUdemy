fun main(args: Array<String>) {
    val colors = listOf("blue", "yellow", "red")
//    println(colors)
    val colors1 = listOf<String>()
//    println(colors1)
    val colors2 = listOf("blue", "yellow","blue", "red", "blue")
//    println(colors2)
    val colors3 = listOf("blue", "yellow","blue", null, null)
//    println(colors3)

//    println(colors[0])
//    println(colors.get(2))
//    println(colors3.size)

    val colors4 = arrayListOf("blue", "red")
//    println(colors4)
    colors4.add("yellow")
//    println(colors4)
    val moreColors = arrayListOf("pink", "teal")
    colors4.addAll(moreColors)
//    println(colors4)
    colors4.remove("red")
//    println(colors4)
    colors4.removeAll(moreColors)
//    println(colors4)
    colors4.removeAt(1)
//    println(colors4)
//
    colors4.add("red")
    colors4.add("blue")
//    println(colors4)
    colors4.remove("blue") //remove only the first element
//    println(colors4)

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
//    println(items)

//    println(colors)
//    println(colors.contains("red"))
//    println(colors.contains("pink"))

    val newColors = listOf("red", "green")
//    println(colors.containsAll(newColors))

//    println(colors.indexOf("blue"))
//    println(colors.lastIndexOf("blue"))

    colors4.add("blue")
    colors4.add("green")
//    println(colors4)
    colors4.set(1, "pink")
    val subColors = colors4.subList(1, 3)
//    println(subColors::class.java)
    colors4.clear()
//    println(colors4)
//    println(colors4.isEmpty())

    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    println(animals)
    animals.remove("lion")
    println(animals)
    val subAnimals = listOf("elephant", "giraffe")
    println(animals.containsAll(subAnimals))
}