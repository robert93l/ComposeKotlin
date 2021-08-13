package com.roberto1.composekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roberto1.composekotlin.ui.theme.ComposeKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
       helloApp()
            }
        }


@Preview(showBackground = true)
@Composable
fun helloApp(){
    ComposeKotlinTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Greeting("Android")
}}}

@Preview(showBackground = true)
@Composable
fun exampleModifier(){
    Text(text = "suscribite", modifier = Modifier.padding(16.dp))
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeKotlinTheme {
        Greeting("Que onda Roberto")
    }}


@Preview(showBackground = true, name = "Texto prueba")
    @Composable
    fun SecondPreview() {
        ComposeKotlinTheme {
            Greeting("Que onda perrotes")
        }

}
    @Preview(showBackground = true)
    @Composable
    fun example2modifier(){
        Text(text = "modifier#2ejemplo", modifier = Modifier.padding(40.dp))
    }
}
