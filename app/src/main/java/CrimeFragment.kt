package com.bignerdranch.android.criminalintent

import android.annotation.SuppressLint
import android.content.Intent
import java.text.DateFormat
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import java.util.Locale

class CrimeFragment : Fragment() {
    private lateinit var checkBox: CheckBox
    private lateinit var titleField: EditText
    private lateinit var dateFab: FloatingActionButton
    private lateinit var button1: Button
    private lateinit var crime: Crime

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crime, container, false)
        crime = Crime()

        titleField = view.findViewById(R.id.crime_title) as EditText
        dateFab = view.findViewById(R.id.crime_date) as FloatingActionButton
        button1 = view.findViewById(R.id.button) as Button
        checkBox = view.findViewById(R.id.crime_solved)

        val dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        val formattedDate = dateFormat.format(crime.date)

        checkBox.apply {
            setOnClickListener {
                button1.text = formattedDate
            }
        }

        button1.apply {
            setOnClickListener {
            Snackbar.make(view, "Сообщение отправленно", Snackbar.LENGTH_LONG).show()
            }
        }

        dateFab.apply {
            setOnClickListener {
                var intent = Intent(getActivity(), second::class.java)
                startActivity(intent)
            }
        }
        return view
    }
}