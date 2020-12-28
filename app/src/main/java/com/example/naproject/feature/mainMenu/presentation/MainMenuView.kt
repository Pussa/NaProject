package com.example.naproject.feature.mainMenu.presentation

import com.example.naproject.Rocket
import com.example.naproject.di.SpacexApi
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MainMenuView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showRockets(rockets: List<Rocket>)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openDetailScreen(rocket: Rocket)
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showLoading(isShow: Boolean) {

    }


}