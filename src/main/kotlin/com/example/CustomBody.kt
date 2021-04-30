package com.example

import io.micronaut.core.bind.annotation.Bindable

/**
 * Custom body
 *
 * @author Coder Yellow
 * @since 0.1.0
 */
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Bindable
annotation class CustomBody
