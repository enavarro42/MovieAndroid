package com.enavarro.movie.data.models

import com.squareup.moshi.Json

data class MoviesResponse(
    @field:Json(name = "page") val page: Int = 0,
    @field:Json(name = "total_results") val totalResults: Int = 0,
    @field:Json(name = "total_pages") val totalPages: Int = 0,
    @field:Json(name = "results") val results: List<MovieResume> = emptyList()
)