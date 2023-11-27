package de.syntaxinstitut.intentnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.weiterBTN)

        //intent der diese Activity gestartet
        intent

        Intent.ACTION_SEND

        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra1", "Hallo Syntax!")
            startActivity(intent)
        }
    }
}