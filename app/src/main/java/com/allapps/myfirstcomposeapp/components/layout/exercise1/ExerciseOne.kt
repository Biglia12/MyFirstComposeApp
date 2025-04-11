package com.allapps.myfirstcomposeapp.components.layout.exercise1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ExerciseOne(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) { Text("Ejemplo1", modifier = Modifier.background(Color.Gray)) }

        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) { Text("Ejemplo2", modifier = Modifier.background(Color.Gray)) }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) { Text("Ejemplo3", modifier = Modifier.background(Color.Gray)) }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) { Text("Ejemplo4", color = Color.White) }
    }

}