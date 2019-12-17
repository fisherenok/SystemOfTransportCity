package com.example.transportcity

class RouteAccountSystem: SystemOfTransportControlI {

    fun collectStatistics() {}

    fun deleteRoute(number: Int) {}

    fun findRoute(number: Int) {}

    fun addRoute(route: Route) {}

    fun changeRoute(number: Int) {}

    var crateRoute:MutableMap<Int, Route> = mutableMapOf()
}