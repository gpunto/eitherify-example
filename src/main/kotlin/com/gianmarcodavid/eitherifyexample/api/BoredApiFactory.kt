package com.gianmarcodavid.eitherifyexample.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

internal object BoredApiFactory {

    private const val BORED_BASE_URL = "https://www.boredapi.com/api/"

    fun makeApi(): BoredApi = Retrofit.Builder()
        .baseUrl(BORED_BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(BoredApi::class.java)
}