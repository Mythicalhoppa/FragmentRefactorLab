package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val greetingFragment = GreetingFragment()

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, greetingFragment)
                .commit()
        }
    }
}