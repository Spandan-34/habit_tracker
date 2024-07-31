package com.example.simplehabittracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.DialogFragment

class AddHabitDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_add_habit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val habitNameEditText: EditText = view.findViewById(R.id.habitNameEditText)
        val frequencySpinner: Spinner = view.findViewById(R.id.frequencySpinner)
        val submitHabitButton: Button = view.findViewById(R.id.submitHabitButton)

        submitHabitButton.setOnClickListener {
            val habitName = habitNameEditText.text.toString()
            val frequency = frequencySpinner.selectedItem.toString()

            (activity as MainActivity).addHabit(habitName, frequency)
            dismiss()
        }
    }
}
