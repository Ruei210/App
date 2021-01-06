package com.example.tabbar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class breakfirst : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_breakfirst, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.itaSalad_igbt).setOnClickListener{
            val i = Intent(activity, itaSalad::class.java)
            activity?.startActivity(i)
        }
        view.findViewById<ImageButton>(R.id.yogurtandCereal_igbt).setOnClickListener {
            val i =Intent(activity,yogurt::class.java)
            activity?.startActivity(i)
        }
    }


}