package com.example.kotlinapp_task

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.comp709.classapp_kotlin_tutorial.R


class NextScreenFragment : Fragment(R.layout.fragment_next_screen) {

    private lateinit var tv_final: TextView

    private val args: NextScreenFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        tv_final = view.findViewById(R.id.tv_final)


        tv_final.text = args.result

    }
}