/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */


fun main() {
    println("Kotlin MutableList!")
    println()

    //Create our list
    val snacks = mutableListOf<String>()

    //Show it
    println(snacks)

    //Add in some things...
    snacks.add("Cheetos")
    snacks.add("Bluebird")
    snacks.add("Honey dip and chicken chips")
    println(snacks)

    //Show specific
    println(snacks[0])

    // println(snacks[3]) | This would be out of bounds because the list doesn't extend that far. It starts at 0 and continues

    //Change the value
    snacks[1] = "Dog Biscuits"
    println(snacks)

    // Remove an item
    snacks.removeAt(0)
    println(snacks)

    //Add in new items in specific places
    snacks.add(1, "Tim Tams")
    println(snacks)

    // Sort the list alphabetically
    snacks.sort()
    println(snacks)

    // Shuffle the list (randomize)
    snacks.shuffle()
    println(snacks)

    snacks.add("Milky Bar")
    snacks.add("Fruit Burst")

    // Get a random item from the list
    val item = snacks.random()
    println("Random item: $item ")

    //Searching for an item
    println("Tim Tams is in this list: ${ snacks.contains("Tim Tams")} ") //Is in list so true
    println("Caramello is in list: ${ snacks.contains("Caramello")} ") //Is not in list so false

    //Getting the index of an item
    println("Tim Tams is in this list: ${ snacks.indexOf("Tim Tams")} ") //Is in list so true
    println("Caramello is in list: ${ snacks.indexOf("Caramello")} ") //Is not in list so false

    //Loop through the list
    for (snack in snacks) {
        println(snack)
    }

    //Loop using an index
    for (i in 0 ..< snacks.size) {
        println("$i: ${snacks[i]} ")
    }
    //Loop getting index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: $snack")
    }

}