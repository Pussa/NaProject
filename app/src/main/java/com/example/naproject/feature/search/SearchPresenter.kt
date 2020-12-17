package com.example.naproject.feature.search

import moxy.MvpPresenter

class SearchPresenter : MvpPresenter<SearchView>() {


    var name = ""

    fun Setname(name:String){
        this.name = name

    }

    fun validate(search: String) {
        when {

            !searchNotNull(search) -> viewState.showNullError()
        }
    }

    private fun searchNotNull(searchText: String): Boolean {
        if (searchText.isEmpty())
            return false
        else
            return true
    }
}