package com.example.transportcity

interface CityTransportSystemI {
    fun collectStatistic()
    fun collectStatistic(route: Route)
    fun getRoute(number: Int)
    fun addTransport(transport: Transport)
    fun deleteTransport(number: Int)
    fun addRoute(route: Route)
    fun deleteTransport(name: String)
    fun changeRout(name: String)
    fun getRouteList(): List<Route>
}