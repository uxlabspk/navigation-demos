package io.github.uxlabspk.navigationdemo.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//  Used for one-time calls or reacting to state changes.
@Composable
fun LaunchedEffectExample() {
    var count by remember { mutableStateOf(0) }

    // Runs only when `count` changes
    LaunchedEffect(count) {
        println("LaunchedEffect triggered: $count")
    }

    Text(
        text = "" + count,
        modifier = Modifier
    )

    Button(onClick = { count++ }) {
        Text("Increment")
    }
}


// Launch coroutine from UI events
@Composable
fun RememberCoroutineScopeExample() {
    val scope = rememberCoroutineScope()

    Button(onClick = {
        scope.launch {
            delay(500)
            println("Button clicked coroutine")
        }
    }) {
        Text("Click Me")
    }
}


// Run on every recomposition (no suspending allowed)
@Composable
fun SideEffectExample(value: Int) {
    SideEffect {
        println("SideEffect ran: $value")
    }

    Text("Value: $value")
}


@Composable
@Preview
fun Preview() {
    LaunchedEffectExample()
    // RememberCoroutineScopeExample()
    // SideEffectExample(1)

}