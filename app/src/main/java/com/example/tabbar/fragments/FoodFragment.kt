package com.example.tabbar.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.tabbar.R
import com.example.tabbar.berryOatsActivity
import com.example.tabbar.itasaladActivity


class FoodFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.itaSalad_imgbt).setOnClickListener {
            val i = Intent(activity,itasaladActivity::class.java)
            activity?.startActivity(i)
        }
        view.findViewById<ImageButton>(R.id.berryOats_imgbt).setOnClickListener {
            val i = Intent(activity,berryOatsActivity::class.java)
            activity?.startActivity(i)
        }
    }

}