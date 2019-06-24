package com.gianmarcodavid.eitherifyexample

import com.gianmarcodavid.eitherifyexample.api.BoredApiFactory
import com.gianmarcodavid.eitherifyexample.api.BoredResponse

fun main() {

    val api = BoredApiFactory.makeApi()

    // Using Either
    api.activity()
        .eitherify()
        .subscribe { either -> either.fold(::onError, ::onSuccess) }

    // Using a custom Result class
    api.activity()
        .resultify()
        .subscribe { result ->
            when (result) {
                is Result.Success -> onSuccess(result.item)
                is Result.Error -> onError(result.throwable)
            }
        }
}

private fun onError(throwable: Throwable) {
    println("We got an error :(")
    println(throwable)
}

private fun onSuccess(response: BoredResponse) {
    println("We got a response :)")
    println(response)
}