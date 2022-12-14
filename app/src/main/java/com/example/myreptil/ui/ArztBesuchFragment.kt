package com.example.myreptil.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myreptil.R
import com.example.myreptil.databinding.FragmentArztBesuchBinding

class ArztBesuchFragment : Fragment() {

    private lateinit var binding: FragmentArztBesuchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_arzt_besuch, container, false)

        return binding.root
    }
}
