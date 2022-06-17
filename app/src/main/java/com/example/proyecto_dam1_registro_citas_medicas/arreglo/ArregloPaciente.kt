package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente


class ArregloPaciente{

    fun listado(): ArrayList<Paciente>{

        var data = ArrayList<Paciente>()
        data.add(Paciente(1,"Adrian","Smith","87987654", 67,"M",987780454,"dafasdef@gmail.com","123456"))

        data.add(Paciente(2,"Anahi","Salgado","98457623", 30,"F",999678083,"dafasdef@gmail.com","123456"))
        data.add(Paciente(3,"Grecia","Torres","45768943", 26,"F",967856345,"dafasdef@gmail.com","123456"))

        return data

    }
}