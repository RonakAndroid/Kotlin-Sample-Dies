package com.example.diesroller.Aquarium

import kotlin.math.PI

open class Aquarium(var width: Int = 100, var height: Int, var length: Int = 40) {

    constructor() : this(10, 9, 5)
    //kotlin used to recommend the default constructor for

    open var water = volume * 0.9


    constructor(numberOfFish: Int) : this()

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * height)
        }
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }

}