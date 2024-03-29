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
import ru.alexgladkov.odyssey.core.animations.AnimationType

@Composable
fun OnboardingScreen(rootController: RootController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.padding(24.dp),
            text = "Onboarding Screen", fontWeight = FontWeight.Medium, fontSize = 28.sp,
            color = Color.Black
        )

        Row(modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)) {
            Button(onClick = {
                rootController.push(NavigationTree.Auth.Login.toString(), params ="Onboarding")
            }) {
                Text("Go to Login")
            }
        }
    }
}