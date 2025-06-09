package com.allapps.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.allapps.myfirstcomposeapp.login.Greeting
import com.allapps.myfirstcomposeapp.states.MyState
import com.allapps.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MyState(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name",
        modifier = modifier
    )
}*/

@Preview(showBackground = true, showSystemUi = true) //esto peudo modificarlo para previsualizar pero no cambia nada en la view
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("AndroidMain")
    }
}