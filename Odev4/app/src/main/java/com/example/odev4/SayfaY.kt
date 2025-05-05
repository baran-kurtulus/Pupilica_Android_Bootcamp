package com.example.odev4

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaYBinding


class SayfaY : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        //Geri Dönme tuşu ile ana sayfaya gitme işlemi
        //val geriTusu = object: OnBackPressedCallback(enabled = true){
        //    override fun handleOnBackPressed() {
        //        Navigation.findNavController(requireActivity(), R.id.navHostFragment).navigate(R.id.action_sayfaY_to_anaSayfa)
        //    }
        //}
        //requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)

        return binding.root
    }

}