package com.ahmedapps.moviesapp.movieList.presentaion

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
sealed interface MovieListUiEvent {
    data class Paginate(val category: String) : MovieListUiEvent
    object Navigate : MovieListUiEvent
}