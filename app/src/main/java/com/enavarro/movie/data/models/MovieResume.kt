package com.enavarro.movie.data.models

import com.squareup.moshi.Json

data class MovieResume(
    @field:Json(name = "vote_count") val voteCount: Int = 0,
    @field:Json(name = "id") val id: Int = 0,
    @field:Json(name = "video") val video: Boolean = false,
    @field:Json(name = "vote_average") val voteAverage: Double? = 0.0,
    @field:Json(name = "title") val title: String = "",
    @field:Json(name = "popularity") val popularity: Double? = 0.0,
    @field:Json(name = "poster_path") val posterPath: String = "",
    @field:Json(name = "original_language") val originalLanguage: String = "",
    @field:Json(name = "original_title") val originalTitle: String = "",
    @field:Json(name = "genre_ids") val genreIds: List<Int> = emptyList(),
    @field:Json(name = "backdrop_path") val backdropPath: String = "",
    @field:Json(name = "adult") val adult: Boolean = false,
    @field:Json(name = "overview") val overview: String = "",
    @field:Json(name = "release_date") val releaseDate: String = ""
) {
    var posterUrl: String = ""
}
