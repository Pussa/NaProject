package com.example.naproject.feature.mainMenu.presentation

import com.example.naproject.Rocket
import moxy.MvpPresenter

class MainMenuPresentation : MvpPresenter<MainMenuView>() {

    private var rockets : List<Rocket> = listOf(
        Rocket("Falcon 1", "1"),
        Rocket("Falcon 2", "2"),
        Rocket("Falcon 9", "9"),
        Rocket("Falcon 8", "8")
    )

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showRockets(rockets)
    }

    fun onRocketsClick(rocket: Rocket) {
        rockets = rockets.filter { it != rocket }
        viewState.showRockets(rockets)
    }
}

