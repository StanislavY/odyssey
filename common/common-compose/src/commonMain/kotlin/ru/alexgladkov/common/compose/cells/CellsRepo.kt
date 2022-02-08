package ru.alexgladkov.common.compose.cells

class CellsRepo {
    var listToOpen:List<Int> = listOf(1,4,6,8)//заглушка для списка открываемых ячеек
    var listOfCells:MutableList<CellsEntity> = mutableListOf(
        CellsEntity(1,"Ромашка, 50 г"),
        CellsEntity(2,"Мать-и мачеха, 50 г"),
        CellsEntity(3,"Девясила корень, 50 г")



    )



}