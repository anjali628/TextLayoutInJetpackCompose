package com.demo.textlayoutinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.demo.textlayoutinjetpackcompose.ui.theme.TextLayoutInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextLayoutInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextLayout()
                }
            }
        }
    }
}


@Composable
fun TextLayout() {

    Text(
        text = "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello",
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        fontStyle = FontStyle.Italic,
        letterSpacing = 5.sp,
        lineHeight = 20.sp,
        //maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        //textAlign = TextAlign.Center,
    textDecoration = TextDecoration.LineThrough


    )
}