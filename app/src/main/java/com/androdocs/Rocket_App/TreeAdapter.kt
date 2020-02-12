package com.androdocs.Rocket_App

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.get
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.left_tree_content.view.*
import kotlinx.android.synthetic.main.nav_header.view.*
import kotlinx.android.synthetic.main.right_tree_content.view.*

//Стандартное описание ViewHolder

class TreeAdapter(
    private val data: List<LinearLayout> // Параметры в <> уже другие
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ONE = 0
    private val TYPE_TWO = 1

    override fun getItemViewType(position: Int): Int {
        return if(position % 2 == 0) TYPE_ONE else TYPE_TWO
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_ONE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.left_tree_content, parent, false)
            ElementOneHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.right_tree_content, parent, false)
            ElementTwoHolder(view)
        }
    }
    override fun getItemCount()= data.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (getItemViewType(position) == TYPE_ONE) {
            (holder as ElementOneHolder).bind(data[position])
        } else {
            (holder as ElementTwoHolder).bind(data[position])
        }

    }


    private class ElementOneHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(text: String) = itemView.apply {
            MainContentOne. = text  // Здесь уже посложнее с view,где картинки,текст и т.д.
        }
    }

    private class ElementTwoHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(text: String) = itemView.apply {
            MainContentTwo.imageView = imageView // Также
        }
    }

}