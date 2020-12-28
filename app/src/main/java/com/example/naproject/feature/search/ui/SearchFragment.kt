package com.example.naproject.feature.search.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.naproject.R
import com.example.naproject.feature.search.presentation.SearchPresenter
import com.example.naproject.feature.search.presentation.SearchView
import kotlinx.android.synthetic.main.fragment_search.*
import moxy.MvpAppCompatFragment


class SearchFragment : MvpAppCompatFragment(R.layout.fragment_search) , SearchView {
    private val presenter = SearchPresenter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attachView(this)

        initListeners()
    }

    private fun initListeners() {
        search_button.setOnClickListener({
            presenter.validate(
                search_text.text.toString()
            )
        })
    }

    override fun showNullError() {
        showError("Поиск")
    }
    private fun showError(name :String){
        Toast.makeText(requireContext(),"Ошибка в поле" + name,Toast.LENGTH_LONG).show()
    }


}