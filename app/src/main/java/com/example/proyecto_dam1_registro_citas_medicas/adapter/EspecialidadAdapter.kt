package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad

class EspecialidadAdapter(val info: ArrayList<Especialidad>):RecyclerView.Adapter<VistaEspecialidad>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaEspecialidad {

        //inflar activity "item_especialidad"
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad, parent, false)
        return VistaEspecialidad(view)
    }

    override fun onBindViewHolder(holder: VistaEspecialidad, position: Int) {

        //accessing class attributes VistaEspecialidad
        holder.tvCodigo.text = info.get(position).codigo.toString()
        holder.tvNombre.text = info.get(position).nombre
        holder.tvDesc.text = info.get(position).descripcion
    }

    override fun getItemCount(): Int {
        return info.size
    }

}