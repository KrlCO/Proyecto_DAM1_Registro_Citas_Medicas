package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_dam1_registro_citas_medicas.adapter.EspecialidadAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.PacienteAdapter
import com.example.proyecto_dam1_registro_citas_medicas.adapter.VistaPaciente
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloEspecialidad
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloPaciente
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente

class ActualizarPacienteActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var tvCodPA : TextView
    lateinit var edtNombrePA: EditText
    lateinit var edtApellidosPA: EditText
    lateinit var edtDniPA: EditText
    lateinit var edtEdadPA:EditText
    lateinit var spnSexoPA: Spinner
    lateinit var edtTelefonoPA: EditText
    lateinit var edtCorreoPA: EditText
    lateinit var edtPassPA: EditText

    lateinit var btnActualizarPA: Button
    lateinit var btnEliminarPA: Button
    lateinit var btnRegresarAP: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actualizar_paciente)

        tvCodPA = findViewById(R.id.tvCodPA)
        edtNombrePA = findViewById(R.id.edtNombrePA)
        edtApellidosPA = findViewById(R.id.edtApellidosPA)
        edtDniPA = findViewById(R.id.edtDniPA)
        edtEdadPA = findViewById(R.id.edtEdadPA)
        spnSexoPA = findViewById(R.id.spnSexoPA)
        edtTelefonoPA = findViewById(R.id.edtTelefonoPA)
        edtCorreoPA = findViewById(R.id.edtCorreoPA)
        edtPassPA = findViewById(R.id.edtPassPA)

        btnActualizarPA = findViewById(R.id.btnActualizarPA)
        btnActualizarPA.setOnClickListener(this)
        btnEliminarPA = findViewById(R.id.btnEliminarPA)
        btnEliminarPA.setOnClickListener(this)
        btnRegresarAP = findViewById(R.id.btnRegresarAP)
        btnRegresarAP.setOnClickListener(this)

        //
        datos()

    }

    override fun onClick(v: View?) {

        if (v ===btnActualizarPA){

            var cod = tvCodPA.text.toString().toInt()
            var nam = edtNombrePA.text.toString()
            var ape = edtApellidosPA.text.toString()
            var dni = edtDniPA.text.toString()
            var ed = edtEdadPA.text.toString().toInt()
            var sx = spnSexoPA.selectedItem.toString()
            var tlf = edtTelefonoPA.text.toString()
            var mai = edtCorreoPA.text.toString()
            var pas = edtPassPA.text.toString()

            //Create obj to class Paciente and send to variables
            var bean = Paciente(cod, nam, ape,dni, ed, sx, tlf, mai, pas)

            //Invoke method addPaciente
            var salida = ArregloPaciente().updatePaciente(bean)

            //Validate output
            if (salida > 0)
                Toast.makeText(this, "Paciente Actualizados", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No se Actualizo Paciente", Toast.LENGTH_SHORT).show()

        }else if (v === btnEliminarPA){

            //Invoke method DELETE
            var salida = ArregloPaciente().deletePaciente(tvCodPA.text.toString().toInt())

            //Validate output
            if (salida > 0)
                Toast.makeText(this, "Paciente Borrado", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No se Borrar Paciente", Toast.LENGTH_SHORT).show()


        }else if (v === btnRegresarAP){

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }

    fun datos(){

        //Get of clave "bean deserealizar
        val data = intent.getSerializableExtra("bean") as Paciente

        tvCodPA.setText(data.codigo.toString())
        edtNombrePA.setText(data.nombre)
        edtApellidosPA.setText(data.apellidos)
        edtDniPA.setText(data.dni)
        edtEdadPA.setText(data.edad.toString())
        //spnSexoPA.
        //variable para almacenar sexo actual de Paciente
        var sexo = data.sexo
        //Obtener datos del adaptador de Spinner "spSexoPA
        val adapter = spnSexoPA.adapter // adapter ===> (0)

        var posSexo = -1
        for (x in 0 until adapter.count){
            if(adapter.getItem(x).equals(sexo))
                posSexo = x
        }

        //show Spinner "spnSexoPA"
        spnSexoPA.setSelection(posSexo)
        edtTelefonoPA.setText(data.tlf)
        edtCorreoPA.setText(data.mail)
        edtPassPA.setText(data.clave)

    }


}