package com.chickenwings.mymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)

    }
//    fun invis() {
//        hot_wing.visibility = View.INVISIBLE
//        spicy_wing.visibility = View.INVISIBLE
//        eww_wing.visibility = View.INVISIBLE
//        sweet - sour_wing.visibility = View.INVISIBLE

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.op1 -> {
                    Toast.makeText(
                        this,
                        "You selected hot wing 2 minutes later it will be deliver to your mom's house",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.op2 -> {
                    Toast.makeText(
                        this,
                        "You selected Spicy wing 2 minutes later it will be deliver to your mom's house",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.op3 -> {
                    Toast.makeText(
                        this,
                        "You selected Eww wing 2 minutes later it will be deliver to your mom's house",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.op4 -> {
                    Toast.makeText(
                        this,
                        "You selected Sweet Sour wing 2 minutes later it will be deliver to your mom's house",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            return super.onOptionsItemSelected(item)
        }
    }
