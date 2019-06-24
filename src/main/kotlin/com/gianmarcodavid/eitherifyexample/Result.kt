package com.gianmarcodavid.eitherifyexample

sealed class Result<T> {
    data class Success<T>(val item: T) : Result<T>()
    data class Error<T>(val throwable: Throwable) : Result<T>()
}