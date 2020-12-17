package com.example.naproject.feature.search

import moxy.MvpView
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.AddToEnd
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle
interface SearchView: MvpView {

    fun showNullError()
}