package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import bonch.dev.school.R

class PasswordFragment: DialogFragment() {
    lateinit var changePasswordButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.password_change, container, false)
        changePasswordButton = view.findViewById(R.id.change_password_button)
        changePasswordButton.setOnClickListener { dismiss() }
        return  view
    }
}