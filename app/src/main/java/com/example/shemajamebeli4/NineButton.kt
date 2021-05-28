package com.example.shemajamebeli4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation


class NineButton : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        view?.let { buClick(it) }
        return inflater.inflate(R.layout.fragment_nine_button, container, false)
    }

    fun buClick(view: View){
        val buSelected = view as ImageButton
        var cellID =  0
        when(buSelected.id){
            R.id.button_00 -> cellID =1
            R.id.button_01 -> cellID =2
            R.id.button_02 -> cellID =3
            R.id.button_10 -> cellID =4
            R.id.button_11-> cellID =5
            R.id.button12 -> cellID =6
            R.id.button20 -> cellID =7
            R.id.button21 -> cellID =8
            R.id.button22 -> cellID =9
        }
        playGame(cellID,buSelected)

    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    var playerActive = 1

    fun playGame(CellID : Int , buSelected : ImageButton){

        if(playerActive == 1){
            buSelected.setImageResource(R.drawable.x)
            playerActive = 2
            player1.add(CellID)
        }else {
            buSelected.setImageResource(R.drawable.o)
            playerActive=1
            player2.add(CellID)
        }
        buSelected.isSelected = false

        checkWinner()


    }

    fun checkWinner(){

        var winner = 0

        if (player1.contains(1)&& player1.contains(2)&& player1.contains(3)){
            winner=1

        }else if (player2.contains(1)&& player2.contains(2)&& player2.contains(3)){
            winner=-1

        }else
        if (player1.contains(4)&& player1.contains(5)&& player1.contains(6)){
            winner=1

        }else
        if (player2.contains(4)&& player2.contains(5)&& player2.contains(6)){
            winner=-1

        }else
        if (player1.contains(1)&& player1.contains(4)&& player1.contains(7)){
            winner=1

        }else
        if (player2.contains(1)&& player2.contains(4)&& player2.contains(7)){
            winner=-1

        }else
        if (player1.contains(2)&& player1.contains(5)&& player1.contains(8)){
            winner=1

        }else
        if (player2.contains(2)&& player2.contains(5)&& player2.contains(8)){
            winner=-1

        }else
        if (player1.contains(3)&& player1.contains(6)&& player1.contains(9)){
            winner=1

        }else
        if (player2.contains(3)&& player2.contains(6)&& player2.contains(9)){
            winner=-1

        }else
        if (player1.contains(1)&& player1.contains(5)&& player1.contains(9)){
            winner=1

        }else
        if (player2.contains(1)&& player2.contains(5)&& player2.contains(9)){
            winner=-1

        }else
        if (player1.contains(3)&& player1.contains(5)&& player1.contains(7)){
            winner=1

        }else
        if (player2.contains(3)&& player2.contains(5)&& player2.contains(7)){
            winner=-1

        }
        else{
            winner = 0
        }

        when(winner){
             1 -> view?.let { Navigation.findNavController(it).navigate(R.id.action_nineButton_to_winnerOne) }
            -1 -> view?.let { Navigation.findNavController(it).navigate(R.id.action_nineButton_to_winnerTwo) }
            0 -> view?.let { Navigation.findNavController(it).navigate(R.id.action_nineButton_to_draw2) }
        }


    }


}