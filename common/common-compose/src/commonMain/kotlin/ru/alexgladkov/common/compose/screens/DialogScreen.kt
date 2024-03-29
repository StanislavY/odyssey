package ru.alexgladkov.common.compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.alexgladkov.common.compose.NavigationTree
import ru.alexgladkov.odyssey.core.RootController

data class DialogParams(val value: String)

@Composable
fun DialogScreen(rootController: RootController, params: DialogParams) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(
                text = "Modal Dialog Screen with ${params.value}", fontWeight = FontWeight.Medium, fontSize = 28.sp,
                color = Color.Black
            )
        }

        Row(modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)) {
            Button(onClick = {
                rootController.popBackStack()
            }) {
                Text("Close Dialog")
            }
        }
    }
}