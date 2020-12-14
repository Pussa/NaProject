package com.example.naproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naproject.R
import kotlinx.android.synthetic.main.fragment_history.*

class HistoryFragment : Fragment(R.layout.fragment_history) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnGoToHistoryDetails.setOnClickListener({
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, HistoryDetailsFragment())
                .addToBackStack("HDF")
                .commit()
        })
    }

    companion object {

    }
}