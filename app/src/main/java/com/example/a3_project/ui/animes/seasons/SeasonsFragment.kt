package com.example.a3_project.ui.animes.seasons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a3_project.databinding.FragmentSeasonsBinding


class SeasonsFragment: Fragment() {
    private var binding: FragmentSeasonsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeasonsBinding.inflate(LayoutInflater.from(context), container,false )
        return binding!!.root
    }
}