package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Cita
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig
import java.time.LocalDate

class ArregloCita {

    fun listado(): ArrayList<Cita>{

        var data = ArrayList<Cita>()

       /* data.add(Cita(1,2,1,"Jorge","Ugarte",
            "12/7/2020","10am","El consultorio de atencion es  403" ))

        data.add(Cita(2,1,2,"Luis","Bazalar",
            "24/7/2020","10am","El consultorio de atencion es  81" ))*/

        val con: SQLiteDatabase = appConfig.BASE.readableDatabase

        val sql = "select * from tb_cita"

        val rs:Cursor = con.rawQuery(sql, null)

        while (rs.moveToNext()){


            val bean = Cita(rs.getInt(0), rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getString(4), rs.getString(5),rs.getString(6))

            data.add(bean)

        }
        return data
    }

    fun addCita(bean:Cita): Int{
        var salida: Int = -1

        val base:SQLiteDatabase = appConfig.BASE.writableDatabase
        val filas = ContentValues()

        filas.put("IdEsp", bean.esp)
        filas.put("IdMedico", bean.doctor)
        filas.put("IdPaciente", bean.idpaciente)
        filas.put("Fecha", bean.fecha)
        filas.put("Hora", bean.hora)
        filas.put("Descripcion",bean.descripcion)

        salida = base.insert("tb_cita", "IdCita", filas).toInt()

        return  salida

    }


}