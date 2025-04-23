package com.allapps.myfirstcomposeapp.components.layout.exercicise2constraint

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
fun MyExerciseConstraint(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxGreen, boxBlack, boxGray, boxGrayBlack, boxCyan) = createRefs()

        Box(Modifier.size(175.dp).background(Color.Cyan).constrainAs(boxCyan) {
            bottom.linkTo(boxMagenta.top)
            end.linkTo(boxMagenta.end)
        })

        Box(Modifier.size(75.dp).background(Color.Black).constrainAs(boxBlack) {
            start.linkTo(boxCyan.end)
            top.linkTo(boxCyan.top)
            bottom.linkTo(boxCyan.bottom)

        })


        Box(Modifier.size(175.dp).background(Color.Gray).constrainAs(boxGrayBlack) {
            bottom.linkTo(boxGreen.top)
            start.linkTo(boxGreen.start)
        })

        Box(Modifier.size(75.dp).background(Color.Magenta).constrainAs(boxMagenta) {
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })

        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen) {
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })

        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow) {
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            bottom.linkTo(parent.bottom)
        })

        Box(Modifier.size(175.dp).background(Color.Blue).constrainAs(boxBlue) {
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.start)
            end.linkTo(boxYellow.end)
        })

        Box(Modifier.size(75.dp).background(Color.Gray).constrainAs(boxGray) {
            top.linkTo(boxBlue.top)
            end.linkTo(boxYellow.start)
        })

        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(boxBlue.top)
            start.linkTo(boxYellow.end)
        })

    }
}