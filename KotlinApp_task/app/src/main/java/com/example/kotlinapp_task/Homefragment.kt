package com.example.kotlinapp_task

import androidx.fragment.app.Fragment
import com.comp709.classapp_kotlin_tutorial.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController



class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var btnadd: Button
    private lateinit var tvresult: TextView
    private lateinit var btnminus: Button
    private lateinit var btnnextscreen: Button


    var num=0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnadd = view.findViewById(R.id.btn_add)
       tvresult = view.findViewById(R.id.tv_final)
        btnminus = view.findViewById(R.id.btn_minus)
        btnnextscreen = view.findViewById(R.id.btn_screen2)

//add or minus increment counter for first page
        btnadd.setOnClickListener {
            num=num.inc()
            tvresult.text = num.toString()
        }
        btnminus.setOnClickListener {
            num=num.dec()
            tvresult.text = num.toString()
        }

        btnnextscreen.setOnClickListener{
            val result = tvresult.text.toString()
            //passes on result from tv_result to the val action.
            val action = HomeFragmentDirections.actionHomeFragment2ToNextScreenFragment(result)
            findNavController().navigate(action)
        }

    }

}