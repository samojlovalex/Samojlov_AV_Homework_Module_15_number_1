package com.example.samojlov_av_homework_module_15_number_1

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (
    fragment: FragmentActivity,
    private val viewPagerList: MutableList<Picture>
): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return viewPagerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}