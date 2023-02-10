package com.example.a3_project.ui.animes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a3_project.databinding.FragmentAnimesBinding

class AnimesFragment:Fragment() {
    private var binding: FragmentAnimesBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnimesBinding.inflate(LayoutInflater.from(context), container,false )
        return binding!!.root
    }



}