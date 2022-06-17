package com.example.proyecto_dam1_registro_citas_medicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.adapter.EspecialidadAdapter
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloEspecialidad

class MainActivity : AppCompatActivity() {

    private lateinit var rvEspecialidad: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvEspecialidad = findViewById(R.id.rvEspecialidad)

        //Create obj from class ArregloEspecialidad
        var obj = ArregloEspecialidad()

        //invoke the method Listado
        var lista = obj.listado()

        //create adaptador
        var adaptador = EspecialidadAdapter(lista)

        //estyle for RecyclerView
        rvEspecialidad.layoutManager = LinearLayoutManager(this)

        //send the adapter to obj "rvEspecialidad"
        rvEspecialidad.adapter
    }
}