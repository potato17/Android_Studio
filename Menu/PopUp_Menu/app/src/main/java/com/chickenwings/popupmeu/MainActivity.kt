package com.chickenwings.popupmeu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        action.setOnClickListener {
            var popupMenu = PopupMenu(this, it)
            popupMenu.setOnMenuItemClickListener { item ->
                when(item.itemId)
                {
                    R.id.a1->
                    {
                        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.a2->
                    {
                        Toast.makeText(this,"hello1",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.a3->
                    {
                        Toast.makeText(this,"hello2",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.a4->
                    {
                        Toast.makeText(this,"hello3",Toast.LENGTH_SHORT).show()
                        true

                    }
                    else ->
                    {
                        false
                    }


                }

            }
            popupMenu.inflate(R.menu.menu)
            popupMenu.show()
        }
    }
}
