package com.urduilm.dakhlay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.urduilm.dakhlay.fragment.ResultFragment
import com.urduilm.dakhlay.fragment.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*val eventList = listOf("java", "Kotlin", "Python","web","ML","IOT")
        viewpager1.adapter = ViewPagerAdapter(eventList)

        TabLayoutMediator(tabLayout, viewpager1,object : TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.setText(eventList[position])
            }
        }).attach()*/
    }
}
