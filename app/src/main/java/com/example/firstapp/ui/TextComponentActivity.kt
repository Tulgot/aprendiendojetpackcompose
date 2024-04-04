package com.example.firstapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.ui.theme.HelloWorldComposeTheme

class TextComponentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting4()
            Nextlayout()
        }
    }
}

@Preview(showBackground = true, name = "textselectioncomponent")
@Composable
fun Greeting4() {
    HelloWorldComposeTheme {
        // A surface container using the 'background' color from the theme
        Column(modifier = Modifier.fillMaxWidth()) {

            Text(text = "Cannot copy me", style = typography.displayMedium)

            SelectionContainer {
                Column {
                    Text(text = "can copy me", style = typography.displayMedium)
                    Text(text = "can copy me", style = typography.displayMedium)
                    Text(text = "can copy me", style = typography.displayMedium)
                }

            }
        }
    }
}

@Preview(showBackground = true, name = "SuperScript and Script in Text Component")
@Composable
fun Nextlayout() {
    //hello, world = superscript and subscript

    Column (modifier = Modifier.fillMaxWidth()){

        Text(text = buildAnnotatedString {
            withStyle(SpanStyle(fontSize = 40.sp)) {
                append("hello ")
            }
            withStyle(SpanStyle(fontSize = 30.sp, baselineShift = BaselineShift.Superscript)) {
                append("wolrd")
            }

        })
        Text(text = buildAnnotatedString {
            withStyle(SpanStyle(fontSize = 40.sp)) {
                append("hello ")
            }
            withStyle(SpanStyle(fontSize = 30.sp, baselineShift = BaselineShift.Subscript)) {
                append("wolrd")
            }

        })
    }
}