package com.chickenwings.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var YourOrder : String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewOrder.setOnClickListener {
            YourOrder=""
            if (HotWings.isChecked)
            {
              YourOrder+="Hot Wings\n"
            }
            if (SweetSourWings.isChecked)
            {
                YourOrder+="Sweet Sour Wings\n"
            }
            if (DeepSauceWings.isChecked)
            {
                YourOrder+="Deep Sauce Wings\n"
            }
            if (SpicyWings.isChecked)
            {
                YourOrder+="Spicy Wings\n"
            }
            Toast.makeText(this, "Your orders are : \n $YourOrder",Toast.LENGTH_SHORT).show()
        }
    }
}
