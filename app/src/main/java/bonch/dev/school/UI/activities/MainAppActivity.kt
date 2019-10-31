package bonch.dev.school.UI.activities

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import bonch.dev.school.R
import bonch.dev.school.UI.fragments.ChatFragment
import bonch.dev.school.UI.fragments.PasswordFragment
import bonch.dev.school.UI.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_chat, R.id.nav_profile
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.activity_main_drawer, menu) // (R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

   /* fun attachChatFragment() {
        fm.beginTransaction().add(R.id.fragment_chat, ChatFragment()).commit()
    }

    fun attachProfileFragment() {
        fm.beginTransaction().replace(R.id.fragment_chat, ProfileFragment()).addToBackStack("fragment_chat").commit()
    }

    fun attachChangePasswordFragment() {
        fm.beginTransaction().add(R.id.password_change, PasswordFragment()).addToBackStack("password_change").commit()
    } */
}
