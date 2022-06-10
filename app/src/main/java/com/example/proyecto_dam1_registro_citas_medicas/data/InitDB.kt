package com.example.proyecto_dam1_registro_citas_medicas.data

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.proyecto_dam1_registro_citas_medicas.util.AppConfig

class InitDB: SQLiteOpenHelper(AppConfig.CONTEXT, AppConfig.BASE, null, AppConfig.VERSION) {

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL("create table tb_especialidad(" +
                "esp_id integer primary key autoincrement,"+
                "esp_nombre varchar (120),"+
                "esp_desc varchar (160))");

        db.execSQL("insert into tb_especialidad values(null,'Otorinolaringologia', " +
                "'Horaio atencion L-V de 8:00am-5:00pm')")

        /*db.execSQL("create table tb_medico(" +
                "medi_id integer primary key autoincrement,"+
                "medi_nombre varchar (120),"+
                "medi_apellido varchar (120),"+
                "esp_id int," +
                "medi_direccion varchar(120),"+
                "medi_telefonno char(9),"+
                "medi_cid varchar (40)");

        db.execSQL("insert into tb_medico values(null,'')")*/

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}