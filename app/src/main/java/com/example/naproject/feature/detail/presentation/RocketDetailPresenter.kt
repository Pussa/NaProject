package com.example.naproject.feature.detail.presentation

import com.example.naproject.Rocket
import com.example.naproject.data.MostSuccessfulRocketsDao
import moxy.MvpPresenter
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

class RocketDetailPresenter ( private val rocket:Rocket,
private val topDao: MostSuccessfulRocketsDao): MvpPresenter<RocketDetailView>() {

    private var isInTop: Boolean = false

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setRocket(rocket)
        isInTop = topDao.isInTop(rocket)
        viewState.setIsInTop(isInTop)
    }

}


interface RocketDetailView :MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setRocket(rocket: Rocket)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setIsInTop(inTop: Boolean) {

    }
}