package com.enavarro.movie.data.models

import com.squareup.moshi.Json

data class Images(
    @field:Json(name = "base_url") var baseUrl: String?,
    @field:Json(name = "secure_base_url") var secureBaseUrl: String?,
    @field:Json(name = "backdrop_sizes") var backdropSizes: List<String>?,
    @field:Json(name = "logo_sizes") var logoSizes: List<String>?,
    @field:Json(name = "poster_sizes") var posterSizes: List<String>?,
    @field:Json(name = "profile_sizes") var profileSizes: List<String>?,
    @field:Json(name = "still_sizes") var stillSizes: List<String>?
)