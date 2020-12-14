package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R

import kotlinx.android.synthetic.main.fragment_launches.*

class LaunchesFragment : Fragment(R.layout.fragment_launches) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToLaunchDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, LaunchDetailsFragment())
                .addToBackStack("LDF")
                .commit()
        })
    }

    companion object {

    }
}