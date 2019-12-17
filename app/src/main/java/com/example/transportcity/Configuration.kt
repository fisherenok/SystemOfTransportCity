package com.example.transportcity

class Configuration {
    lateinit var cityTransportSystem: CityTransportSystem
    lateinit var routeAccountSystem: RouteAccountSystem

    fun initCityTransportSystem(){
        cityTransportSystem = CityTransportSystem()
    }

    fun initRouteAccountSystem(){
        routeAccountSystem = RouteAccountSystem()
    }
}