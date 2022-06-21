package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_dam1_registro_citas_medicas.arreglo.ArregloCita
import com.example.proyecto_dam1_registro_citas_medicas.entidad.Cita
import java.util.zip.CRC32

class RegistrarCitaActivity: AppCompatActivity(), View.OnClickListener {

    private lateinit var edtEspCR: EditText
    private lateinit var edtMedCR: EditText
    private lateinit var edtPacienteCR: EditText
    private lateinit var edtFechaCR: EditText
    private lateinit var edtHoraCR: EditText
    private lateinit var edtDescCR: EditText

    private lateinit var btnSaveCR: Button
    private lateinit var btnBackCR: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.nuevo_cita)

        edtEspCR = findViewById(R.id.edtEspCR)
        edtMedCR = findViewById(R.id.edtMedCR)
        edtPacienteCR = findViewById(R.id.edtPacienteCR)
        edtFechaCR = findViewById(R.id.edtFechaCR)
        edtHoraCR = findViewById(R.id.edtHoraCR)
        edtDescCR = findViewById(R.id.edtDescCR)

        btnSaveCR = findViewById(R.id.btnSaveCR)
        btnSaveCR.setOnClickListener(this)
        btnBackCR = findViewById(R.id.btnBackCR)
        btnBackCR.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        if (v == btnSaveCR){

            var esp = edtEspCR.text.toString().toInt()
            var med = edtMedCR.text.toString().toInt()
            var pac = edtPacienteCR.toString().toInt()
            var fc = edtFechaCR.toString()
            var hh = edtHoraCR.toString()
            var des = edtDescCR.toString()

            var bean = Cita(0, esp,med,pac,fc,hh,des)

            var salida = ArregloCita().addCita(bean)

            if (salida > 0)
                Toast.makeText(this,"Cita Generada", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Error al Crear",Toast.LENGTH_SHORT).show()


        }else if (v == btnBackCR){

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}