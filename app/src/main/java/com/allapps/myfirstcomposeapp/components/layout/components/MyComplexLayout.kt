package com.allapps.myfirstcomposeapp.components.layout.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier) {
    Column(modifier) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        ) {}
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp)
                        .background(Color.Green),
                ) {
                    Text("Hola111")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .background(Color.Magenta)
                ) {
                    Text("Hola111")
                }
            }

        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow)
        ) {}
    }
}