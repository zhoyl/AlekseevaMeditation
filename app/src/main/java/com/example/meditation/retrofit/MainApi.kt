package com.example.meditation.retrofit

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface MainApi {
    @POST("auth/login")
    suspend fun auth(@Body authRequest: AuthRequest): Response<User>
}