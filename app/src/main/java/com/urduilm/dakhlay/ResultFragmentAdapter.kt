package com.urduilm.dakhlay

import android.os.Bundle
import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.urduilm.dakhlay.fragment.ResultFragment

class ResultFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 100
    }

    override fun createFragment(position: Int): Fragment {
    val fragment = ResultObjectFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position+1)
        }
        return fragment
    }


}