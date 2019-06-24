package com.gianmarcodavid.eitherifyexample

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import io.reactivex.Single

fun <T> Single<T>.eitherify(): Single<Either<Throwable, T>> =
    map<Either<Throwable, T>> { it.right() }
        .onErrorReturn { it.left() }

fun <T> Single<T>.resultify(): Single<Result<T>> =
    map<Result<T>> { Result.Success(it) }
        .onErrorReturn { Result.Error(it) }