package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.adapter.EspecialidadAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.MedicoAdapter
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloEspecialidad
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloMedico

class MedicoActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var btnAgregarMedico: Button
    private lateinit var rvMedico: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medico)

        rvMedico = findViewById(R.id.rvMedico)

        btnAgregarMedico = findViewById(R.id.btnAgregarMedico)
        //
        btnAgregarMedico.setOnClickListener(this)

        //Create obj from class ArregloEspecialidad
        var obj = ArregloMedico()

        //invoke the method Listado
        var lista = obj.listado()

        //create adaptador
        val adaptador = MedicoAdapter(lista)

        //estyle for RecyclerView
        rvMedico.layoutManager = LinearLayoutManager(this)

        //send the adapter to obj "rvEspecialidad"
        rvMedico.adapter = adaptador

    }

    override fun onClick(v: View?) {
         if (v == btnAgregarMedico) {

            val intent = Intent(this, AgregarMedico::class.java)
            startActivity(intent)

        }
    }

}