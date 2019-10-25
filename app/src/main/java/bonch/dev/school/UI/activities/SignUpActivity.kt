package bonch.dev.school.UI.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity
import bonch.dev.school.UI.fragments.ChatFragment
import bonch.dev.school.UI.fragments.SignUpActivity

class SignUpActivity: AppCompatActivity() {

    private lateinit var compliteRegistrationButton: Button
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        getSupportActionBar()!!.hide()
        compliteRegistrationButton = findViewById(R.id.complete_sign_up_button)
        compliteRegistrationButton.setOnClickListener{
            val intent = Intent(MainActivity@this, MainAppActivity::class.java)
            startActivity(intent)
        }
    }
}