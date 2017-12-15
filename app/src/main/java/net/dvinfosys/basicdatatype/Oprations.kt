package net.dvinfosys.basicdatatype

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Oprations : AppCompatActivity() {

    var output: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oprations)

        val number = findViewById<Button>(R.id.btn_numbers)
        number.setOnClickListener {
            val a: Int = 10000
            val b: Double = 100.100
            val c: Float = 1010.00f
            val d: Long = 10000000000
            val e: Short = 10
            val f: Byte = 1

            val simpleAlert = AlertDialog.Builder(this).create()
            simpleAlert.setTitle("Data Type Number")
            simpleAlert.setMessage("Int : " + a + "\nDouble : " + b + "\nFloat : " + c + "\nLong : " + d + "\nShort : " + e + "\nByte : " + f)
            simpleAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Ok", { dialogInterface, i ->
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            })
            simpleAlert.show()
        }
        val charbutton = findViewById<Button>(R.id.btn_characters)
        charbutton.setOnClickListener {
            val latter: Char
            latter = 'A'
            Toast.makeText(this, "Char : " + latter, Toast.LENGTH_SHORT).show()

        }
        val boolbutton = findViewById<Button>(R.id.btn_boolean) as Button
        boolbutton.setOnClickListener {
            val bool: Boolean
            bool = true
            Toast.makeText(this, "Boolean : " + bool, Toast.LENGTH_SHORT).show()
        }
        val stringButton = findViewById<Button>(R.id.btn_string)
        stringButton.setOnClickListener {
            var rawString: String = "I am Raw String!"
            val escapedString: String = "I am escaped String!\n"

            Toast.makeText(this, "String : " + rawString + "\n" + escapedString, Toast.LENGTH_SHORT).show()
            /*println("Hello!"+escapedString)
            println("Hey!!"+rawString)*/
        }
        val arrButton = findViewById<Button>(R.id.btn_array)
        arrButton.setOnClickListener {
            val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
            Toast.makeText(this, "Array : " + numbers[3], Toast.LENGTH_SHORT).show()
        }
        val ranButton = findViewById<Button>(R.id.btn_ranges)
        ranButton.setOnClickListener {

            for (j in 1..10) {
                output += j.toString()
                Log.i("info",output)
            }
            val outputTextView=findViewById<TextView>(R.id.tv_output)
            outputTextView.setText(output)
        }
        /*val outputTextView=findViewById<TextView>(R.id.tv_output)
        outputTextView.setText(output)*/

    }
}
