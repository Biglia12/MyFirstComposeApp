package com.allapps.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Jose")
        Text(text = "Jose Rojo", color = Color.Red)
        Text(text = "Jose", fontSize = 30.sp)
        Text(text = "Jose", fontStyle = FontStyle.Italic)
        Text(text = "Jose", fontWeight = FontWeight.ExtraBold)
        Text(
            text = "Jose",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic
        )
        Text("LetterSpaccing", letterSpacing = 2.sp)
        Text("TextDecoration", textDecoration = TextDecoration.LineThrough)
        Text(
            "TextDecoration",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )

        Text(
            "Align, Align, Align, Align, Align, Align, Align, Align, Align, Align, Align, Align, Align, pepe",
            modifier = Modifier.fillMaxWidth().background(Color.Red),   //Esto hace que el texto ocupe todo el ancho disponible y servira para las propiedades de alineacion
            maxLines = 1,
            textAlign = TextAlign.Center, // Alinea el texto al centro
            overflow = TextOverflow.Ellipsis
        )
    }
}