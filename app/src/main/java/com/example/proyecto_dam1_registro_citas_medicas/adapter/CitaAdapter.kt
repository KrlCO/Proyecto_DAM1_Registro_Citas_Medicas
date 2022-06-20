package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.R
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Cita

class CitaAdapter(val info: ArrayList<Cita>):RecyclerView.Adapter<VistaCita>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaCita {
        val  vista = LayoutInflater.from(parent.context).inflate(R.layout.item_cita, parent, false)
        return  VistaCita(vista)
    }

    override fun onBindViewHolder(holder: VistaCita, position: Int) {
        holder.tvCodC.text = info.get(position).codigo.toString()
        holder.tvEspc.text = info.get(position).esp.toString()
        holder.tvMedicoC.text = info.get(position).doctor.toString()
        holder.tvNomC.text = info.get(position).nombrep.toString()
        holder.tvApeC.text = info.get(position).apellidop

        val context: Context = holder.itemView.context

        holder.btnDetalleC.setOnClickListener{

            val ventana = AlertDialog.Builder(context)

            val data = LayoutInflater.from(context).inflate(R.layout.detalle_cita, null)

            ventana.setView(data)
            val dialog = ventana.create()

            var tvCodCD: TextView = data.findViewById(R.id.tvCodCD)
            var tvEspCD: TextView = data.findViewById(R.id.tvEspCD)
            var tvMedicoCD: TextView = data.findViewById(R.id.tvMedicoCD)
            var tvNomCD: TextView = data.findViewById(R.id.tvNomCD)
            var tvApeCD: TextView = data.findViewById(R.id.tvApeCD)
            var tvFechaCD: TextView = data.findViewById(R.id.tvFechaCD)
            var tvHoraCD: TextView = data.findViewById(R.id.tvHoraCD)
            var tvDescCD: TextView = data.findViewById(R.id.tvDescCD)

            tvCodCD.text = info.get(position).codigo.toString()
            tvEspCD.text = info.get(position).esp.toString()
            tvMedicoCD.text = info.get(position).doctor.toString()
            tvNomCD.text = info.get(position).nombrep
            tvApeCD.text = info.get(position).apellidop
            tvFechaCD.text = info.get(position).fecha
            tvHoraCD.text = info.get(position).hora
            tvDescCD.text = info.get(position).descripcion

            dialog.show()


        }
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Funciona!", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
       return  info.size
    }


}