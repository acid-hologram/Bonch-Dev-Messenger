package bonch.dev.school.UI.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.R
import bonch.dev.school.UI.fragments.ChatFragment
import bonch.dev.school.UI.fragments.PasswordFragment
import bonch.dev.school.UI.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        attachChatFragment()
    }

    fun attachChatFragment() {
        fm.beginTransaction().add(R.id.fragment_chat, ChatFragment()).commit()
    }

    fun attachProfileFragment() {
        fm.beginTransaction().replace(R.id.fragment_chat, ProfileFragment()).addToBackStack("fragment_chat").commit()
    }

    fun attachChangePasswordFragment() {
        fm.beginTransaction().add(R.id.password_change, PasswordFragment()).addToBackStack("password_change").commit()
    }

}
