package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig


class ArregloPaciente{

    fun listado(): ArrayList<Paciente>{

        var data = ArrayList<Paciente>()

        val con:SQLiteDatabase = appConfig.BASE.readableDatabase

        val sql = "select * from tb_paciente"

        val rs:Cursor = con.rawQuery(sql, null)

        while (rs.moveToNext()){

            val bean = Paciente(rs.getInt(0),rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4),
                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8))

            data.add(bean)

        }
        return data

      /*  data.add(Paciente(1,"Adrian","Smith","87987654", 67,"M",987780454,"dafasdef@gmail.com","123456"))

        data.add(Paciente(2,"Anahi","Salgado","98457623", 30,"F",999678083,"dafasdef@gmail.com","123456"))
        data.add(Paciente(3,"Grecia","Torres","45768943", 26,"F",967856345,"dafasdef@gmail.com","123456"))

       */

    }
}