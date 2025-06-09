package com.allapps.myfirstcomposeapp.states

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {
    //var number = remember { mutableStateOf(0) }//peude recibir el valor que queramos
    var number by rememberSaveable { mutableIntStateOf(0) }//para cuando rotemos la pantalla sirve para no perder el valor
    //Ademas usar by(state property) nos ahorra estar poniendo .value para obtener el valor en cada linea de codigo

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
    ) {
        StateExample1(number) { number += 1 }//puede hacerse de esta manera cuando es lambda es el ultimo parametro
        StateExample2(number = number, onClick = { number += 1 })
    }

}


@Composable
fun StateExample1(number: Int, onClick: () -> Unit) {
    Text("Púlsame: $number", modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExample2(number: Int, onClick: () -> Unit) {
    Text("Púlsame: $number", modifier = Modifier.clickable { onClick() })
}