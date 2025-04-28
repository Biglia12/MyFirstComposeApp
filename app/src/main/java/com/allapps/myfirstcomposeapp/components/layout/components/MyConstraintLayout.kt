package com.allapps.myfirstcomposeapp.components.layout.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

//@Preview(showBackground = true)
@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxGreen) = createRefs()

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(boxGreen.bottom) //la parte de arriba se engancha a la parte de abajo del elemento
                end.linkTo(boxGreen.start)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                top.linkTo(boxGreen.bottom)
                start.linkTo(boxGreen.end)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                bottom.linkTo(boxGreen.top)
                start.linkTo(boxGreen.end)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(boxGreen.top)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })
    }
}

@Composable
fun ConstraintExampleGuide(modifier: Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        //val topGuide = createGuidelineFromTop(25.dp)

        val boxRed = createRef()
        val topGuide = createGuidelineFromTop(0.1f)

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(topGuide)
            })

    }
}


@Composable
fun ConstraintBarrier(modifier: Modifier) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues()) // para que tenga los limites del status bar
    ) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(
            boxRed,
            boxYellow
        ) //el elemento q mas sobresalga es el que le da limite a esta barrear imaginaria

        Box(modifier = Modifier
            .size(65.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })

        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                top.linkTo(boxRed.bottom, margin = 40.dp)
                start.linkTo(boxRed.end, margin = 30.dp)
            })

        Box(
            modifier = Modifier
                .size(70.dp)
                .background(Cyan)
                .constrainAs(boxCyan) {
                    start.linkTo(barrier)
                }
        )
    }
}

@Composable
fun ConstrainChain(modifier: Modifier) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues()) // para que tenga los limites del status bar
    ) {

        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(modifier = Modifier
            .size(65.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(boxYellow.top)
            })

        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxRed.bottom)
                bottom.linkTo(boxCyan.top)
            })

        Box(
            modifier = Modifier
                .size(70.dp)
                .background(Cyan)
                .constrainAs(boxCyan) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(boxYellow.bottom)
                    bottom.linkTo(parent.bottom)
                }
        )

        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.Spread)
    }
}
