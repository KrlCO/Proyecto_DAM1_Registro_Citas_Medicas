package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad

class ArregloEspecialidad {

    fun listado(): ArrayList<Especialidad>{
        var data = ArrayList<Especialidad>()
        data.add(Especialidad(1,"Otorrinolaringologia", "Horario de atención L-V de 8:00am-5:00pm"))
        data.add(Especialidad(2,"Terapia y rehabilitación fisica", "Horario de atención L-V de 8:00am-5:00pm"))
        data.add(Especialidad(3,"Cardiologia", "Horario de atención L-V de 8:00am-5:00pm"))
       /*var base = AppConfig.BD.readableDatabase
        var sql = "select * from tb_especialidad"
        var rs = base.rawQuery(sql, null)
        while (rs.moveToNext()){
            var bean = Especialidad(rs.getInt(0), rs.getString(1), rs.getString(2))
            data.add(bean)
        }*/
        return data
    }

//    fun adicionar(bean:Especialidad): Int{
//        var salida: Int = -1
//        var base = AppConfig.BD.writableDatabase
//        var claves = ContentValues()
//        claves.put("esp_nombre", bean.nombre)
//        claves.put("esp_desc", bean.descripcion)
//        salida = base.insert("tb_especialidad", "esp_id", claves).toInt()
//
//        return salida
//
//    }
}