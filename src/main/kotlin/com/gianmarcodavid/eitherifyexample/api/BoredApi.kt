package com.gianmarcodavid.eitherifyexample.api

import io.reactivex.Single
import retrofit2.http.GET

interface BoredApi {

    @GET("activity")
    fun activity(): Single<BoredResponse>
}