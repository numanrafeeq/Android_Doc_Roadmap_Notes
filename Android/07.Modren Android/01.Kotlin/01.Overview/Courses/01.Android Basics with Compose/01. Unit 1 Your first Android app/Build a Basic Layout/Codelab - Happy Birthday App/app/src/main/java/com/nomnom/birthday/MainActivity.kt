package com.nomnom.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nomnom.birthday.ui.theme.CodelabHappyBirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabHappyBirthdayAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingImage()
                }
            }
        }
    }

    @Composable
    fun GreetingWithColumn(message: String, from: String, modifier: Modifier = Modifier) {

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
        ) {
            Text(
                text = message,
                modifier = modifier,
                fontSize = 80.sp,
                lineHeight = 80.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = from,
                modifier = modifier,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

    }
}


@Composable
fun Greeting(message: String, from: String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = message,
            modifier = modifier,
            fontSize = 80.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            modifier = modifier,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun HelloWorldText() {
    Row {
        Text(
            text = "Hello World",
            fontSize = 24.sp,
            lineHeight = 200.sp
        )

        Text(
            text = "Hello New World",
            fontSize = 24.sp,
            lineHeight = 200.sp
        )
    }
}


@Composable
fun ColumExample() {

    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Some text ")
        Text("Some more text ")
        Text("Last text ")
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    GreetingImage()
}