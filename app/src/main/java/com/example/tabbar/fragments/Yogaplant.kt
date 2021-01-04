package com.example.tabbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.tabbar.R


class Yogaplant : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yogaplant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.backmountain).setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_yogaplant_to_yogamountain)
        }
        view.findViewById<Button>(R.id.nextsnake).setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_yogaplant_to_yogasnake)
        }
    }


}