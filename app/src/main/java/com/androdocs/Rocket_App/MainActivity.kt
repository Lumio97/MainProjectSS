package com.androdocs.Rocket_App

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androdocs.Rocket_App.data.Chapter5
import kotlinx.android.synthetic.main.chapter_5_view.*
import kotlinx.android.synthetic.main.navigation_drawer.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button5.setOnClickListener {
            val intent = Intent(this, FifthChapter::class.java)
            startActivity(intent)
        }


        itemList?.adapter = TreeAdapter(listOf(
                Chapter5(
                "DFSF",
                "R.drawable.rocket2".toInt(),
                "fsddsdsfdfd"
            )
            )

        )


    }
}