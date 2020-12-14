package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R

import kotlinx.android.synthetic.main.fragment_ships.*


class ShipsFragment : Fragment(R.layout.fragment_ships) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToShipDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, ShipDetailsFragment())
                .addToBackStack("SDF")
                .commit()
        })
    }

    companion object {

    }
}