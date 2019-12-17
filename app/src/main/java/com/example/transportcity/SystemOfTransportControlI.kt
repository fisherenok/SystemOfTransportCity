package com.example.transportcity

interface SystemOfTransportControlI {
    fun addTransport()
    fun deleteTransport()
    fun collectStatistic(): Statistic
}