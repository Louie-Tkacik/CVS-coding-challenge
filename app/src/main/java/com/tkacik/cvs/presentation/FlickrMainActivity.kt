package com.tkacik.cvs.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.tkacik.cvs.presentation.navigation.CvsNavGraph
import com.tkacik.cvs.presentation.theme.CvsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FlickrMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CvsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    CvsNavGraph(navController = navController)
                }
            }
        }
    }
}