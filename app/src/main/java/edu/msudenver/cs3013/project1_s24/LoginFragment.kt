package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        usernameEditText = view.findViewById(R.id.username_edittext)
        passwordEditText = view.findViewById(R.id.password_edittext)
        loginButton = view.findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "duck" && password == "duckling") {
                MainActivity.loggedIn = true
                findNavController().navigate(R.id.action_loginFragment_to_babyDucksInfoFragment)
            } else {
                Toast.makeText(requireContext(), "Please retry! username or password invalid :)", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        return view
    }
}


