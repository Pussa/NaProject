package com.example.naproject.feature.mainMenu.presentation

import android.util.Log
import com.example.naproject.Rocket
import com.example.naproject.domain.GetRocketsUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import moxy.MvpPresenter
import moxy.presenterScope

class MainMenuPresentation(private val getRocketsUseCase: GetRocketsUseCase) :
    MvpPresenter<MainMenuView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showLoading(isShow = true)
        presenterScope.launch(CoroutineExceptionHandler{context,throwable ->
            viewState.showLoading(isShow = false)
            Log.e("tag",throwable.message,throwable)
        }) {

            val rockets = getRocketsUseCase()
            viewState.showRockets(rockets.sort())
            viewState.showLoading(isShow = false)
        }


    }
    fun List<Rocket>.sort(): List<Rocket> = this.sortedBy { it.successPct }


    fun onRocketsClick(rocket: Rocket) {
        viewState.openDetailScreen(rocket)
    }
}

