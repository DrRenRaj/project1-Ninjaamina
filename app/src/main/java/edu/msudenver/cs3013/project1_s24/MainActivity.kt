package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    companion object {
        var loggedIn: Boolean = false // Track login state
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        // Check if user is logged in
        loggedIn = isLoggedIn()

        // Manage navigation and visibility based on login state
        if (loggedIn) {
            bottomNavigationView.visibility = View.VISIBLE
            // Navigate to BabyDucksInfoFragment if logged in
            navController.navigate(R.id.babyDucksInfoFragment)
        } else {
            bottomNavigationView.visibility = View.GONE
            // Navigate to LoginFragment if not logged in
            navController.navigate(R.id.loginFragment)
        }
    }

    private fun isLoggedIn(): Boolean {
        return loggedIn
    }
}
