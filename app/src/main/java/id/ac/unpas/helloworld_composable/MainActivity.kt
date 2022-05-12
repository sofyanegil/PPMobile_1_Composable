package id.ac.unpas.helloworld_composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.ac.unpas.helloworld_composable.ui.theme.HelloWorldComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldComposableTheme {
                Main()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldComposableTheme {
        Greeting("Android")
    }
}