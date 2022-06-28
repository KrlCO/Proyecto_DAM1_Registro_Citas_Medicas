package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad
import com.example.proyecto_dam1_registro_citas_medicas.R

class CustomerAdptaerEspecialidad (val info:List<Especialidad>): RecyclerView.Adapter<ArregloEspecialidad>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArregloEspecialidad {

        val vista=LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad,parent,false)
        return ArregloEspecialidad(vista)
    }

    override fun onBindViewHolder(holder: ArregloEspecialidad, position: Int) {
        //acceder a los atributos de la clase VistaDocente
        holder.txtCodigoE.text=info.get(position).id.toString()
        holder.txtNombreE.text=info.get(position).nombre
        holder.txtDescE.text=info.get(position).descripcion.toString()
        //obtener context de la clase VistaDocente usando el parámetro holder
        val context: Context =holder.itemView.context

    }
    override fun getItemCount(): Int {
        return info.size
    }
}