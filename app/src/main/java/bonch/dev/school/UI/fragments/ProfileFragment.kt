package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity

class ProfileFragment: Fragment() {

    private lateinit var ChangePassowrd: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        ChangePassowrd = view.findViewById(R.id.change_password_button)

        ChangePassowrd.setOnClickListener{(context as MainAppActivity).attachChangePasswordFragment()}

        return  view
    }
}