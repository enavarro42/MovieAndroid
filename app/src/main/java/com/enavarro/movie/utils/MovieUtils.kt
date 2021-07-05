package com.enavarro.movie.utils

import com.enavarro.movie.utils.Constants.LANGUAGE_EN
import com.enavarro.movie.utils.Constants.LANGUAGE_ES
import java.util.*

object MovieUtils {
    fun getLanguage(): String {
        val language = Locale.getDefault().language
        return when (language) {
            "es" -> LANGUAGE_ES
            "en" -> LANGUAGE_EN
            else -> LANGUAGE_EN
        }
    }
}