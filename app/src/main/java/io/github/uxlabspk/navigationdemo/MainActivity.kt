package io.github.uxlabspk.navigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import io.github.uxlabspk.navigationdemo.ui.navigation.Navigation
import io.github.uxlabspk.navigationdemo.ui.theme.NavigationDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavigationDemoTheme {
                Navigation(navController)
            }
        }
    }
}



@Preview(
    showBackground = true,
    widthDp = 300,
    heightDp = 700
)
@Composable
fun NavigationPreview() {
    val navController = rememberNavController()
    NavigationDemoTheme {
        Navigation(navController)
    }
}
