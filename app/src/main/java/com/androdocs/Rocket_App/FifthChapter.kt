package com.androdocs.Rocket_App


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FifthChapter: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.chapter_5_view,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}

