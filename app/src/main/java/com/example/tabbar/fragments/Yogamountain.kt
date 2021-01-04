package com.example.tabbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.tabbar.R


class Yogamountain : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yogamountain, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.backdog).setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_yogamountain_to_yogadog)
        }
        view.findViewById<Button>(R.id.nextplant).setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_yogamountain_to_yogaplant)
        }
    }


}