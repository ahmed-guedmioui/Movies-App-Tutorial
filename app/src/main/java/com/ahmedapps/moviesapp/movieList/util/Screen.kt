package com.ahmedapps.moviesapp.movieList.util

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
sealed class Screen(val rout: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
}
