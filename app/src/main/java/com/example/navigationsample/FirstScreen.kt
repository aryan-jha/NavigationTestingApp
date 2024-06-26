package com.example.navigationsample


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navigationsample.ui.theme.NavigationSampleTheme


//@Preview(showBackground = true)
@Composable
fun FirstScreen(navToSecond:(String,Int)->Unit) {
    var input by remember{ mutableStateOf("") }
    var age by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "This is the first screen")

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = input, onValueChange = {
            input = it
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = age.toString(), onValueChange = {
            age = it.toInt()
        })

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            navToSecond(input,age)
        }) {
            Text(text = "Go to second Screen")
        }
    }
}