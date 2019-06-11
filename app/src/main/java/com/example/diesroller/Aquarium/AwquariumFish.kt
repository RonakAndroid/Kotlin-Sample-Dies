package com.example.diesroller.Aquarium

abstract class AquriumFish {
    abstract val color: String

}

class Shark : AquriumFish(), FishAction {
    override fun eat() {
        println("munch and eat Fish")
    }

    override val color = "gray"
}

class Placesomus : AquriumFish(), FishAction {
    override fun eat() {
        println("hunt and eat Fish")
    }

    override val color = "gold"
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}
