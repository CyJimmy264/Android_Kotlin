package ru.cj264.geekbrains.movie_finder

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Maksim", "Veynberg")

        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "My name is ${person.firstName} ${person.lastName}", Toast.LENGTH_LONG).show()
        }
    }
}