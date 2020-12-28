package com.example.naproject.feature.mainMenu.ui

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.naproject.R
import com.example.naproject.Rocket
import com.example.naproject.di.spacexApi
import com.example.naproject.domain.GetRocketsUseCase
import com.example.naproject.feature.detail.ui.RocketDetailsFragment
import com.example.naproject.feature.mainMenu.presentation.MainMenuPresentation
import com.example.naproject.feature.mainMenu.presentation.MainMenuView
import com.example.naproject.feature.search.ui.SearchFragment
import kotlinx.android.synthetic.main.fragment_main_menu.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class MainMenuFragment : MvpAppCompatFragment(R.layout.fragment_main_menu), MainMenuView {


    private val presenter: MainMenuPresentation by moxyPresenter {
        MainMenuPresentation(GetRocketsUseCase(spacexApi))
    }
    private var rocketsAdapter: RocketsAdapter? = null


    override fun onDestroyView() {
        super.onDestroyView()
        rocketsAdapter = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(rvROCKETs) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = RocketsAdapter(onRocketsClick = {
                presenter.onRocketsClick(it)


            }).also {
                rocketsAdapter = it

            }
        }



        buttonGoToSearch.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("SeF")
                .commit()
        })

    }

    override fun showRockets(rockets: List<Rocket>) {
        rocketsAdapter?.submitList(rockets)
    }

    override fun showLoading(isShow: Boolean) {
        RocketsProgress.isVisible = isShow
    }

    override fun openDetailScreen(rocket: Rocket) {

        requireFragmentManager().beginTransaction()
            .replace(R.id.container, RocketDetailsFragment.newInstance(rocket))
            .addToBackStack("RF")
            .commit()

    }

}

