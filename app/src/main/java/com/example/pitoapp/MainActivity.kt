package com.example.pitoapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn_website:Button
    lateinit  var btn_calca:Button
    lateinit var btn_Alert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_website = findViewById(R.id.btn_emobi)
        btn_calca = findViewById(R.id.btn_calc)
        btn_Alert = findViewById(R.id.btn_alertt)

        btn_website.setOnClickListener {
            var emobi = Intent(this, WebsiteActivity::class.java)
            startActivity(emobi)

            btn_calca.setOnClickListener {
                var calc = Intent(this, CalculatorActivity::class.java)
                startActivity(calc)

                btn_Alert.setOnClickListener {
                    var alertDialog = AlertDialog.Builder(this)
                    alertDialog.setTitle("Exiting App")
                    alertDialog.setMessage("Are you sure you want to exit")
                    alertDialog.setNegativeButton("No", null)
                    alertDialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                        finish()
                    })
                    alertDialog.create().show()
                 
                }
            }
        }
    }
}