package com.example.firstapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.ui.theme.HelloWorldComposeTheme
import com.example.helloworldcompose.R

class SylingTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting3()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting3() {
    HelloWorldComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                Text(
                    text = "Welcome to Code Jogging3",
                    style = typography.bodyLarge,
                    modifier = Modifier.fillMaxWidth(),
                    textDecoration = TextDecoration.Underline,
                    fontFamily = FontFamily(Font(R.font.lobster))
                )
                Text(
                    text = "Welcome to Jetpack Compose Ui",
                    style = typography.bodyLarge,
                    modifier = Modifier.fillMaxWidth(),
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Welcome to Youtube Channel",
                    style = typography.bodyLarge,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Green,
                    fontSize = 40.sp
                )
                Text(text = buildAnnotatedString {
                    append("Welcome ")
                    append("to ")
                    withStyle(style = SpanStyle(color = Color.Red, fontSize = 30.sp)){
                        append("Code ")
                    }
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 40.sp)){
                        append("J")
                    }
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 30.sp, textDecoration = TextDecoration.Underline)){
                        append("ogging")
                    }

                }, fontFamily = FontFamily(Font(R.font.lobster)))
            }
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview2() {
//    HelloWorldComposeTheme {
//        Greeting3()
//    }
//}