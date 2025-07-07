package com.moazsalem.jetpackplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moazsalem.jetpackplayground.ui.theme.JetpackPlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var item by remember { mutableStateOf("") }
            var listOfItems by remember { mutableStateOf(listOf<String>())}
            JetpackPlaygroundTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding).fillMaxSize(), horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically ,horizontalArrangement = Arrangement.SpaceBetween) {
                            OutlinedTextField(
                                value = item,
                                onValueChange = { item = it },
                                modifier = Modifier.weight(1f),
                            )
                            Spacer(modifier = Modifier.size(8.dp))
                            Button(
                                onClick = { if (item.isNotBlank()) listOfItems = listOfItems + item
                                    item = "" },
                                shape =  androidx.compose.foundation.shape.CutCornerShape(0),
                            ) { Text("Add Item", fontSize = 24.sp, modifier = Modifier.padding(4.dp)) }
                        }
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(16.dp),
                        ) {
                            items(listOfItems){ item ->
                                Text(item, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
                                HorizontalDivider()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackPlaygroundTheme {
    }
}