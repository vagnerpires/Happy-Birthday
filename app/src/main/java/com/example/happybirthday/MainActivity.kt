package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    // This is the entry point of the app. It is the first function that is called when the app
    // is opened. It sets the content of the app to the BirthdayGreetingWithImage composable
    // function.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithImage("Happy Birthday", "From Android")
                }
            }
        }
    }
}

// This is the main screen of the app. It is a composable function that takes in two strings
// and displays them on the screen.
@Composable
fun BirthdayGreetingWithImage(greeting: String, signature: String) {
    Box(modifier = Modifier.fillMaxSize() ) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = greeting,
            modifier = Modifier.align(Alignment.TopStart),
            color = Color.Black,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
        )
        Text(
            text = signature,
            modifier = Modifier.align(Alignment.BottomEnd),
            color = Color.Black,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center
        )
    }
}

// This is a preview function that allows us to see what the BirthdayGreetingWithImage composable
// function will look like when we are designing our app. It is not part of the app, and Android
// Studio will ignore it.
@Preview(showBackground = true)
@Composable
fun BirthdayGreetingPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage("Happy Birthday", "From Android")
    }
}
