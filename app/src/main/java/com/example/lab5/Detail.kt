package com.example.lab5

//Imports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme


class Detail : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Details()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api ::class)
@Composable
fun Details(modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxSize()
    ){

        //Box del inicio

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .background(Color.Cyan) // Color de fondo de la pantalla
        ) {

            Text(
                text = "Lugar",
                color = Color.Black,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomStart)
            )

        }


        Text(text = "Title",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            modifier = Modifier
        )

        //Iconos y texto fecha y hora

        Row(){
            Image(
                painter = painterResource(id = R.drawable.calendar_foreground),
                contentDescription = "Calendario",
                modifier = modifier
                    .size(40.dp)
                    .wrapContentSize(Alignment.Center)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Fecha")

            Spacer(modifier = Modifier.width(130.dp))

            Image(
                painter = painterResource(id = R.drawable.clock_foreground),
                contentDescription = "Reloj",
                modifier = modifier
                    .size(40.dp)
                    .wrapContentSize(Alignment.Center)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Hora")
        }

        Text(text = "About",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp,
            modifier = Modifier
        )

        // Parrafo

        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sed nisl ultrices, porttitor ligula nec, ultrices ligula. In hac habitasse platea dictumst. Maecenas dictum, ligula id dictum hendrerit, leo tortor egestas mauris, sit amet pretium nulla sem posuere quam.",
            fontSize = 20.sp,
            modifier = Modifier
        )


        //Botones
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ){

            Button(onClick = {},
                    modifier = Modifier
                    .fillMaxWidth(0.5f) ) {
                Text(text = "Favorite")
            }

            Button(onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.5f) ) {
                Text(text = "Buy")
            }

        }



    }


}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    Lab5Theme {
        Details()
    }
}