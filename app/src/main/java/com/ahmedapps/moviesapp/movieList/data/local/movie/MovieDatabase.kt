package com.ahmedapps.moviesapp.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}