package com.example.proyecto_dam1_registro_citas_medicas.arreglo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R

class ArregloEspecialidad(itemView: View): RecyclerView.ViewHolder(itemView)  {

    var txtCodigoE: TextView
    var txtNombreE: TextView
    var txtDescE: TextView

    init {
        txtCodigoE=itemView.findViewById(R.id.txtCodigoE)
        txtNombreE=itemView.findViewById(R.id.txtNombreE)
        txtDescE=itemView.findViewById(R.id.txtDescE)
    }

}