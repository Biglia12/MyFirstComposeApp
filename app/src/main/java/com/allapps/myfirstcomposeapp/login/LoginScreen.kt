package com.allapps.myfirstcomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview( //solo afecta a la preview no al real
    /*    widthDp = 20,
        heightDp = 20,
        showBackground = true,
        showSystemUi = true,
        device = Devices.PIXEL_4*/
)

@Composable
fun ExamplePreview() { //para q pueda mostrarse y no afecte para previsualizar
    Example("AndroidLogin")
}

@Composable
fun Example(a: String) {
    Text(
        text = "aaa $a", modifier = Modifier
            .background(Color.Red)
            .padding(30.dp)
    )
}
