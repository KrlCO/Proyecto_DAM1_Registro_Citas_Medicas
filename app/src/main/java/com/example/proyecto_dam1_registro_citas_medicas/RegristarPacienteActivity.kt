package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloPaciente
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Paciente

class RegristarPacienteActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtNombreP: EditText
    private lateinit var edtApellidosP: EditText
    private lateinit var edtDniP: EditText
    private lateinit var edtEdadP:EditText
    private lateinit var spnSexoRP:Spinner
    private lateinit var edtTelefonoP:EditText
    private lateinit var edtCorreoP: EditText
    private lateinit var edtPassP: EditText

    private lateinit var btnGuardarP: Button
    private lateinit var btnRegresarRP:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nuevo_paciente)

        edtNombreP = findViewById(R.id.edtNombrePA)
        edtApellidosP = findViewById(R.id.edtApellidosPA)
        edtDniP = findViewById(R.id.edtDniPA)
        edtEdadP = findViewById(R.id.edtEdadPA)
        spnSexoRP = findViewById(R.id.spnSexoPA)
        edtTelefonoP = findViewById(R.id.edtTelefonoPA)
        edtCorreoP = findViewById(R.id.edtCorreoPA)
        edtPassP = findViewById(R.id.edtPassPA)

        btnGuardarP = findViewById(R.id.btnActualizarPA)
        btnGuardarP.setOnClickListener(this)
        btnRegresarRP = findViewById(R.id.btnRegresarAP)
        btnRegresarRP.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v == btnGuardarP){

        //Readr text boxs
        var nam = edtNombreP.text.toString()
        var ape = edtApellidosP.text.toString()
        var dni = edtDniP.text.toString()
        var ed = edtEdadP.text.toString().toInt()
        var sx = spnSexoRP.selectedItem.toString()
        var tlf = edtTelefonoP.text.toString()
        var mai = edtCorreoP.text.toString()
        var pas = edtPassP.text.toString()

        //Create obj to class Paciente and send to variables
        var bean = Paciente(0, nam, ape,dni, ed, sx, tlf, mai, pas)

        //Invoke method addPaciente
        var salida = ArregloPaciente().addPaciente(bean)

        //Validate output
        if (salida > 0)
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "No se pudo registrar", Toast.LENGTH_SHORT).show()

        }
        else{
            val  intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}