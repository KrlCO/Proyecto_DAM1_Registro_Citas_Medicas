package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad

class ArregloEspecialidad {

    fun listado(): ArrayList<Especialidad>{
        var data = ArrayList<Especialidad>()

        data.add(Especialidad(1,"Otorrinolaringologia", "Horario de atención L-V de 8:00am-5:00pm"))

        data.add(Especialidad(2,"Terapia y rehabilitación fisica", "Horario de atención L-V de 8:00am-5:00pm"))

        data.add(Especialidad(3,"Cardiologia", "Horario de atención L-V de 8:00am-5:00pm"))

        return data
    }

}