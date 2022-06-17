package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.google.android.material.internal.NavigationMenuItemView
import com.google.android.material.internal.ToolbarUtils

class VistaEspecialidad(itemView: View): RecyclerView.ViewHolder(itemView) {
    //Attributes

    var tvCodigo: TextView
    var tvNombre: TextView
    var tvDesc: TextView
    var btnDetalle: Button

    //Block for init
    init {

        //references attributes with controls form activity  "item_especialidad"
        tvCodigo = itemView.findViewById(R.id.tvCodigo)
        tvNombre = itemView.findViewById(R.id.tvNombre)
        tvDesc = itemView.findViewById(R.id.tvDesc)
        btnDetalle = itemView.findViewById(R.id.btnDetalle)
    }
}