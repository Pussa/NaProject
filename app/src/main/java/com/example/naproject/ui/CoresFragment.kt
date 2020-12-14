package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R


import kotlinx.android.synthetic.main.fragment_cores.*


class CoresFragment : Fragment(R.layout.fragment_cores) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        btnGoToCoreDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, CoresDetailsFragment())
                .addToBackStack("CDF")
                .commit()
        })
    }

    companion object {

    }
}