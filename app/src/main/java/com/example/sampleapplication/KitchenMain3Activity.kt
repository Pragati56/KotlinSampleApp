package com.example.sampleapplication

import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.kitchen_main3.*

class KitchenMain3Activity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager



    private val kitchenitemtoadd = KitchenFragmentItem()
    private val kitchenitemtoView = KitchenFragmentView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kitchen_main3)


        /* Display First Fragment initially */
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.myFragment, kitchenitemtoView)
        fragmentTransaction.commit()


        println("Kitchen has these items" )
    }

    fun btnOne(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, kitchenitemtoadd)
        fragmentTransaction.commit()
    }

    fun btnTwo(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, kitchenitemtoView)
        fragmentTransaction.commit()
    }

}
