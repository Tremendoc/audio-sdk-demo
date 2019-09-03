package com.e.tremendoc_audio_sdk_sample_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.e.audio_sdk.AudioSdk_Setup

class MainActivity : AppCompatActivity() {

    private var button:Button?=null
    private var tremendoc_audio_sdk:AudioSdk_Setup?=null


    companion object{
        val  SDK_TYPE= "Audio"
        val  PROVIDER_ID = "1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button=findViewById(R.id.talkDoctor)
        tremendoc_audio_sdk = AudioSdk_Setup(this, PROVIDER_ID ,SDK_TYPE)

        button!!.setOnClickListener { view ->
            tremendoc_audio_sdk!!.sdk_Setup("myuserEmail@gmail.com")
        }
    }
}
