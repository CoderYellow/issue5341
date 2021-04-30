package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

/**
 * Controller
 *
 * @author Coder Yellow
 * @since 0.1.0
 */
@Controller
class Controller {

    @Post("/custom/body")
    fun customBody(@CustomBody body: String): String {
        return body
    }
}