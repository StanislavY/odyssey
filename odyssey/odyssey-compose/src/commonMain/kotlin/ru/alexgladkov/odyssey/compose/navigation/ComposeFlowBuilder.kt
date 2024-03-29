package ru.alexgladkov.odyssey.compose.navigation

import androidx.compose.runtime.Composable
import ru.alexgladkov.odyssey.compose.helpers.MutableScreenMap
import ru.alexgladkov.odyssey.compose.helpers.ScreenBundle
import ru.alexgladkov.odyssey.compose.helpers.ScreenMap
import ru.alexgladkov.odyssey.core.RootController
import ru.alexgladkov.odyssey.core.animations.AnimationType
import ru.alexgladkov.odyssey.core.destination.DestinationFlow
import ru.alexgladkov.odyssey.core.destination.DestinationScreen

/**
 * Compose flow builder, declarative helper for navigation graph builder
 * @see DestinationFlow
 * @param name - flow name
 */
class ComposeFlowBuilder(val name: String) {

    private val _destinations: MutableList<DestinationScreen> = mutableListOf()
    private val _screenMap: MutableScreenMap = hashMapOf()

    val screenMap: ScreenMap = _screenMap

    fun addScreen(name: String, content: @Composable ScreenBundle.() -> Unit) {
        _destinations.add(DestinationScreen(name))
        _screenMap[name] = content
    }

    fun build(): DestinationFlow = DestinationFlow(
        name = name,
        screens = _destinations
    )
}

fun ComposeFlowBuilder.screen(name: String,
                              content: @Composable ScreenBundle.() -> Unit) {
    addScreen(name = name, content = content)
}