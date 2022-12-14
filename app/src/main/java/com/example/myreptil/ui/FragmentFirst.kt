package com.example.myreptil.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myreptil.R
import com.example.myreptil.databinding.FragmentFirstBinding

class FragmentFirst : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        viewModel.tierList.observe(viewLifecycleOwner) {
            if (it.isNotEmpty()) {
                findNavController().navigate(FragmentFirstDirections.actionFragmentFirst2ToFragmentTiere())
            }
        }
        val add_picture = binding.firstPicture

        add_picture.setOnClickListener {
            findNavController().navigate(FragmentFirstDirections.actionFragmentFirst2ToDetailCardFragment2())
        }
        return binding.root
    }
}
