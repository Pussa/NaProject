package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.naproject.R
import com.example.naproject.Rocket
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MainMenuFragment : Fragment(R.layout.fragment_main_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val rocket = Rocket("Falcon8","8")

        buttonGoToRocket.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, RocketsFragment())
                    .addToBackStack("RF")
                    .commit()
        })

        buttonGoToLaunches.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, LaunchesFragment())
                    .addToBackStack("LF")
                    .commit()
        })
        buttonGoToCores.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, CoresFragment())
                    .addToBackStack("CF")
                    .commit()
        })
        buttonGoToCapsules.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, CapsulesFragment())
                    .addToBackStack("CaF")
                    .commit()
        })
        buttonGoToDragons.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, DragonsFragment())
                    .addToBackStack("DF")
                    .commit()
        })
        buttonGoToHistory.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, HistoryFragment())
                    .addToBackStack("HF")
                    .commit()
        })
        buttonGoToMissions.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, MissionsFragment())
                    .addToBackStack("MF")
                    .commit()
        })
        buttonGoToRoadster.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, RoadsterFragment())
                    .addToBackStack("RdF")
                    .commit()
        })
        buttonGoToShips.setOnClickListener({
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, ShipsFragment())
                    .addToBackStack("SF")
                    .commit()
        })

    }
}