package com.example.transportcity

class Route(
    var numberRoute: Int,
    var start: Int,
    var finish: Int
) {
    var stops: MutableList<Stop> = mutableListOf()

    fun addStop(stop: Stop) {
        this.stops.add(stop)
    }

    fun deleteStop(number: Int) {
        stops.removeIf {
            it.number == number
        }
    }

    fun deleteStop(name: String) {
        stops.removeIf {
            it.name == name
        }
    }
}