package com.enavarro.movie.di

import com.enavarro.movie.data.api.MoviedbApi
import com.enavarro.movie.data.repository.HomeRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    fun provideHomeRepository(
        movieApi: MoviedbApi,
        coroutineDispatcher: CoroutineDispatcher
    ): HomeRepository {
        return HomeRepository(movieApi, coroutineDispatcher)
    }

}