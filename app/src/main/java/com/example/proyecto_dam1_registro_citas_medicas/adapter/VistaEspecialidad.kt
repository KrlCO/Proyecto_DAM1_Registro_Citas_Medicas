package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class VistaEspecialidad(itemView: View): RecyclerView.ViewHolder(itemView) {
    //Attributes

    var tvCodigo: TextView
    var tvNombre: TextView
    var tvDesc: TextView
    var btnDetalle: Button

    //Block for init
    init {

        //references attributes with controls form activity  "item_especialidad"
        tvCodigo = itemView.findViewById(R.id.txtCodigoE)
        tvNombre = itemView.findViewById(R.id.txtNombreE)
        tvDesc = itemView.findViewById(R.id.txtDescE)
        btnDetalle = itemView.findViewById(R.id.btnDetalleE)
    }
}