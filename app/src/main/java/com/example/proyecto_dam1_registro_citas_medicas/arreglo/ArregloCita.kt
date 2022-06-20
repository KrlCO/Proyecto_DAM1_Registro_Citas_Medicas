package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import com.example.proyecto_dam1_registro_citas_medicas.entidad.Cita
import java.time.LocalDate

class ArregloCita {

    fun listado(): ArrayList<Cita>{

        var data = ArrayList<Cita>()

        data.add(Cita(1,2,1,"Jorge","Ugarte",
            "12/7/2020","10am","El consultorio de atencion es  403" ))

        data.add(Cita(2,1,2,"Luis","Bazalar",
            "24/7/2020","10am","El consultorio de atencion es  81" ))

        return data
    }


}