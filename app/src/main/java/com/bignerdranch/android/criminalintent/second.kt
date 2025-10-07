package com.bignerdranch.android.criminalintent

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /*    Snackbar.make(, "хотите вернуться?", Snackbar.LENGTH_LONG)
            .setAction("возврат") {
                    var intent = Intent(this, CrimeFragment::class.java)
                    startActivity(intent)
            }
            .show()*/
    }
}