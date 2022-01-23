package ru.alexgladkov.common.compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.alexgladkov.common.compose.NavigationTree
import ru.alexgladkov.odyssey.core.LaunchFlag
import ru.alexgladkov.odyssey.core.RootController
import ru.alexgladkov.odyssey.core.animations.AnimationType
import ru.alexgladkov.odyssey.core.animations.defaultFadeAnimation
import ru.alexgladkov.odyssey.core.animations.defaultPresentationAnimation


@Composable
fun SplashScreen(rootController: RootController) {


    /*  Column {
           for (num in 1..13) {
               Button(onClick = {  }) {
                   Text("Ячейка $num")

               }
               Text("нажата кнопка $num")
           }
       }*/



    Column {


        Button(onClick = {    }) {
            Text("Ячейка 1")
        }
        Button(onClick = {    }) {
            Text("Ячейка 2")
        }
        Button(onClick = {    }) {
            Text("Ячейка 3")
        }
        Button(onClick = {    }) {
            Text("Ячейка 4")
        }
        Button(onClick = {    }) {
            Text("Ячейка 5")
        }
        Button(onClick = {    }) {
            Text("Ячейка 6")
        }
        Button(onClick = {    }) {
            Text("Ячейка 7")
        }
        Button(onClick = {    }) {
            Text("Ячейка 8")
        }
        Button(onClick = {    }) {
            Text("Ячейка 9")
        }
    }

    /*  Box(modifier = Modifier.fillMaxSize()) {
          Text(
              modifier = Modifier.padding(24.dp),
              text = "Splash Screen", fontWeight = FontWeight.Medium, fontSize = 28.sp,
              color = Color.Black
          )

          Column(modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)) {
              Row {
                  Button(onClick = {
                      rootController.present(
                          screen = NavigationTree.Root.Auth.toString(),
                          params = "Splash",
                          launchFlag = LaunchFlag.SingleNewTask
                      )
                  }) {
                      Text("Auth With No History")
                  }

                  Spacer(modifier = Modifier.weight(1f))

                  Button(onClick = {
                      rootController.present(
                          screen = NavigationTree.Root.Auth.toString(),
                          params = "Splash",
                      )
                  }) {
                      Text("Auth With History")
                  }
              }

          }
      }*/
}