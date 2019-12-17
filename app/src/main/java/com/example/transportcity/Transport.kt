package com.example.transportcity

open class Transport(
    var number: Int,
    var size: Int
) {
    fun changeCountOfPeople(count: Int) {
        this.size = count
    }
}