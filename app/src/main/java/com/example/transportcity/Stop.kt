package com.example.transportcity

class Stop(
    var name: String = "",
    var number: Int = -1,
    var people: Int = -1
) {
    fun changeCountOfPeople(count: Int){
       this.number = count
    }
}