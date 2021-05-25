package ru.cj264.geekbrains.movie_finder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.cj264.geekbrains.movie_finder.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}
