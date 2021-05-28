package com.example.shemajamebeli4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.shemajamebeli4.databinding.FragmentWinnerOneBinding
import com.example.shemajamebeli4.databinding.FragmentWinnerTwoBinding


class WinnerTwo : Fragment() {
    private lateinit var binding : FragmentWinnerTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.button.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_winnerTwo_to_mainFragment)
        }
        binding = FragmentWinnerTwoBinding.inflate(inflater,container,false)
        return binding.root
    }


}