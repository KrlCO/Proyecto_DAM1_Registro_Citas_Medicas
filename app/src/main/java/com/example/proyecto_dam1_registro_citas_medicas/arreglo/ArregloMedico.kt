package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.content.ContentValues
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Medico
import com.example.proyecto_dam1_registro_citas_medicas.util.appConfig

class ArregloMedico {
    fun listado(): ArrayList<Medico>{
        var data = ArrayList<Medico>()
        var base = appConfig.BASE.readableDatabase
        var sql = "select * from tb_medicos"
        var rs = base.rawQuery(sql, null)
        while (rs.moveToNext()){
            var bean = Medico(rs.getInt(0), rs.getString(1), rs.getString(2),
                rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),
            rs.getString(7), rs.getString(8))
            data.add(bean)
        }
        return data
    }

    fun adicionar(bean: Medico): Int{
        var salida: Int = -1
        var base = appConfig.BASE.writableDatabase
        var claves = ContentValues()
        claves.put("medi_nombre", bean.nombre)
        claves.put("medi_apellido", bean.apellido)
        claves.put("esp_id", bean.especialidad)
        claves.put("medi_direccion", bean.direccion)
        claves.put("medi_correo", bean.correo)
        claves.put("medi_telefono", bean.telefono)
        claves.put("medi_sexo", bean.sexo)
        claves.put("medi_cid", bean.cid)
        salida = base.insert("tb_medicos", "esp_id", claves).toInt()

        return salida
    }
}