package com.example.naproject.feature.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.naproject.R
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : Fragment(R.layout.fragment_search) ,SearchView {
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
            presenter.Setname(search_text.text.toString())

        })
    }

    override fun showNullError() {
        showError("Поиск")
    }
    private fun showError(name :String){
        Toast.makeText(requireContext(),"Ошибка в поле" + name,Toast.LENGTH_LONG).show()


    }


}