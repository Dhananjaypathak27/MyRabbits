package com.inxparticle.myapplication.data

import retrofit2.http.GET

interface RabbitsApi {

    companion object{
        const val BASE_URL = "http://192.168.29.112:8080"
    }

    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit
}