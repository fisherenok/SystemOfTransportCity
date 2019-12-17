package com.example.transportcity

class Controller {
    private var cityTransportSystem: CityTransportSystemI = Configuration().cityTransportSystem

    fun collectStatistic() {
        cityTransportSystem.collectStatistic()
    }

    //todo заполнить методы по примеру

    fun collectStatistic(route: Route) {
        cityTransportSystem.collectStatistic(route)
    }

    fun getRoute(number: Int) {
        cityTransportSystem.getRoute(number)
    }
    fun addTransport(transport: Transport) {
        cityTransportSystem.addTransport(transport)
    }
    fun deleteTransport(number: Int) {
        cityTransportSystem.deleteTransport(number)
    }
    fun addRoute(route: Route) {
        cityTransportSystem.addRoute(route)
    }
    fun deleteTransport(name: String) {
        cityTransportSystem.deleteTransport(name)
    }
    fun changeRout(name: String){
        cityTransportSystem.changeRout(name)
    }
    fun getRouteList(): List<Route>{
        return mutableListOf()
    }

}