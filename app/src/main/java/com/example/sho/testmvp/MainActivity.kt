package com.example.sho.testmvp

import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.sho.testmvp.foodlist.view.FoodListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.food_fragment_container, FoodListFragment())
        trans.commit()
    }
}
