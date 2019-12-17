package com.example.transportcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserInterface : AppCompatActivity() {

    var controller: Controller = Controller()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun stsatisticHandler(){

    }

    fun routeHandler(){
    }

    fun transportHandler(){}

    fun authorization(){}

    fun mainMenu(){}

    fun exit(){}
}
