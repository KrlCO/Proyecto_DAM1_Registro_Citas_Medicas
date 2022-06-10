package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.example.proyecto_dam1_registro_citas_medicas.clase.Especialidad

class EspecialidadAdapter(val info: ArrayList<Especialidad>):RecyclerView.Adapter<VistaEspecialidad>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaEspecialidad {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad, parent, false)
        return VistaEspecialidad(view)
    }

    override fun onBindViewHolder(holder: VistaEspecialidad, position: Int) {
        holder.tvCod.text=info.get(position).codigo.toString()
        holder.tvName.text = info.get(position).nombre
        holder.tvDesc.text = info.get(position).descripcion
    }

    override fun getItemCount(): Int {
        return info.size
    }

}