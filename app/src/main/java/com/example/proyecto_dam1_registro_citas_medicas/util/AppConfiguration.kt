package com.example.proyecto_dam1_registro_citas_medicas.utils

import android.app.Application
import android.content.Context

class AppConfiguration: Application() {

    companion object{
        lateinit var CONTEXT:Context

    }

    override fun onCreate() {
        super.onCreate()
        //crear objeto CONTEXT
        CONTEXT =applicationContext

    }

}