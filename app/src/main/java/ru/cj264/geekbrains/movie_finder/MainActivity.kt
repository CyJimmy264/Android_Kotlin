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
        val personCopy = person.copy()

        val personArray = arrayListOf<Person>(
                person,
                personCopy,
                Person("Ivan", "Svjatoslavovich")
        )

        for (p in personArray) {
            println(p)
        }

        for (i in personArray.indices) {
            println(personArray[i])
        }


        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "My name is ${personCopy.firstName} ${person.lastName}", Toast.LENGTH_LONG).show()
        }
    }
}