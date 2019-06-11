package com.example.diesroller.Aquarium

import com.example.diesroller.Book.eBook

fun main() {
    buildAqarium()
    makeFish()
    printBookInfo()
}

fun printBookInfo() {
    val myBook = eBook("The Mahavir swami PART 1", "Mahavir")
    println(myBook.printvalues())
}

fun buildAqarium() {
    val myAqarium = Aquarium()

    println(
        "height: ${myAqarium.height} \n" +
                "width: ${myAqarium.width} \n" +
                "length" + myAqarium.length
    )


    myAqarium.length = 80
    println("\nheight: ${myAqarium.length} cm")
    println("\nheight: ${myAqarium.volume} liter")
    val myAquarium = Aquarium(numberOfFish = 9)
}


fun makeFish() {
    val shark = Shark()
    val placesomus = Placesomus()

    println(" Shark : ${shark.color} \n Placesomus : ${placesomus.color}")

    shark.eat()
    placesomus.eat()

}
