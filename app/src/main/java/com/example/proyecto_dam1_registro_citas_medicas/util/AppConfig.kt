package com.example.proyecto_dam1_registro_citas_medicas.util

import android.app.Application
import android.content.Context
import android.os.Build
import com.example.proyecto_dam1_registro_citas_medicas.data.InitDB

class AppConfig: Application() {

    companion object{
        lateinit var CONTEXT : Context
        lateinit var BD: InitDB
        val BASE = "Consultas_Medicas.db"
        val VERSION = 1
    }

    override fun onCreate() {
        super.onCreate()
        CONTEXT = applicationContext
        BD = InitDB()
    }
}