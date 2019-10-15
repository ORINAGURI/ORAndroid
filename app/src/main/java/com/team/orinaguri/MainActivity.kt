package com.team.orinaguri

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mapImg.setOnClickListener {
            if(miseImg.visibility== View.VISIBLE) miseImg.visibility=View.INVISIBLE
            else miseImg.visibility =  View.VISIBLE
        }
    }


}
