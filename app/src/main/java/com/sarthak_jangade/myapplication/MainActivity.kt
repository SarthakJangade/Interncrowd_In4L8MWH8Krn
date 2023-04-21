package com.sarthak_jangade.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd =findViewById<Button>(R.id.btnAdd)
        val btnsub =findViewById<Button>(R.id.btnSub)
        val btnmul =findViewById<Button>(R.id.btnMul)
        val btndiv =findViewById<Button>(R.id.btnDiv)
        val edtno =findViewById<EditText>(R.id.No1)
        val edtno2 =findViewById<EditText>(R.id.No2)
        btnAdd.setOnClickListener {
            if(edtno.text.toString()!="" && edtno2.text.toString()!="" ){
                val no1 = edtno.text.toString().toInt()
                val no2 = edtno2.text.toString().toInt()

                val sum = no1+no2
                Toast.makeText(this,"The Addition is $sum",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"please fill all the required Blanks.",Toast.LENGTH_LONG).show()
            }
        }
        btnsub.setOnClickListener {
            if(edtno.text.toString()!="" && edtno2.text.toString()!="" ){
                val no1 = edtno.text.toString().toInt()
                val no2 = edtno2.text.toString().toInt()

                val sub = no1-no2
                Toast.makeText(this,"The Subtraction is $sub",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"please fill all the required Blanks.",Toast.LENGTH_LONG).show()
            }
        }
        btnmul.setOnClickListener {
            if(edtno.text.toString()!="" && edtno2.text.toString()!="" ){
                val no1 = edtno.text.toString().toInt()
                val no2 = edtno2.text.toString().toInt()

                val mul = no1*no2
                Toast.makeText(this,"The multiplication is $mul",Toast.LENGTH_LONG).show();


            }else{
                Toast.makeText(this,"please fill all the required Blanks.",Toast.LENGTH_LONG).show()
            }
        }
        btndiv.setOnClickListener {
            if(edtno.text.toString()!="" && edtno2.text.toString()!="" ){
                val no1 = edtno.text.toString().toInt()
                val no2 = edtno2.text.toString().toInt()

                val div = no1/no2
                Toast.makeText(this,"The division is $div.",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"please fill all the required Blanks.",Toast.LENGTH_LONG).show()
            }
        }

    }
}