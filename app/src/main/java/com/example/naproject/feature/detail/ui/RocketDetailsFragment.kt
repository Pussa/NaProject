package com.example.naproject.feature.detail.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.naproject.R
import com.example.naproject.Rocket
import com.example.naproject.data.MostSuccessfulRocketsDaoImpl
import com.example.naproject.feature.detail.presentation.RocketDetailPresenter
import com.example.naproject.feature.detail.presentation.RocketDetailView
import kotlinx.android.synthetic.main.fragment_rocket_details.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class RocketDetailsFragment : MvpAppCompatFragment(R.layout.fragment_rocket_details), RocketDetailView {


    companion object {
        private const val ROCKET = "Rocket"


        fun newInstance(rocket: Rocket) =
                RocketDetailsFragment().apply {
                    arguments = Bundle().apply {
                        putParcelable(ROCKET, rocket)

                    }
                }
    }
    private val presenter: RocketDetailPresenter by moxyPresenter {
        RocketDetailPresenter(
            rocket = arguments?.getParcelable(ROCKET)!!,
            topDao = MostSuccessfulRocketsDaoImpl(requireContext().getSharedPreferences("data",Context.MODE_PRIVATE))
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun setRocket(rocket: Rocket) {
        rocketname.text = "Name: ${rocket?.name}"
        Launches.text = "Percentage of successful launches: ${rocket?.successPct}"
        coast.text = "Coast per launch: ${rocket.coastPerLaunch} $$$"
        descrition.text = "Description: ${rocket.description}"
    }
}