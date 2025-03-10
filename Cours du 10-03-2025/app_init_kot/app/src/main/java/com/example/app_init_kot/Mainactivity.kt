package com.example.app_init_kot
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Mainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Création du bouton
        val myButton = Button(this).apply {
            text = "Appuyer ici"
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setOnClickListener { //2ème exercice
                val intent_other = Intent(this@Mainactivity,OtherActivity::class.java)
                startActivity(intent_other)
            }
        }

        layout.addView(myButton)
        setContentView(layout)
    }
}

class OtherActivity : AppCompatActivity() {
    var compteur  = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Création du bouton
        val myText = TextView(this).apply {
            text = "Other activity"
            textSize = 24f
        }

        val ButtonCompteur = Button(this).apply{ //3ème exercice
            text = "Push to increment"
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setOnClickListener{
                compteur += 1;
                myText.text = "Other activity compteur : $compteur"
            }
        }

        layout.addView(myText)
        layout.addView(ButtonCompteur)
        setContentView(layout)
    }
}