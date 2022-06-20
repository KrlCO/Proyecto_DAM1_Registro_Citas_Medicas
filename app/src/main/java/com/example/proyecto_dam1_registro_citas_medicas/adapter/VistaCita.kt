package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class VistaCita(itemView: View):RecyclerView.ViewHolder(itemView) {

    var tvCodC: TextView
    var tvEspc: TextView
    var tvMedicoC: TextView
    var tvCodPC: TextView
    var btnDetalleC:Button

    init {
        tvCodC = itemView.findViewById(R.id.tvCodC)
        tvEspc = itemView.findViewById(R.id.tvEspC)
        tvMedicoC = itemView.findViewById(R.id.tvMedicoC)
        tvCodPC = itemView.findViewById(R.id.tvCodPC)


        btnDetalleC = itemView.findViewById(R.id.btnDetalleC)
    }
}