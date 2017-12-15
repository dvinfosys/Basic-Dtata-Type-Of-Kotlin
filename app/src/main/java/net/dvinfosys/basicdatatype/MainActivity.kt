package net.dvinfosys.basicdatatype

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oprations =findViewById<Button>(R.id.btn_operations)
        oprations.setOnClickListener{
            val opt=Intent(this,Oprations::class.java);
            startActivity(opt)
        }
    }
}
