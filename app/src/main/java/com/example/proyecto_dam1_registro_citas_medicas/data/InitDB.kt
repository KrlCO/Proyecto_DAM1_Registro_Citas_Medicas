package com.example.proyecto_dam1_registro_citas_medicas.data

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig

class InitDB: SQLiteOpenHelper(appConfig.CONTEXT, appConfig.DB, null, appConfig.VERSION) {

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL("create table tb_especialidad(" +
                "IdEsp Integer primary key autoincrement,"+
                "esp_nom varchar (120),"+
                "esp_desc varchar (160))")

        db.execSQL("insert into tb_especialidad values(null,'Otorinolaringologia','Horaio atencion L-V de 8:00am-5:00pm')")
        db.execSQL("insert into tb_especialidad values(null,'Rehabilitación y Terapia fisica','Horaio atencion L-V de 8:00am-5:00pm')")

        db.execSQL("create table tb_paciente(" +
                "IdPaciente Integer primary key autoincrement,"+
                "Nombre varchar (120),"+
                "Apellido varchar (120),"+
                "DNI char (8),"+
                "Edad Integer,"+
                "Sexo char(2),"+
                "Telefono char(9),"+
                "Correo varchar (120),"+
                "Clave varchar (160))")

        db.execSQL("insert into tb_paciente values(null,'Karen','Mendoza Lozano', '98677854', 30, 'F', '987534256', 'efafsfaef@gmail.com', "+
                "'12345')")
        db.execSQL("insert into tb_paciente values(null,'Emma','Magnolia', '58677854', 28, 'F', '9086453567', 'zsdads@gmail.com', "+
                "'12345')")

        db.execSQL("create table tb_medico(" +
                "IdMedico Integer primary key autoincrement,"+
                "Nombre varchar (120),"+
                "Apellido varchar (120),"+
                "IdEsp Integer references tb_especialidad(IdEsp),"+
                "Direccion varchar(120)," +
                "Correo varchar(120),"+
                "Telefono char(9),"+
                "sexo varchar (120),"+
                "cid varchar (40))")

        db.execSQL("insert into tb_medico values(null,'Isabella', " +
                "'Ramirez Cortez', 2,'Jr. Jacarandas 169', 'isara@gmail.com', '977534276', 'F', 'CMP4353623')")
        db.execSQL("insert into tb_medico values(null,'Adriana', " +
                "'Marquez Rodriguez', 1,'Jr. Los Condores 345', 'adrimaa@gmail.com', '969534276', 'F', 'CMP5453434')")

    /*    db.execSQL("create table tb_cita(" +
                "IdCita Integer primary key autoincrement,"+
                "IdEsp Integer references tb_especialidad(IdEsp),"+
                "IdMedico Integer references tb_medico(IdMedico),"+
                "IdPaciente Integer references tb_paciente(IdPaciente),"+
                "Fecha varchar(100),"+
                "Hora varchar(100),"+
                "Descripcion varchar (160))");


        db.execSQL("insert into tb_cita values(null, 2, 1, 2," +
                "'21/', 2,'Jr. Jacarandas 169', 'isara@gmail.com', '977534276', 'F', 'CMP4353623')")
        db.execSQL("insert into tb_medico values(null,'Adriana', " +
                "'Marquez Rodriguez', 1,'Jr. Los Condores 345', 'adrimaa@gmail.com', '969534276', 'F', 'CMP5453434')")*/

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}