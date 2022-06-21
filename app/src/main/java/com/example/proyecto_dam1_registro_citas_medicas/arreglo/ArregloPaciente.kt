package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig


class ArregloPaciente{

    fun listado(): ArrayList<Paciente>{

        var data = ArrayList<Paciente>()

       /*data.add(Paciente(1,"Adrian","Smith","87987654", 67,"M","987780454","dafasdef@gmail.com","123456"))

        data.add(Paciente(2,"Anahi","Salgado","98457623", 30,"F","999678083","dafasdef@gmail.com","123456"))
        data.add(Paciente(3,"Grecia","Torres","45768943", 26,"F","967856345","dafasdef@gmail.com","123456"))*/

        val con:SQLiteDatabase = appConfig.BASE.readableDatabase

        val sql = "select * from tb_paciente"

        val rs:Cursor = con.rawQuery(sql, null)

        while (rs.moveToNext()){

            val bean = Paciente(rs.getInt(0),rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4),
                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8))

            data.add(bean)

        }
        return data

    }

    //method for add Paciente
    fun addPaciente(bean:Paciente): Int{
        var salida: Int = -1

        //Into the BD in mode write
        val base:SQLiteDatabase = appConfig.BASE.writableDatabase

        //Create obj class ContentValues
        val filas = ContentValues()

        //add claves
        filas.put("Nombre", bean.nombre)
        filas.put("Apellido", bean.apellidos)
        filas.put("DNI", bean.dni)
        filas.put("Edad ", bean.edad)
        filas.put("Sexo", bean.sexo)
        filas.put("Telefono", bean.tlf)
        filas.put("Correo", bean.mail)
        filas.put("Clave", bean.clave)
        salida=base.insert("tb_paciente","IdPaciente", filas).toInt()


        return salida
    }

    //method for Update Paciente
    fun updatePaciente(bean:Paciente): Int{
        var salida: Int = -1

        //Into the BD in mode write
        val base:SQLiteDatabase = appConfig.BASE.writableDatabase

        //Create obj class ContentValues
        val filas = ContentValues()

        //add claves
        filas.put("Nombre", bean.nombre)
        filas.put("Apellido", bean.apellidos)
        filas.put("DNI", bean.dni)
        filas.put("Edad ", bean.edad)
        filas.put("Sexo", bean.sexo)
        filas.put("Telefono", bean.tlf)
        filas.put("Correo", bean.mail)
        filas.put("Clave", bean.clave)
        salida=base.update("tb_paciente",filas,"IdPaciente=?", arrayOf(bean.codigo.toString()))

        return salida
    }

    //Method for Delete
    fun deletePaciente(cod: Int): Int{
        var salida: Int = -1

        val base: SQLiteDatabase = appConfig.BASE.writableDatabase
        salida = base.delete("tb_paciente","IdPaciente=?", arrayOf(cod.toString()))



        return salida
    }





}