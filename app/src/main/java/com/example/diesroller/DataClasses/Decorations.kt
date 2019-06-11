package com.example.diesroller.DataClasses

fun main() {
    makeDecoration()
}
fun makeDecoration() {

    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d1)

    val d3 = Decorations("slate")
    println(d1)

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decorations1("crytal", "wood", "driver")
    println(d5)

    val (rock, wood, driver) = d5
    println(rock)
    println(wood)
    println(driver)

}

data class Decorations(val rockes: String) {

}

data class Decorations1(val rocks: String, val wood: String, val driver: String) {
}
