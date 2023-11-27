package de.syntaxinstitut.intentnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extra : String  = intent.extras?.getString("extra1")!!

        val btn = findViewById<Button>(R.id.shareBTN)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)

            //Dem intent einen Inhalt geben
            intent.putExtra(Intent.EXTRA_TEXT, extra)

            //Dem intent den typ "plain/text" geben um alle Apps anzusprechen
            //Die diesen typen verarbeiten
            intent.type = "text/plain"

            //Android die Information dass wir ein Auswahlfenster für die Apps haben wollen
            val chooser = Intent.createChooser(intent, null)

            //Auswahl intent starten
            startActivity(chooser)
        }


    }
}