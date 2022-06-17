package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente

class PacienteAdapter(val info: ArrayList<Paciente>): RecyclerView.Adapter<VistaPaciente>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaPaciente {

        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_paciente, parent, false)
        return  VistaPaciente(vista)
    }

    override fun onBindViewHolder(holder: VistaPaciente, position: Int) {

        holder.tvCodP.text = info.get(position).codigo.toString()
        holder.tvNombreP.text = info.get(position).nombre
        holder.tvApep.text = info.get(position).codigo.toString()
        holder.tvDniP.text = info.get(position).nombre
        holder.tvEdadP.text = info.get(position).codigo.toString()
        holder.tvSexP.text = info.get(position).nombre
        holder.tvFonoP.text = info.get(position).codigo.toString()
        holder.tvMailP.text = info.get(position).nombre
        holder.tvPassP.text = info.get(position).nombre


    }

    override fun getItemCount(): Int {

        return  info.size
    }


}