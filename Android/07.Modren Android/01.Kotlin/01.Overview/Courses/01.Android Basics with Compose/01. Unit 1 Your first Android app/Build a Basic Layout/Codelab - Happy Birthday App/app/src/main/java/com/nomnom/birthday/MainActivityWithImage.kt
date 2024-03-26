package com.nomnom.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.nomnom.birthday.ui.theme.CodelabHappyBirthdayAppTheme

class MainActivityWithImage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabHappyBirthdayAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun BoxExample() {

    Box {
        //Composable function 1
        //Composable function 2
    }
}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )

        Text(
            text = "Hello World",
            fontSize = 50.sp,
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center
        )


    }

    // Example
    Text(
        text = "Hello, World!",
        // Solid element background color
        modifier = Modifier.background(color = Color.Green)
    )
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Preview() {
    GreetingImage()
}