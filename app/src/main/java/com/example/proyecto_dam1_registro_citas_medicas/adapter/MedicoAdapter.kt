package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Medico

class MedicoAdapter (val info: ArrayList<Medico>): RecyclerView.Adapter<VistaMedico>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaMedico {

        //inflar activity "item_Medicos"
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad, parent, false )
        return VistaMedico(vista)
    }
    override fun onBindViewHolder(holder: VistaMedico, position: Int) {
        //accessing class attributes VistaEspecialidad
        holder.txtCodigo.text = info.get(position).cod.toString()
        holder.txtNombre.text = info.get(position).nombre
        holder.txtApellido.text = info.get(position).apellido
        holder.txtEspecialidad.text = info.get(position).especialidad.toString()
        holder.txtCid.text = info.get(position).cid

        //Get context form class VistaEspecialidad using parameter holder
        val context: Context = holder.itemView.context

        //Asignando event click to button DETALLE
        holder.btnDetalleMedico.setOnClickListener{
            Toast.makeText(context, "probando", Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return info.size
    }
}