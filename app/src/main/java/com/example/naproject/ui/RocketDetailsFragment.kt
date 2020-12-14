package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R
import com.example.naproject.Rocket
import kotlinx.android.synthetic.main.fragment_rocket_details.*

class RocketDetailsFragment : Fragment(R.layout.fragment_rocket_details) {


    companion object {
        private const val ROCKET = "Rocket"


        fun newInstance(rocket: Rocket) =
                RocketDetailsFragment().apply {
                    arguments = Bundle().apply {
                        putParcelable(ROCKET, rocket)

                    }
                }
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val rocket = it.getParcelable<Rocket>(ROCKET)
            rocketname.text = "Name: ${rocket?.name}"
            Launches.text = "Launches:${rocket?.launches}"
        }
    }*/
}