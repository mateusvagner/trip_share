package com.pw3.desafio1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pw3.desafio1.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)

        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        binding.shareButton.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainToMyTripDetail())
        }
    }
}