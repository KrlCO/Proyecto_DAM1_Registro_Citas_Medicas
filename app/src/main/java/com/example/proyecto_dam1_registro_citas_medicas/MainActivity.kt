package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.adapter.CitaAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.EspecialidadAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.PacienteAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.VistaPaciente
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloCita
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloEspecialidad
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloPaciente

class MainActivity : AppCompatActivity() {

    private lateinit var rvEspecialidad: RecyclerView
    private  lateinit var  rvPaciente: RecyclerView
    private lateinit var rvCita: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvEspecialidad = findViewById(R.id.rvEspecialidad)
        rvPaciente = findViewById(R.id.rvPaciente)
        rvCita = findViewById(R.id.rvCita)


        //Create obj from class ArregloEspecialidad
        var obj = ArregloEspecialidad()
        var pa = ArregloPaciente()
        var ci = ArregloCita()

        //invoke the method Listado
        var lista = obj.listado()
        var listap = pa.listado()
        var listadoc = ci.listado()

        //create adaptador
        val adaptador = EspecialidadAdapter(lista)
        val adaptadorp = PacienteAdapter(listap)
        val adaptadorc = CitaAdapter(listadoc)

        //estyle for RecyclerView
        rvEspecialidad.layoutManager = LinearLayoutManager(this)
        rvPaciente.layoutManager = LinearLayoutManager(this)
        rvCita.layoutManager = LinearLayoutManager(this)

        //send the adapter to obj "rvEspecialidad"
        rvEspecialidad.adapter = adaptador
        rvPaciente.adapter = adaptadorp
        rvCita.adapter = adaptadorc

        /*val intent = Intent(this, ActualizarActivity::class.java)
        startActivity(intent)*/
    }
}