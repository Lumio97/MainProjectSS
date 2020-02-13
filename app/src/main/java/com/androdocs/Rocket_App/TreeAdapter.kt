package com.androdocs.Rocket_App

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.androdocs.Rocket_App.data.Chapter5
import kotlinx.android.synthetic.main.left_tree_content.view.*
import kotlinx.android.synthetic.main.nav_header.view.*
import kotlinx.android.synthetic.main.right_tree_content.view.*

//Стандартное описание ViewHolder

class TreeAdapter(
    private val data: List<Chapter5> // Параметры в <> уже другие
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

        /// Тут вопрос

        if (getItemViewType(position) == TYPE_ONE) {
            (holder as ElementOneHolder).bind(data(List<Chapter5>))
        } else {
            (holder as ElementTwoHolder).bind(data[])
        }

    }


    /// И ТУТ

    private class ElementOneHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(data: List<Chapter5>) = itemView.apply {
            MainContentOne.text = text
            // Здесь уже посложнее с view,где картинки,текст и т.д.
        }
    }

    private class ElementTwoHolder(item) : RecyclerView.ViewHolder(item) {
        fun bind(text: String) = itemView.apply {
            MainContentTwo.imageView = imageView // Также
        }
    }

}