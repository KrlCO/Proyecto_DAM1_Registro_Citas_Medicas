package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class VistaEspecialidad(item: View): RecyclerView.ViewHolder(item) {
    var tvCod : TextView
    var tvName: TextView
    var tvDesc: TextView

    init {
        tvCod = item.findViewById(R.id.tvCod)
        tvName = item.findViewById(R.id.tvName)
        tvDesc = item.findViewById(R.id.tvDesc)
    }
}