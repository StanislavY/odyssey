package ru.alexgladkov.common.compose.screens



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import ru.alexgladkov.common.compose.cells.CellsEntity
import ru.alexgladkov.common.compose.cells.CellsRepo
import ru.alexgladkov.odyssey.core.LaunchFlag
import ru.alexgladkov.odyssey.core.RootController
import ru.alexgladkov.odyssey.core.animations.AnimationType
import ru.alexgladkov.odyssey.core.animations.defaultFadeAnimation
import ru.alexgladkov.odyssey.core.animations.defaultPresentationAnimation

var cellsRepo:CellsRepo= CellsRepo()
@Composable
fun SplashScreen(rootController: RootController) {

LazyRow {
    item { CellsTab() }
    item{ ListOfGoods()}
}
    /*  Column {
           for (num in 1..13) {
               Button(onClick = {  }) {
                   Text("Ячейка $num")

               }
               Text("нажата кнопка $num")
           }
       }*/


    /*  Row(
            modifier = Modifier.fillMaxSize()


        ) {


            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 4")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 5")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 6")


            }
        }


    }
}*/

}
@Composable
fun CellsTab(){
    LazyColumn(modifier = Modifier.absolutePadding(right = 20.dp)) {
        item { CellsRow1() }
        item { CellsRow2() }
        item { CellsRow3() }


    }



}
    @Composable
    fun CellsRow1() {
        Row(
            modifier = Modifier.fillMaxSize()


        ) {


            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 1")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 2")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 3")

            }


        }
    }

    @Composable
    fun CellsRow2() {
        Row(
            modifier = Modifier.fillMaxSize()


        ) {


            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 4")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 5")
            }
            Button(modifier = Modifier.padding(10.dp), onClick = { }) {
                Text("Ячейка 6")

            }


        }
    }
@Composable
fun CellsRow3() {
    Row(
        modifier = Modifier.fillMaxSize()


    ) {


        Button(modifier = Modifier.padding(10.dp), onClick = { }) {
            Text("Ячейка 7")
        }
        Button(modifier = Modifier.padding(10.dp), onClick = { }) {
            Text("Ячейка 8")
        }
        Button(modifier = Modifier.padding(10.dp), onClick = { }) {
            Text("Ячейка 9")

        }


    }
}
@Composable
fun ListOfGoods() {
    LazyColumn (modifier = Modifier.padding(10.dp)){

        for (cell in cellsRepo.listOfCells) {

            item () {
                Text(cell.name,fontSize = 20.sp)

            }

        }
    }
}






/*Button(onClick = {    }) {
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
}*/
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