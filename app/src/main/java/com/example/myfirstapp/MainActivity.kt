package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("haru-chan")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var uncchi by remember { mutableStateOf<String>("push")}
    Log.d("button_click",uncchi)
    Column(modifier = Modifier.fillMaxSize()){
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "papa",
            modifier = modifier
        )
        Button(onClick = {
            uncchi = "pull"
            Log.d("button_click",uncchi)
        }) {

            Text(
                text = uncchi,
                modifier = modifier
            )
            Log.d("button_click",uncchi)
        }
        Row {
            Text(
                text = "mama",
                modifier = modifier
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                text = "jiji",
                modifier = modifier
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppTheme {
        Greeting("haruchan")
    }
}