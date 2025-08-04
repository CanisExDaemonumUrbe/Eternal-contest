package com.cedu

fun main() {
    calculateTariffCost()
}

fun calculateTariffCost() = readln()
    .split(" ")
    .map(String::toInt)
    .let { (a, b, c, d) ->
        println(a + if (d > b) (d - b) * c else 0)
    }