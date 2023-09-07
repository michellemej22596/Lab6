package com.example.lab5

//Imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme


class Places : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlacesDesign()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api ::class)
@Composable
fun PlacesDesign(modifier: Modifier = Modifier) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.width(10.dp))

        //Cada card representa un lugar (sombreado)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        ) {
            //Cada fila representa la organizacion del lugar
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)

            ) {

                //Icono de ubicacion
                Image(
                    painter = painterResource(id = R.drawable.place),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(60.dp)
                        .wrapContentSize(Alignment.Center)
                )

                //Titulo y subtitulo
                Column(){
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Guns and Roses LA", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "LA Hall")
                }


                Spacer(modifier = Modifier.width(16.dp))

                //Icono de la flecha hacia arriba
                Image(
                    painter = painterResource(id = R.drawable.icon1_foreground),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(40.dp)
                        .wrapContentSize(Alignment.Center)
                )

            }

        }

        //Lo mismo con el resto de lugares
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)

            ) {

                Image(
                    painter = painterResource(id = R.drawable.place),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(60.dp)
                        .wrapContentSize(Alignment.Center)
                )

                Column(){
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Guns and Roses Denver", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Denver Hall")
                }

                Image(
                    painter = painterResource(id = R.drawable.icon1_foreground),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(40.dp)
                        .wrapContentSize(Alignment.Center)
                )

            }

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)

            ) {

                Image(
                    painter = painterResource(id = R.drawable.place),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(60.dp)
                        .wrapContentSize(Alignment.Center)
                )

                Column() {
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Guns and Roses New York", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Maddison Square Garden")
                }

                Image(
                    painter = painterResource(id = R.drawable.icon1_foreground),
                    contentDescription = "Perfil",
                    modifier = modifier
                        .size(40.dp)
                        .wrapContentSize(Alignment.Center)
                )

            }

        }


        }

    }

    @Preview(showBackground = true)
    @Composable
    fun PlacesPreview() {
        Lab5Theme {
            Places()
        }
    }