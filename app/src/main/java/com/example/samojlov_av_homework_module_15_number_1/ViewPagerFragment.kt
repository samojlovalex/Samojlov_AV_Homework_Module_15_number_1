package com.example.samojlov_av_homework_module_15_number_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.samojlov_av_homework_module_15_number_1.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    private lateinit var nameArtTV: TextView
    private lateinit var imageViewIV: ImageView
    private lateinit var authorTextVieWTV: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        nameArtTV = binding.nameArtTV
        imageViewIV = binding.imageViewIV
        authorTextVieWTV = binding.authorTextVieWTV
        val viewPagerItem = arguments?.getSerializable("vp") as Picture

        nameArtTV.text = viewPagerItem.name
        imageViewIV.setImageResource(viewPagerItem.image)
        authorTextVieWTV.text = viewPagerItem.author
    }

}