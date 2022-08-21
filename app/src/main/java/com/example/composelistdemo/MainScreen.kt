package com.example.composelistdemo

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    BoxWithConstraints {
        Log.d("ncq", "minWidth = $minWidth maxWidth = $maxWidth")
        Log.d("ncq", "minHeight = $minHeight maxHeight = $maxHeight")
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.Blue)
                .padding(8.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = "Hello World!", color = Color.White)
        }
    }
}