package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R

import kotlinx.android.synthetic.main.fragment_rockets.*


class RocketsFragment : Fragment(R.layout.fragment_rockets) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToRocketDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, RocketDetailsFragment())
                .addToBackStack("RDF")
                .commit()
        })
    }

    companion object {

    }
}