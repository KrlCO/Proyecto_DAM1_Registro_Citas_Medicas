package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class VistaPaciente(itemView: View): RecyclerView.ViewHolder(itemView) {

    var tvCodP: TextView
    var tvNombreP: TextView
    var tvApep: TextView
    var tvEdadP: TextView
    var tvSexP: TextView
    var btnDetallesP: Button

    init {
        tvCodP = itemView.findViewById(R.id.tvCodP)
        tvNombreP = itemView.findViewById((R.id.tvNombreP))
        tvApep = itemView.findViewById(R.id.tvApeP)

        tvEdadP = itemView.findViewById(R.id.tvEdadP)
        tvSexP = itemView.findViewById(R.id.tvSexP)

        btnDetallesP = itemView.findViewById(R.id.btnDetallesP)

    }
}