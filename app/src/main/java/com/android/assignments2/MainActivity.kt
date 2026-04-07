package com.android.assignments2




import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dashboard()
        }
    }
}

@Composable
@Preview
fun Dashboard() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Text("Dashboard", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(10.dp))


        LazyRow {
            items(listOf("AI", "Web", "ML")) { item ->
                Button(
                    onClick = {},
                    modifier = Modifier.padding(4.dp)
                ) {
                    Text(item)
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        listOf("Course 1", "Course 2").forEach { course ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(course)
                    Text("Short Description")
                    Text("Status: In Progress")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            Toast.makeText(context, "Menu Clicked", Toast.LENGTH_SHORT).show()


        }) {
            Text("Menu")
        }
    }
}