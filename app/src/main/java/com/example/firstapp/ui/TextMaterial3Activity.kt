package com.example.firstapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.ui.ui.theme.HelloWorldComposeTheme

class TextMaterial3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldComposeTheme {
                Column (modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)){
                    Modifiers()
                    ScreenMods()
                    Sizes()
                }
                // A surface container using the 'background' color from the theme


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Modifiers(modifier: Modifier = Modifier) {
    // Modifiers
    Text(
        text = "Welcome to Material3 Compose",
        style = MaterialTheme.typography.labelSmall,
        modifier = modifier
            .background(Color.Red)
            .fillMaxWidth()
//            .padding(top = 10.dp, bottom = 10.dp, start = 10.dp),
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .heightIn(min = 50.dp, max = 70.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun ScreenMods(modifier: Modifier = Modifier) {
    Text(text = "Using % of screen",
        style = MaterialTheme.typography.labelSmall,
        modifier = modifier
            .background(Color.Blue)
            .fillMaxSize(0.4F)
    )
}

@Preview(showBackground = true)
@Composable
fun Sizes(){
    Text(text = "Max min each size",
        style = MaterialTheme.typography.labelSmall,
    modifier = Modifier
        .background(Color.Green)
        .padding(all = 10.dp)
        .widthIn(min = 50.dp, max = 70.dp))
}
