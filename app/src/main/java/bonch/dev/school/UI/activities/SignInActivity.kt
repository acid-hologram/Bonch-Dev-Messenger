package bonch.dev.school.UI.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import bonch.dev.school.R
import bonch.dev.school.UI.fragments.ChatFragment
import bonch.dev.school.UI.fragments.SignUpActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var signInButton: Button
    private lateinit var registrationButton: Button
    private lateinit var mailTextField: EditText
    private lateinit var passwordTextField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        getSupportActionBar()!!.hide()
        initializeViews()
        signInButton.setOnClickListener{
            val intent = Intent(MainActivity@this,MainAppActivity::class.java)
            startActivity(intent)
        }
        registrationButton.setOnClickListener{
            val intent = Intent(MainActivity@this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initializeViews() {
        signInButton = findViewById(R.id.sign_in_button)
        registrationButton = findViewById(R.id.sign_up_button)
        mailTextField = findViewById(R.id.email_sign_in_edit_text)
        passwordTextField = findViewById(R.id.password_sign_in_edit_text)
    }

}