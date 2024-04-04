package com.example.firstapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            layout()
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun layout(){
    HelloWorldComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {

            var firstInput by remember { mutableStateOf("") }
            var secondInput by remember { mutableStateOf("") }
            var results by remember { mutableStateOf("Results") }
            val mContext = LocalContext.current

            // design UI
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(text = results)
                TextField(value = firstInput, onValueChange = {
                    firstInput = it
                })
                TextField(value = secondInput, onValueChange = {
                    secondInput = it
                })

                Button(onClick = {
                    if (firstInput.isNotEmpty() && secondInput.isNotEmpty()){
                        results = "Aswer = "+additionCalculator(firstInput.toInt(),secondInput.toInt())
                    }
                }) {
                    Text(text =  "Calculate")
                }

                Button(onClick = {
                    mContext.startActivity(Intent(mContext, SylingTextActivity::class.java))
                },
                    colors = ButtonDefaults.buttonColors(Color(0XFF0F9D58))
                ) {
                    Text(text = "SylingText")
                }
                Button(onClick = {
                    mContext.startActivity(Intent(mContext, TextActivity::class.java))
                    Toast.makeText(mContext, "holamundo", Toast.LENGTH_SHORT).show()
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFF44336))
                ) {
                    Text(text = "TextActivity")
                }
                Button(onClick = {
                    mContext.startActivity(Intent(mContext, TextComponentActivity::class.java))
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFEB3B))
                ) {
                    Text(text = "TextComponent", color= Color.Black)
                }
            }
        }
    }

}

fun additionCalculator(a: Int, b: Int) : Int = a+b

