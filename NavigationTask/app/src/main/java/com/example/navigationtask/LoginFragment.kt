package com.example.navigationtask

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class LoginFragment : Fragment(R.layout.fragment_login){


    private val args: LoginFragmentArgs by navArgs()
    private lateinit var button_confirm: Button
    private lateinit var edit_text_username: EditText
    private lateinit var edit_text_password: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        button_confirm = view.findViewById(R.id.Button_confirm)
        edit_text_username = view.findViewById(R.id.edit_text_username)
        edit_text_password = view.findViewById(R.id.edit_text_password)


        val usernameDeepLink = args.username
        edit_text_username.setText(usernameDeepLink)

        button_confirm.setOnClickListener {
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()


            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)

        }
    }

}