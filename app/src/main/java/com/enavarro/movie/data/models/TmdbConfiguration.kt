package com.enavarro.movie.data.models

import com.squareup.moshi.Json

data class TmdbConfiguration(
    @field:Json(name = "images") var images: Images? = null,
    @field:Json(name = "change_keys") var changeKeys: List<String>? = null
)