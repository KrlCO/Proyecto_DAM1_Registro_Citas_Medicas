package com.example.proyecto_dam1_registro_citas_medicas.utils

import com.example.proyecto_dam1_registro_citas_medicas.api.ApiServer


class ApiUtils {

    companion object {
        val BASE_URL="https://medicamento-api.herokuapp.com"
        //https://modelo-cl3.herokuapp.com/medicamento/lista
        fun getAPIService(): ApiServer {
            return RetrofitClient.getClient(BASE_URL).create(ApiServer::class.java)
        }
    }
}