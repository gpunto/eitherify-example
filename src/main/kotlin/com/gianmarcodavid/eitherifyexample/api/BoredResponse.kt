package com.gianmarcodavid.eitherifyexample.api

data class BoredResponse(
    val activity: String,
    val accessibility: Float,
    val type: String,
    val participants: Int,
    val price: Float,
    val link: String
)