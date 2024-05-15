package com.example.cp3_appmarvel.api

import com.example.cp3_appmarvel.model.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.text.CollationKey

interface ApiService {
    @GET("/characters")
    fun getPopularMovies(@Query("api_key") apiKey: String): Call<CharacterResponse>

}