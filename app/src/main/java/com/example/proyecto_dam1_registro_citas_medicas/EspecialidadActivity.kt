package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.api.ApiServer
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.CustomerAdptaerEspecialidad
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad
import com.example.proyecto_dam1_registro_citas_medicas.utils.ApiUtils
import com.example.proyecto_dam1_registro_citas_medicas.utils.AppConfiguration
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EspecialidadActivity : AppCompatActivity(), View.OnClickListener  {

    lateinit var btnAgregar: Button
    lateinit var btnConsultar: Button
    lateinit var rvposMedicamento: RecyclerView
    private  lateinit var api: ApiServer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_especialidad)

        rvposMedicamento=findViewById(R.id.rgvEspecialista)

        btnAgregar=findViewById(R.id.btnAgregar)
        btnConsultar=findViewById(R.id.btnConsultarEspecialidad)

        btnAgregar.setOnClickListener(this)
        btnConsultar.setOnClickListener(this)

        api= ApiUtils.getAPIService()

        listarEspecialidad()

    }

    override fun onClick(v: View?) {
        if(v==btnAgregar){
            var intent= Intent(this,RegistrarEspecialidadActivity::class.java)
            startActivity(intent)
        }else{
            val intent= Intent(this,ConsultaEspecialidad::class.java)
            startActivity(intent)
        }
    }

    fun listarEspecialidad(){
        api.listarEspecialidad().enqueue(object: Callback<List<Especialidad>> {
            override fun onResponse(call: Call<List<Especialidad>>, response: Response<List<Especialidad>>) {

                var lista=response.body()

                val adaptador=CustomerAdptaerEspecialidad(lista!!)

                rvposMedicamento.layoutManager= LinearLayoutManager(AppConfiguration.CONTEXT)

                rvposMedicamento.adapter=adaptador
            }

            override fun onFailure(call: Call<List<Especialidad>>, t: Throwable) {
                Log.d("Error ",t.message!!)
            }
        })
    }

}