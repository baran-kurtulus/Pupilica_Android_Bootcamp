package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding


class AnaSayfa : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.buttonAnasayfaA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfa_to_sayfaA)
        }

        binding.buttonAnasayfaX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfa_to_sayfaX)
        }

        return binding.root
    }

}