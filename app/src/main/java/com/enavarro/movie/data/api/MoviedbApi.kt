package com.enavarro.movie.data.api

import com.enavarro.movie.data.models.MovieDetail
import com.enavarro.movie.data.models.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val UNCOMING_MOVIE = "movie/upcoming"
private const val MOVIE_DETAIL = "movie/{movie_id}"

interface MoviedbApi {

    @GET(UNCOMING_MOVIE)
    suspend fun getUncomingMovies(
        @Query("language") language: String?,
        @Query("page") page: Int?
    ): MoviesResponse

    @GET(MOVIE_DETAIL)
    suspend fun getMovieDetail(@Path("movie_id") movieId: Int?): MovieDetail

}