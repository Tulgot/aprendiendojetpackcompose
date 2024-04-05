package com.example.firstapp.ui

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.ui.theme.HelloWorldComposeTheme
import com.example.helloworldcompose.R

class ColumnsRowsMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldComposeTheme{
                Column(modifier = Modifier.fillMaxSize()) {
                    ColumsandLayout()
                    RowsLayout()
                    columnrow()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumsandLayout() {
        // A surface container using the 'background' color from the theme
        Column(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(R.color.grey))
                .verticalScroll(rememberScrollState())) {
            Text(text = "frist data", style = typography.bodySmall)
            Text(text = "second data", style = typography.bodySmall)
            Text(text = "third data", style = typography.bodySmall)
            Text(text = "fourth data", style = typography.bodySmall)
            Text(text = "fifth data", style = typography.bodySmall)
            Text(text = "sixth data", style = typography.bodySmall)
            Text(text = "seventh data", style = typography.bodySmall)
            Text(text = "eight data", style = typography.bodySmall)
        }
}

@Preview(showBackground = true)
@Composable
fun RowsLayout() {
        Row(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(R.color.pink))
                .horizontalScroll(rememberScrollState())) {
            Text(text = "frist data", style = typography.bodySmall)
            Text(text = "second data", style = typography.bodySmall)
            Text(text = "third data", style = typography.bodySmall)
            Text(text = "fourth data", style = typography.bodySmall)
            Text(text = "fifth data", style = typography.bodySmall)
            Text(text = "sixth data", style = typography.bodySmall)
            Text(text = "seventh data", style = typography.bodySmall)
            Text(text = "eight data", style = typography.bodySmall)
        }
}

@Preview(showBackground = true)
@Composable
 fun columnrow() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState())) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())){
            repeat(50){
                Text(text = "rowdata $it")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        repeat(200){
            Text(text = "columdata $it")
        }
    }
}