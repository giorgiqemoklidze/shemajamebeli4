package com.example.shemajamebeli4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.shemajamebeli4.databinding.FragmentDrawBinding
import com.example.shemajamebeli4.databinding.FragmentMainBinding
import com.example.shemajamebeli4.databinding.FragmentWinnerOneBinding


class Draw : Fragment() {
    private lateinit var binding : FragmentDrawBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.button.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_draw_to_mainFragment)
        }
        binding = FragmentDrawBinding.inflate(inflater,container,false)
        return binding.root

    }


}