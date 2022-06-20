package com.example.proyecto_dam1_registro_citas_medicas.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.ActualizarPacienteActivity
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
        holder.tvApep.text = info.get(position).apellidos
        holder.tvEdadP.text = info.get(position).edad.toString()
        holder.tvSexP.text = info.get(position).sexo

        val context: Context = holder.itemView.context

        //Asignando event click to button DETALLE
        holder.btnDetallesP.setOnClickListener {
            //Toast.makeText(context, "probando", Toast.LENGTH_LONG).show()

            //Create Window Dialog relacionando el contexto actual
            val ventana = AlertDialog.Builder(context)

            //Get obj type View inflate activity "Detalle_paciente.xml"
            val data = LayoutInflater.from(context).inflate(R.layout.detalle_paciente, null )

            //Adicionar into obj Window of View "data"
            ventana.setView(data)
            val dialogo = ventana.create()

            var tvCodPD: TextView = data.findViewById(R.id.tvCodPD)
            var tvNomPD: TextView = data.findViewById(R.id.tvNomPD)
            var tvApePD: TextView = data.findViewById(R.id.tvApePD)
            var tvDniPD: TextView = data.findViewById(R.id.tvDniPD)
            var tvEdadPD: TextView = data.findViewById(R.id.tvEdadPD)
            var tvSexoPD: TextView = data.findViewById(R.id.tvSexoPD)
            var tvFonoPD: TextView = data.findViewById(R.id.tvFonoPD)
            var tvCorreoPD: TextView = data.findViewById(R.id.tvCorreoPD)
            var tvPassPD: TextView = data.findViewById(R.id.tvPassPD)

            tvCodPD.text = info.get(position).codigo.toString()
            tvNomPD.text = info.get(position).nombre
            tvApePD.text = info.get(position).apellidos
            tvDniPD.text = info.get(position).dni
            tvEdadPD.text = info.get(position).edad.toString()
            tvSexoPD.text = info.get(position).sexo
            tvFonoPD.text = info.get(position).tlf
            tvCorreoPD.text = info.get(position).mail
            tvPassPD.text = info.get(position).clave

            //Show dialog
            dialogo.show()
        }

        //Asignando event OnClick for CarView
        holder.itemView.setOnClickListener{

          // Toast.makeText(context,"Todo bien",Toast.LENGTH_LONG).show()
            val intent = Intent(context, ActualizarPacienteActivity:: class.java)
            //Create clave to Almacenar obj from class Paciente
            intent.putExtra("bean", info.get(position))
            ContextCompat.startActivity(context,intent, null)
        }

    }

    override fun getItemCount(): Int {

        return  info.size
    }


}