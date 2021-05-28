package com.example.shemajamebeli4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.example.shemajamebeli4.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(inflater,container,false)
        btnListener()
        return  binding.root
    }


    private fun btnListener(){
        binding.Btnnine.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_nineButton)

        }

        binding.BtntF.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_TFButton)
        }
    }

}