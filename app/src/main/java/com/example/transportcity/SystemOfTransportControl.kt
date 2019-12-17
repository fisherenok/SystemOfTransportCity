package com.example.transportcity

class SystemOfTransportControl: SystemOfTransportControlI {

    var freeBusses: List<Transport> = mutableListOf()
    var freeTrums: List<Transport> = mutableListOf()
    var freeTrolleybusses: List<Transport> = mutableListOf()

    var busyBusses: List<Transport> = mutableListOf()
    var busyTrums: List<Transport> = mutableListOf()
    var busyTrolleybusses: List<Transport> = mutableListOf()


    override fun addTransport() {}

    override fun deleteTransport() {}

    override fun collectStatistic(): Statistic {
      return Statistic()
    }

    var crateTransport:List<Transport> = mutableListOf()
}