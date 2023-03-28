package com.pw3.desafio1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pw3.desafio1.databinding.FragmentMyTripDetailBinding
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


            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "*/*"
            intent.putExtra(Intent.EXTRA_EMAIL, "teste@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Minha viagem")
            intent.putExtra(Intent.EXTRA_TEXT, "Viagem para $local, durante $days no mês de $month")
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}
