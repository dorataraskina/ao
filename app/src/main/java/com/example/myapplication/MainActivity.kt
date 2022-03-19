package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Yellow700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Fon()
                    Main()
                }
            }
        }
    }
}

@Composable
fun Fon() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
        Image(
            modifier = Modifier
                .width(186.dp)
                .height(168.dp),
            bitmap = ImageBitmap.imageResource(id = R.drawable.elip2),
            contentDescription = "ellipse2"
        )

        Box(contentAlignment = Alignment.TopStart) {
            Image(
                modifier = Modifier
                    .width(396.dp)
                    .height(196.dp),
                bitmap = ImageBitmap.imageResource(id = R.drawable.elip1),
                contentDescription = "ellipse1"
            )
        }

    }
}

@Composable
fun Main() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 111.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .height(365.dp)
                .width(319.dp),
            bitmap = ImageBitmap.imageResource(id = R.drawable.group),
            contentDescription = "people"
        )

        Text(
            modifier = Modifier
                .padding(top = 55.dp),
            text = "Explore the app",
            color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier
                .padding(top = 12.dp)
                .width(341.dp)
                .height(84.dp),
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi maecenas quis interdum enim enim molestie faucibus. Pretium non non massa eros, nunc, urna. Ac laoreet sagittis donec vel. Amet, duis justo, quam quisque egestas. Quam enim at dictum condimentum. Suspendisse.",
            color = Color.Black,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 54.dp)
                .height(48.dp)
                .width(328.dp),
            colors = ButtonDefaults.buttonColors(Yellow700)
        ) {
            Text(
                text = "Lets Start",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun Registration() {
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Fon()
        Main()
    }
}