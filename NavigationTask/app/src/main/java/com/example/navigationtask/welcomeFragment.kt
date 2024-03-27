package com.example.navigationtask

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class welcomeFragment : Fragment(R.layout.fragment_welcome){

    private val args: welcomeFragmentArgs by navArgs()
    private lateinit var text_view_username: TextView
    private lateinit var text_view_password: TextView
    private lateinit var button_ok: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_ok = view.findViewById(R.id.Button_ok)
        text_view_username = view.findViewById(R.id.text_view_username)
        text_view_password = view.findViewById(R.id.text_view_password)

        text_view_username.text = args.username
        text_view_password.text = args.password


        button_ok.setOnClickListener {
            val action = welcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

}