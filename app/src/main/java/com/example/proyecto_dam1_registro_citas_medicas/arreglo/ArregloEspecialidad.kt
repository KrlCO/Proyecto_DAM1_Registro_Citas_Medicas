package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig

class ArregloEspecialidad {

    fun listado(): ArrayList<Especialidad>{

       var data = ArrayList<Especialidad>()

        //Accessing to DB
        val con:SQLiteDatabase = appConfig.BASE.readableDatabase

        //Sentence
        val sql = "select * from tb_especialidad"

        //execute sentence
        val rs:Cursor = con.rawQuery(sql, null)
        //loop
        while (rs.moveToNext()){
            //create obj class Especialidad and send in constructor values form fila
            val bean = Especialidad(rs.getInt(0), rs.getString(1),rs.getString(2))

            data.add(bean)
        }

        return data

       /* data.add(Especialidad(1,"Otorrinolaringologia", "Horario de atención L-V de 8:00am-5:00pm"))

        data.add(Especialidad(2,"Terapia y rehabilitación fisica", "Horario de atención L-V de 8:00am-5:00pm"))

        data.add(Especialidad(3,"Cardiologia", "Horario de atención L-V de 8:00am-5:00pm"))

      */
    }

}