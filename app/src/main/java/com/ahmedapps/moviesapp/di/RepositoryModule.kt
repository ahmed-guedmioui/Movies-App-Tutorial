package com.ahmedapps.moviesapp.di

import com.ahmedapps.moviesapp.movieList.data.repository.MovieListRepositoryImpl
import com.ahmedapps.moviesapp.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository

}












