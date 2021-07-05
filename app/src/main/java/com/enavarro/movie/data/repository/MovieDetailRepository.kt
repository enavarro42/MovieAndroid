package com.enavarro.movie.data.repository

import com.enavarro.movie.data.api.MoviedbApi
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class MovieDetailRepository @Inject constructor(
    movieApi: MoviedbApi,
    coroutineDispatcher: CoroutineDispatcher
) {

}