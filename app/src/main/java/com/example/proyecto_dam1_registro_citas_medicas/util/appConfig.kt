package com.example.proyecto_dam1_registro_citas_medicas.util

import android.app.Application
import android.content.Context
import android.os.Build
import com.example.proyecto_dam1_registro_citas_medicas.data.InitDB

class appConfig: Application() {

    companion object{

        val BD = "citas_medicas.db"
        val VERSION = 1
        lateinit var CONTEXT : Context
        lateinit var BASE: InitDB
    }

    override fun onCreate() {
        super.onCreate()

        //Creando obj CONTEXT
        CONTEXT = applicationContext
        BASE = InitDB()
    }
}