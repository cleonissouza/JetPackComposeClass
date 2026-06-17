package com.example.aulajetpackcompose

import android.os.Bundle
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aulajetpackcompose.model.Usuario
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {
    private val usuarios = listOf(
        Usuario("Cleonis", 34),
        Usuario("ana", 45),
        Usuario("bruna", 32),
        Usuario("ian", 43),
        Usuario("joy", 74),
        Usuario("paul", 23),
        Usuario("jonh", 21),
        Usuario("anne", 48),
        Usuario("moly", 28),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
        Usuario("...", 29),
    )

    private val opcoesRadio = listOf(
        "Android", "iOS", "Flutter", "Reactive Native"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AulaJetpackComposeTheme {
                SegundoApp()
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

        var listaUsuarios by remember {
            mutableStateOf(listOf<Usuario>())
        }

        var checked by remember {
            mutableStateOf(false)
        }

        var radioSelecionado by remember {
            mutableStateOf(opcoesRadio[0])
        }

        Column(
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp, 10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {

            opcoesRadio.forEach { opcao ->

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    RadioButton(
                        selected = opcao == radioSelecionado,
                        onClick = {
                            radioSelecionado = opcao
                        })
                    Text(text = opcao)
                }
            }
            Text(text = "radio: $radioSelecionado")
           // Switch(
            /*Checkbox(
                checked = checked,
                onCheckedChange = { alterado ->
                    checked = alterado
                }
            )
            Text(text = "alterado: $checked")*/

          /*  //Mais componentes de interface: FAB, CheckBox, Switch, Radio
           // FloatingActionButton(
            ExtendedFloatingActionButton(
               *//* containerColor = Color.Magenta,
                contentColor = Color.White,*//*
                onClick = {

            }) {
               *//* Icon(
                    painter = painterResource(id = R.drawable.ic_adicionar),
                    contentDescription = null)*//*
                Text(text = "pesquisar")
            }*/


           /* Row() {
                //TextField(
                OutlinedTextField(
                    value = nome,
                    onValueChange = { textoDigitado ->
                        nome = textoDigitado
                        //Log.i("digitado", "digitado: $textoDigitado ")

                    },
                    placeholder = {
                        Text(text = "Digite seu nome")
                    }
                )

                Spacer(modifier = Modifier.width(8.dp))

                Button(onClick = {
                    //adicionar na lista
                    val usuario = Usuario(nome, 0)
                    listaUsuarios = listaUsuarios + usuario
                    nome = ""
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_adicionar),
                        contentDescription = null)
                }
            }
*/
           /* LazyColumn(
                modifier = Modifier.padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
            ) {
                items(listaUsuarios){ usuario ->
                    Text(
                        text = "+) ${usuario.nome}",
                        modifier = Modifier.padding(8.dp)
                    )

                    HorizontalDivider()
                }
            }*/
        }
    }

    @Composable
    fun PrimeiroApp() {

        Column(
            modifier = Modifier
                /* .width(200.dp)
                 .height(200.dp)*/
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(30.dp, 10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {

            //LazyRow(
            //LazyColumn(

            /*  LazyVerticalGrid (
                  //columns = GridCells.Adaptive(122.dp),
                  columns = GridCells.Fixed(3),
                  modifier = Modifier
                      .padding(16.dp)
              )*/
            LazyHorizontalGrid(
                //columns = GridCells.Adaptive(122.dp),
                rows = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp)
            )
            {
                items(usuarios.size) { indice ->
                    val nome = usuarios[indice].nome
                    val idade = usuarios[indice].idade

                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.carro),
                            null,
                            Modifier
                                .width(80.dp)
                                .height(80.dp)
                                .padding(end = 8.dp),
                            contentScale = ContentScale.Crop,
                            //alignment = Alignment.TopCenter
                        )

                        Text(text = "$nome")
                    }

                    /* Row(
                         modifier = Modifier
                             .padding(top = 16.dp, bottom = 16.dp),
                         verticalAlignment = Alignment.CenterVertically
                     ) {

                         Image(
                             painter = painterResource(id = R.drawable.carro),
                             null,
                             Modifier
                                 .width(80.dp)
                                 .height(80.dp)
                                 .padding(end = 8.dp),
                             contentScale = ContentScale.Crop,
                             //alignment = Alignment.TopCenter
                         )

                         Text(text = "$nome - $idade",
                             fontSize = 32.sp
                            )
                     }*///fim row

                    /*  Box(
                          modifier = Modifier
                              .fillMaxWidth()
                              .height(1.dp)
                              .background(Color.Red)
                      )*/
                }
            }

            /* for (i in 1..4){
                 Image(
                     painter = painterResource(id = R.drawable.carro),
                     null,
                     Modifier
                         .width(200.dp)
                         .height(200.dp)
                         .border(2.dp, Color.Red),
                     contentScale = ContentScale.Crop,
                     //alignment = Alignment.TopCenter
                 )
             }*/

            /*Image(
                painter = painterResource(id = R.drawable.carro),
                null,
                Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .border(2.dp, Color.Red),
                contentScale = ContentScale.Crop,
                //alignment = Alignment.TopCenter
            )

            Icon(

               // painter = painterResource(R.drawable.ic_alarm_24),
                imageVector = Icons.Default.Lock,
                null
            )

            Button(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (true){
                        Icon(

                            // painter = painterResource(R.drawable.ic_alarm_24),
                            imageVector = Icons.Default.Lock,
                            null
                        )
                    }else{
                        Icon(

                            // painter = painterResource(R.drawable.ic_alarm_24),
                            imageVector = Icons.Default.Email,
                            null
                        )
                    }

                    Text(text = "desbloquear")
                }
            }

            *//*Text(text = "Cleonis", fontSize = 36.sp)
        Column(
            modifier = Modifier
             .width(200.dp)
             .height(200.dp)
             .border(2.dp, Color.Red, CircleShape)
             .clip(CircleShape)
             //.clip(RoundedCornerShape(20.dp))
             .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "FC", fontSize = 32.sp)
        }*/
        }

        /* Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .fillMaxHeight()
                 .background(Color.Gray),
             verticalArrangement = Arrangement.SpaceEvenly,
             horizontalAlignment = Alignment.CenterHorizontally
             //horizontalArrangement =  Arrangement.SpaceEvenly,
             //verticalAlignment = Alignment.CenterVertically
         ) {
             Text(text = "Cleonis", fontSize = 36.sp)
             Text(text = "Neiva", fontSize = 36.sp)
             Text(text = "Joao", fontSize = 36.sp)
             Botao(texto = "cleo") {
                 println("Executou")
             }
         }*/


        /* Text(
             text = "Cleonis ",
             color = Color.White
         )*/
        /* Button(onClick = {}) {
             Text(
                 text = "Cleonis ",
                 color = Color.White
             )
         }*/
    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        SegundoApp()
    }
}//fechamento mainActivity

