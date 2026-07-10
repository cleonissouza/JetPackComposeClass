package com.example.aulajetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulajetpackcompose.model.Usuario
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private val usuarios = listOf(
        Usuario("Francisco", 34),
        Usuario("Ana", 28),
        Usuario("Carol", 25),
        Usuario("Ana", 32),
        Usuario("Lucia", 45),
        Usuario("luis", 53),
        Usuario("erica", 13),
        Usuario("edu", 40),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
        Usuario("eva", 62),
    )

    private val opcoesRadio = listOf(
        "Android", "IOs", "Flutter", "Reactive Native"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AulaJetpackComposeTheme {
                SegundoApp()
            }//Fechamento theme
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun itemCartao(usuario: Usuario){
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            onClick = {
                Toast.makeText(applicationContext, "Clicado", Toast.LENGTH_SHORT)
                    .show()
            },
            colors = CardDefaults.cardColors(
                containerColor = androidx.compose.ui.graphics.Color.Magenta,
                contentColor = Color.Green
            )
            //shape = RoundedCornerShape(20.dp)
            /*elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )*/
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp, 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.carro),
                    null,
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "${usuario.name} - ${usuario.idade}",
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 16.dp),
                )
            }
        }
    }


    @Composable
    fun SegundoApp() {

        var contador by remember {
            mutableStateOf(0)
        }

        var nome by remember {
            mutableStateOf("")
        }

        var checked by remember {
            mutableStateOf(false)
        }

        var radioSelecionado by remember {
            mutableStateOf(opcoesRadio[0])
        }

        var listaUsuarios by remember {
            mutableStateOf(listOf<Usuario>())
        }

        Column(
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {

            LazyColumn() {
                items(usuarios){ usuario ->
                    itemCartao(usuario = usuario)
                }
            }

           /* opcoesRadio.forEach { opcao ->
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = opcao == radioSelecionado,
                        onClick = {
                            radioSelecionado = opcao
                        }
                    )
                    Text(text = opcao)
                }
            }*/
            Text(text = "alterado: $radioSelecionado")

            //Switch(
            /*  Checkbox(
                  checked = checked,
                  { alterado ->
                      checked = alterado
                  }
              )
              */

            //Mais componentes de interface: Fab, checkBox, Switch, Radio
            //FloatingActionButton(
            /*  ExtendedFloatingActionButton(
                  *//*containerColor = Color.Magenta,
                contentColor = Color.White,*//*
                onClick = {}) {
              *//*  Icon(
                    painter = painterResource(R.drawable.ic_add_24),
                    null)*//*
                Text(text = "Pesquisar")
            }*/

            /* Row() {
                 //TextField(
                 OutlinedTextField(
                     value = nome,
                     onValueChange = { texto ->
                         nome = texto
                         Log.i("valorDigitado", "valorDigitado: $texto ")
                     },
                     placeholder = {
                         Text(text = "Digite seu nomeFra")
                     }
                 )

                 Spacer(modifier = Modifier
                     .width(8.dp))

                 Button(onClick = {
                      //adiconar na lista
                     val usuario = Usuario(nome, 0)
                     listaUsuarios = listaUsuarios + usuario
                 }) {
                     Icon(
                         painter = painterResource(R.drawable.ic_add_24),
                         null)
                 }
             }*/

            /*   LazyColumn(
                   modifier = Modifier.padding(
                       top = 16.dp,
                       bottom = 16.dp)
               ) {
                   items(listaUsuarios){ usuario ->
                       Text(
                           text = "+) ${usuario.name}",
                           modifier = Modifier.padding(8.dp)
                       )
                       Divider()
                   }
               }*/


        }//fim column
    }//fim metod segundo App

    @Composable
    fun PrimeiroApp() {
        /*  Text(
              text = "Cleonis",
              color = Color.White
          )
          Button(onClick = {}) {
              Text(
                  text = "Cleonis",
                  color = Color.White
              )
          }
          Column (
              modifier = Modifier
                  .fillMaxWidth()
                  .fillMaxHeight()
                  .background(Color.Gray),
              verticalArrangement = Arrangement.SpaceEvenly,
              horizontalAlignment = Alignment.CenterHorizontally
              horizontalArrangement = Arrangement.SpaceEvenly,
              verticalAlignment = Alignment.CenterVertically
          ) {

              Botao(texto = "Cleonis") {
                  println("Executou")
              }

              Text(
                  text = "Cleonis",
                  color = Color.Red,
                  fontSize = 20.sp
              )

              Text(
                  text = "Ana",
                  color = Color.Red,
                  fontSize = 20.sp
              )

              Text(
                  text = "Joao",
                  color = Color.Red,
                  fontSize = 20.sp
              )

          }//fim column*/
        Column(
            modifier = Modifier
                // .width(80.dp)
                //.height(80.dp)
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(30.dp, 10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            /*Text(text = "Cleonis", fontSize = 20.sp)
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .border(2.dp, Color.Red, CircleShape)
                    .clip(CircleShape)
                    .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

                    //.padding(10.dp, 30.dp, 30.dp, 8.dp)
            ) {
                Text(text = "FS", fontSize = 32.sp)
            }*/
            /* Image(
                 painter = painterResource(R.drawable.carro),
                 null,
                 modifier = Modifier
                     .width(200.dp)
                     .height(200.dp)
                     .border(2.dp, Color.Red),
                 contentScale = ContentScale.Crop
             )
             Icon(
                 //painterResource(id = R.drawable.ic_alarm_24),
                 imageVector = Icons.Default.Lock,
                 null
             )
             Button(onClick = {}) {
                 Row(
                     verticalAlignment = Alignment.CenterVertically
                 ) {
                     if (false){
                         Icon(
                             //painterResource(id = R.drawable.ic_alarm_24),
                             imageVector = Icons.Default.Lock,
                             null
                         )
                     }else{
                         Icon(
                             //painterResource(id = R.drawable.ic_alarm_24),
                             imageVector = Icons.Default.Email,
                             null
                         )
                     }
                     Text(text = "desbloquear")
                 }
             }*/

            //LazyColumn(
            /*LazyVerticalGrid (
                columns = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp)
            )*/
            LazyHorizontalGrid(
                rows = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(usuarios.size) { indice ->

                    val nome = usuarios[indice].name
                    val idade = usuarios[indice].idade

                    Column() {
                        Image(
                            painter = painterResource(R.drawable.carro),
                            null,
                            modifier = Modifier
                                .width(80.dp)
                                .height(80.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "$nome")
                    }

                    /*  Row(
                          modifier = Modifier
                              .padding(top = 16.dp, bottom = 16.dp),
                          verticalAlignment = Alignment.CenterVertically
                      ) {
                          Image(
                              painter = painterResource(R.drawable.carro),
                              null,
                              modifier = Modifier
                                  .width(80.dp)
                                  .height(80.dp),
                              contentScale = ContentScale.Crop
                          )
                          Text(
                              text = "$nome - $idade",
                              fontSize = 32.sp,
                              modifier = Modifier.padding(start = 16.dp),
                          )
                      }*///fim row
                    /* Box(
                         modifier = Modifier
                             .fillMaxWidth()
                             .height(1.dp)
                             .background(Color.Red)
                     )*/
                }
            }

            /* for (i in 1..4){
                 Image(
                     painter = painterResource(R.drawable.carro),
                     null,
                     modifier = Modifier
                         .width(200.dp)
                         .height(200.dp)
                         .border(2.dp, Color.Red),
                     contentScale = ContentScale.Crop
                 )
             }*/
        }
    }

    @Composable
    @Preview
    fun AppPreview() {
        SegundoApp()
    }
}//fechamento mainActivity

