package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R
import kotlinx.android.synthetic.main.fragment_capsules.*

class CapsulesFragment : Fragment(R.layout.fragment_capsules) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToCapsuleDetails.setOnClickListener({
        requireFragmentManager().beginTransaction()
            .replace(R.id.container, CapsulesDetailsFragment())
            .addToBackStack("fasdfF")
            .commit()
        })
    }


}