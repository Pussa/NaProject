package com.example.naproject.feature.search

import moxy.MvpPresenter

class SearchPresenter : MvpPresenter<SearchView>() {
    var name = ""
    fun validate(search: String) {
        if (search.isEmpty()) viewState.showNullError()
        else name = search
    }

}