package com.example.kotlintut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlintut.ui.theme.KotlinTutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinTutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinTutTheme {
        Greeting("Android")
    }
}

fun main(){
    //demo 1
    greetStudent (name="Tommy", greeting = "What's up")
    //demo 2

    val c = Counter("counter0")
    val c1= Counter("counter1")
    val cs = listOf<Counter>(c,c1,c)
    printCounters(cs)

    for (x in 1..4){
        cs[0].increment()
    }
    printCounters(cs)

    for(x in 1 until 7){
        cs[1].increment()
    }
    printCounters(cs)

}
//Demo 1: basic syntax
fun greetStudent(greeting: String = "Welcome", name:String?){
    println("$greeting ${formatName(name)}")
}

fun formatName(name:String?):String = name ?: "random student"
//: String = return type

//Demo 2: CLass
class Counter(val name:String){
    var count = 0
    fun increment(){
        count += 1
    }
}

fun printCounters(counter: List<Counter>){

    for (c in counter){
        c.apply{
            println("$name is $count")
        }
    }
    println("------------")
}
