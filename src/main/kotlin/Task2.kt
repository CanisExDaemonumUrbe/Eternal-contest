package com.cedu

fun main() {
    val n = readln().toInt()
    println(minCuts(n))
}

fun minCuts(n: Int): Int {
    var cuts = 0
    var parts = 1
    while (parts < n) {
        val canDouble = minOf(parts, n-parts)
        parts += canDouble
        cuts++
    }
    return cuts
}
