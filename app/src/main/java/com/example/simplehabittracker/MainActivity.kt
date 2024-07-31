package com.example.simplehabittracker

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    private lateinit var habitsContainer: LinearLayout
    private lateinit var addHabitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        habitsContainer = findViewById(R.id.habitsContainer)
        addHabitButton = findViewById(R.id.addHabitButton)

        addHabitButton.setOnClickListener {
            val addHabitDialog = AddHabitDialogFragment()
            addHabitDialog.show(supportFragmentManager, "AddHabitDialogFragment")
        }
    }

    fun addHabit(habitName: String, frequency: String) {
        val habitTextView = TextView(this)
        habitTextView.text = "$habitName - $frequency"
        habitsContainer.addView(habitTextView)
    }
}
