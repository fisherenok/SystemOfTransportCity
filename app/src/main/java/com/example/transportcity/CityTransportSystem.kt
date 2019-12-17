package com.example.transportcity

class CityTransportSystem : CityTransportSystemI {
    override fun collectStatistic() {}

    override fun collectStatistic(route: Route) {}

    override fun getRoute(number: Int) {}

    override fun addTransport(transport: Transport) {}

    override fun deleteTransport(number: Int) {}

    override fun deleteTransport(name: String) {}

    override fun addRoute(route: Route) {}

    override fun changeRoute(name: String) {}

    override fun getRouteList(): List<Route> {
        return mutableListOf()
    }
}