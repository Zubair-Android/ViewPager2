package com.urduilm.dakhlay.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.urduilm.dakhlay.R
import com.urduilm.dakhlay.ResultFragmentAdapter
import com.urduilm.dakhlay.databinding.FragmentResultBinding
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {
    private lateinit var resultFragmentAdapter : ResultFragmentAdapter
    private lateinit var viewPager : ViewPager2
   /* companion object{
        fun getInstance(name:String): Fragment{
            val fragment = ResultFragment()
            val arg = Bundle()
            arg.putString("name",name)
            fragment.arguments=arg
            return fragment
        }
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       /* val eventList = listOf("java", "Kotlin", "Python","web","ML","IOT")*/



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        resultFragmentAdapter = ResultFragmentAdapter(this)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = resultFragmentAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout,viewPager){tab,position->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()


        /*TabLayoutMediator(,viewPager,).attach()*/

    }
}
