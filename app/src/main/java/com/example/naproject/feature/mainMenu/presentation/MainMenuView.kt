package com.example.naproject.feature.mainMenu.presentation

import com.example.naproject.Rocket
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


}