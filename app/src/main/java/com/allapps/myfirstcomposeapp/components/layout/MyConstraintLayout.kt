package com.allapps.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
   ConstraintLayout (modifier = modifier.fillMaxSize()) {
       val (boxRed, boxBlue, boxYellow, boxMagenta, boxGreen) = createRefs()

       Box(Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed){
           top.linkTo(boxGreen.bottom) //la parte de arriba se engancha a la parte de abajo del elemento
           end.linkTo(boxGreen.start)
       })

       Box(Modifier.size(150.dp).background(Color.Blue).constrainAs(boxBlue){
           top.linkTo(boxGreen.bottom)
           start.linkTo(boxGreen.end)
       })

       Box(Modifier.size(150.dp).background(Color.Magenta).constrainAs(boxMagenta){
           bottom.linkTo(boxGreen.top)
           start.linkTo(boxGreen.end)
       })

       Box(Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
           bottom.linkTo(boxGreen.top)
       })

       Box(Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
           bottom.linkTo(parent.bottom)
           end.linkTo(parent.end)
           top.linkTo(parent.top)
           start.linkTo(parent.start)
       })
   }
}