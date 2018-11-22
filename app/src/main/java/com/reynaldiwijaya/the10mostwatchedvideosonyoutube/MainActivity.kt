package com.reynaldiwijaya.the10mostwatchedvideosonyoutube

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.reynaldiwijaya.the10mostwatchedvideosonyoutube.R.id.bottom_navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.navigation_home -> {
                fragment = FragmentHome2()
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()

            }
            R.id.navigation_dashboard -> {
                fragment = DetailFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
        }
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().replace(R.id.container_frame, FragmentHome2()).commit()

    }
}
