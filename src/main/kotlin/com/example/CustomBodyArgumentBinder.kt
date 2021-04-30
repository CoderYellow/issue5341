package com.example

import io.micronaut.core.bind.ArgumentBinder
import io.micronaut.core.convert.ArgumentConversionContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.bind.binders.AnnotatedRequestArgumentBinder
import io.micronaut.http.server.exceptions.HttpServerException
import java.util.*
import javax.inject.Singleton

/**
 * Custom Argument Binder
 *
 * @author Coder Yellow
 * @since 0.1.0
 */
@Singleton
class CustomBodyArgumentBinder: AnnotatedRequestArgumentBinder<CustomBody,Any> {

    override fun bind(
        context: ArgumentConversionContext<Any>?,
        source: HttpRequest<*>?
    ): ArgumentBinder.BindingResult<Any> {
        val body = source!!.getBody(String::class.java).orElseThrow {
            HttpServerException("Http body is empty")
        }
        return ArgumentBinder.BindingResult {
            Optional.of("Custom Body:$body")
        }
    }

    override fun getAnnotationType(): Class<CustomBody> {
        return CustomBody::class.java
    }
}