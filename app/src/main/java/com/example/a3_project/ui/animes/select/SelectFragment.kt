package com.example.a3_project.ui.animes.select

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a3_project.databinding.FragmentSelectBinding

class SelectFragment:Fragment() {
    private var binding: FragmentSelectBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectBinding.inflate(LayoutInflater.from(context), container,false )
        return binding!!.root
    }

}