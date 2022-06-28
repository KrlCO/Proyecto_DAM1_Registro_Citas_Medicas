package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class VistaMedico(itemView: View): RecyclerView.ViewHolder(itemView) {

    var txtCodigo: TextView
    var txtNombre: TextView
    var txtApellido: TextView
    var txtEspecialidad: TextView
    var txtCid: TextView
    var btnDetalleMedico: Button

    init {
        txtCodigo = itemView.findViewById(R.id.txtCodigo)
        txtNombre = itemView.findViewById((R.id.txtNombre))
        txtApellido = itemView.findViewById(R.id.txtApellido)

        txtEspecialidad = itemView.findViewById(R.id.txtEspecialidad)
        txtCid = itemView.findViewById(R.id.txtCid)

        btnDetalleMedico = itemView.findViewById(R.id.btnAgregarMedico)

    }

}