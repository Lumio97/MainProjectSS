package com.androdocs.Rocket_App

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.androdocs.Rocket_App.data.Chapter5
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.chapter_5_view.*


class  MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList.adapter = TreeAdapter(
            listOf(Chapter5(
                "DFSF",
                "R.drawable.rocket2",
                "fsddsdsfdfd"))

        )



        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.app_name, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)




    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.button1 -> {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.button2 -> {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.button3 -> {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.button4 -> {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.button5-> {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }





}
