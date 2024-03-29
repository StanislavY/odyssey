package ru.alexgladkov.odyssey.compose.helpers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import ru.alexgladkov.odyssey.compose.extensions.observeAsState
import ru.alexgladkov.odyssey.core.NavigationEntry
import ru.alexgladkov.odyssey.core.controllers.MultiStackRootController

/**
 * Bottom item model
 * Helper class to create bottom navigation host
 * @see BottomNavigationHost
 *
 * @property title - tab title
 * @property style - tab title style
 * @property icon - tab icon
 */
data class BottomItemModel(val title: String, val style: TextStyle = TextStyle.Default, val icon: Painter? = null)

/**
 * Bottom navigation colors
 * Helper class to create bottom navigation host
 * @see BottomNavigationHost
 *
 * @property selectedColor - color when tab selected
 * @property unselectedColor - color when tab unselected
 * @property backgroundColor
 */
data class BottomNavigationColors(
    val selectedColor: Color = Color.Black,
    val unselectedColor: Color = Color.DarkGray,
    val backgroundColor: Color = Color.White
)

@Composable
fun BottomNavigationHost(
    screenBundle: ScreenBundle,
    bottomNavigationColors: BottomNavigationColors = BottomNavigationColors(),
    bottomItemModels: List<BottomItemModel>
) {
    val multiStackRootController = screenBundle.rootController as MultiStackRootController
    val state = multiStackRootController.backStackObserver.observeAsState(multiStackRootController.backStack.first())
    state.value?.let {
        BottomNavigationView(
            bottomNavigationColors = bottomNavigationColors,
            screenBundle = screenBundle,
            entry = it,
            multiStackRootController = multiStackRootController,
            bottomItemModels = bottomItemModels
        )
    }
}

@Composable
fun BottomNavigationView(
    bottomNavigationColors: BottomNavigationColors,
    entry: NavigationEntry,
    screenBundle: ScreenBundle,
    multiStackRootController: MultiStackRootController,
    bottomItemModels: List<BottomItemModel>
) {
    Column(modifier = Modifier.fillMaxSize().background(bottomNavigationColors.backgroundColor)) {
        Box(modifier = Modifier.weight(1f)) {
            TabHost(
                screenBundle = ScreenBundle(rootController = entry.rootController, screenMap = screenBundle.screenMap),
                navigationEntry = entry,
            )
        }

        BottomNavigation(
            backgroundColor = bottomNavigationColors.backgroundColor
        ) {
            multiStackRootController.childrenRootController.forEach { flowRootController ->
                val position = multiStackRootController.childrenRootController.indexOf(flowRootController)
                val isSelected = entry.rootController == flowRootController
                val bottomItemModel = bottomItemModels[position]

                BottomNavigationItem(
                    modifier = Modifier.background(bottomNavigationColors.backgroundColor),
                    selected = isSelected,
                    icon = {
                        bottomItemModel.icon?.let {
                            Icon(
                                painter = it,
                                contentDescription = bottomItemModel.title,
                                tint = if (isSelected) bottomNavigationColors.selectedColor else bottomNavigationColors.unselectedColor
                            )
                        }
                    },
                    onClick = {
                        multiStackRootController.switchFlow(position, flowRootController)
                    },
                    label = {
                        Text(
                            text = bottomItemModel.title,
                            style = bottomItemModel.style,
                            color = if (isSelected) bottomNavigationColors.selectedColor else bottomNavigationColors.unselectedColor
                        )
                    }
                )
            }
        }
    }
}