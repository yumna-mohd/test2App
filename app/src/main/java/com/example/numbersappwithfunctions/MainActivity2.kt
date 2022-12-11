package com.example.numbersappwithfunctions

import android.speech.tts.TextToSpeech
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {

    lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //one
        button.setOnClickListener{
            te(textView)
        }
        //two
        button2.setOnClickListener {
            te(textView2)
        }
        //three
        button3.setOnClickListener {
            te(textView3)
        }
        //four
        button4.setOnClickListener{
            te(textView4)
        }
        //five
        button5.setOnClickListener{
            te(textView5)
        }
    }

    private fun te(textView: TextView?) {

    }

    fun to(tex: TextView) {
        tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
            if (it == TextToSpeech.SUCCESS)
            {
                tts.language= Locale.UK
                tts.setSpeechRate(1.05f)

                tts.speak(tex.text.toString(), TextToSpeech.QUEUE_ADD, null)
            }
        })
    }
}