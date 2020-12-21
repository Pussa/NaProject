package com.example.naproject.feature.mainMenu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.naproject.R
import com.example.naproject.Rocket
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.top_rockets_item.*

class RocketsAdapter(private val onRocketsClick: (Rocket) -> Unit) :
    ListAdapter<Rocket, RocketsAdapter.ViewHolder>(object : DiffUtil.ItemCallback<Rocket>() {
        override fun areItemsTheSame(oldItem: Rocket, newItem: Rocket): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Rocket, newItem: Rocket): Boolean {
            return oldItem == newItem
        }


    }) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.top_rockets_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.RocketsName.text = item.name
        holder.launches.text = item.launches
        holder.containerView.setOnClickListener {
            onRocketsClick(item)
        }
    }


    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer

}