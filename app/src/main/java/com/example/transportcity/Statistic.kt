package com.example.transportcity

class Statistic (
    var listOfTransportInvolved: List<Transport> = mutableListOf(),
    var countOfPeopleAtStop: Int = -1,
    var allPeopleAtAllRoutes: Int = -1,
    var countOfPeopleOnEveryRoute: Map<Int, Route> = mutableMapOf(),
    var countOfPeopleOnEveryStop: Map<Int, Stop> = mutableMapOf()
){
    var containStop:MutableMap<Int, Stop> = mutableMapOf()
    var containRoute:MutableMap<Int, Route> = mutableMapOf()
    var containTransport:MutableList<Transport> = mutableListOf()
}