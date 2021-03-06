package dev.farhanroy.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.farhanroy.composeicon.ComposeIcon
import dev.farhanroy.composeicon.evilicons.EvilIcons
import dev.farhanroy.example.ui.theme.ComposeIconTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIconTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    ComposeIcon(icon = EvilIcons.archive)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeIconTheme {
        Greeting("Android")
    }
}