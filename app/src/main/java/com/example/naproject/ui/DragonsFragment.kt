package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R

import kotlinx.android.synthetic.main.fragment_dragons.*

class DragonsFragment : Fragment(R.layout.fragment_dragons) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToDragonDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, DragonsDetailsFragment())
                .addToBackStack("DDF")
                .commit()
        })
    }

    companion object {

    }
}