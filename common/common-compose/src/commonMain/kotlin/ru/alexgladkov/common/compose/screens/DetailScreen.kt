package ru.alexgladkov.common.compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.alexgladkov.common.compose.NavigationTree
import ru.alexgladkov.odyssey.core.RootController

data class DetailParams(val title: String)

@Composable
fun DetailScreen(rootController: RootController, param: DetailParams) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.padding(24.dp),
            text = "Detail Screen with $param", fontWeight = FontWeight.Medium, fontSize = 28.sp,
            color = Color.Black
        )

        Row(modifier = Modifier.align(Alignment.BottomStart).fillMaxWidth().padding(16.dp)) {
            Button(onClick = {
                rootController.popBackStack()
            }) {
                Text("Go back")
            }

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}