package com.pw3.desafio1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pw3.desafio1.databinding.FragmentMyTripDetailBinding
import com.pw3.desafio1.domain.TripDetail
import java.lang.Integer.parseInt

class MyTripDetailFragment : Fragment() {

    lateinit var binding: FragmentMyTripDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyTripDetailBinding.inflate(layoutInflater)

        setupListeners()
        return binding.root
    }

    private fun setupListeners() {
        binding.shareButton.setOnClickListener {
            val local = binding.localEditText.text.toString()
            val days = parseInt(binding.diasEditText.text.toString())
            val month = binding.mesSpinner.selectedItem.toString()

            val myTrip = TripDetail(
                local,
                days,
                month
            )
        }
    }
}