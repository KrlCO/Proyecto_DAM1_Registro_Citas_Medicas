package com.example.proyecto_dam1_registro_citas_medicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnICita: Button
    private lateinit var btnIPaciente: Button
    private lateinit var btnIMedico: Button
    private lateinit var btnIEspec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnICita = findViewById(R.id.btnICita)
        btnICita.setOnClickListener(this)
        btnIMedico = findViewById(R.id.btnIMedico)
        btnIMedico.setOnClickListener(this)
        btnIEspec = findViewById(R.id.btnIEspec)
        btnIEspec.setOnClickListener(this)
        btnIPaciente = findViewById(R.id.btnIPaciente)
        btnIPaciente.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v == btnICita){
            val inten = Intent(this, RegistrarCitaActivity::class.java)
            startActivity(inten)


        }
    }
}