package com.example.proyecto_dam1_registro_citas_medicas.api

import com.example.proyecto_dam1_registro_citas_medicas.entidad.Especialidad
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServer {
    @POST("/medicamento/registrar")
    fun saveEspecialidad(@Body bean:Especialidad): Call<Void>
    @GET("/medicamento/buscar/{codigo}")
    fun findEspecialidad(@Path("codigo") cod:Int): Call<Especialidad>
    @GET("/medicamento/lista")
    fun listarEspecialidad(): Call<List<Especialidad>>
}