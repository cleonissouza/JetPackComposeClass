package com.example.aulajetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulajetpackcompose.componentes.AreaDestaque
import com.example.aulajetpackcompose.componentes.AreaPostagem
import com.example.aulajetpackcompose.componentes.BarraSuperior
import com.example.aulajetpackcompose.model.Destaque
import com.example.aulajetpackcompose.model.Postagem
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class InstagramActivity : ComponentActivity() {

    private val listaDestaques = listOf(
        Destaque(R.drawable.perfil01, "cleo"),
        Destaque(R.drawable.perfil02, "elieudo"),
        Destaque(R.drawable.perfil03, "neiva"),
        Destaque(R.drawable.perfil01, "rau"),
        Destaque(R.drawable.perfil02, "cleudo"),
        Destaque(R.drawable.perfil03, "carla"),
        Destaque(R.drawable.perfil01, "cleo"),
        Destaque(R.drawable.perfil02, "elieudo"),
        Destaque(R.drawable.perfil03, "neiva"),
        Destaque(R.drawable.perfil01, "rau"),
        Destaque(R.drawable.perfil02, "cleudo"),
        Destaque(R.drawable.perfil03, "carla"),
        Destaque(R.drawable.perfil01, "cleo"),
        Destaque(R.drawable.perfil02, "elieudo"),
        Destaque(R.drawable.perfil03, "neiva"),
        Destaque(R.drawable.perfil01, "rau"),
        Destaque(R.drawable.perfil02, "cleudo"),
        Destaque(R.drawable.perfil03, "carla"),
    )

    private val listaPostagens = listOf(
        Postagem(
            R.drawable.perfil01,
            "cleo",
            R.drawable.carro,
            "Descricao, estou estudando android e kotlin...."
        ),
        Postagem(
            R.drawable.perfil02,
            "elieudo",
            R.drawable.praia,
            "Descricao, estou estudando android e kotlin..."
        ),
        Postagem(
            R.drawable.perfil03,
            "neiva",
            R.drawable.floresta,
            "Descricao, estou estudando android e kotlin"
        ),
        Postagem(
            R.drawable.perfil01,
            "cleo",
            R.drawable.carro,
            "Descricao, estou estudando android e kotlin...."
        ),
        Postagem(
            R.drawable.perfil02,
            "elieudo",
            R.drawable.praia,
            "Descricao, estou estudando android e kotlin..."
        ),
        Postagem(
            R.drawable.perfil03,
            "neiva",
            R.drawable.floresta,
            "Descricao, estou estudando android e kotlin"
        ),
        Postagem(
            R.drawable.perfil01,
            "cleo",
            R.drawable.carro,
            "Descricao, estou estudando android e kotlin...."
        ),
        Postagem(
            R.drawable.perfil02,
            "elieudo",
            R.drawable.praia,
            "Descricao, estou estudando android e kotlin..."
        ),
        Postagem(
            R.drawable.perfil03,
            "neiva",
            R.drawable.floresta,
            "Descricao, estou estudando android e kotlin"
        ),
        Postagem(
            R.drawable.perfil01,
            "cleo",
            R.drawable.carro,
            "Descricao, estou estudando android e kotlin...."
        ),
        Postagem(
            R.drawable.perfil02,
            "elieudo",
            R.drawable.praia,
            "Descricao, estou estudando android e kotlin..."
        ),
        Postagem(
            R.drawable.perfil03,
            "neiva",
            R.drawable.floresta,
            "Descricao, estou estudando android e kotlin"
        ),
    )

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetpackComposeTheme {
                Scaffold(
                    topBar = {
                        BarraSuperior()
                    },
                    bottomBar = {
                        BottomAppBar() {
                            Text("Bottom App Bar")
                        }
                    },
                    /*floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            Icon(
                                painter = painterResource(R.drawable.ic_adicionar),
                                contentDescription = null
                            )
                        }
                    },*/
                    //floatingActionButtonPosition = FabPosition.End
                ) { paddingValues ->
                    Home(Modifier.padding(paddingValues))
                }
            }
        }
    }//fim oncreate

    @Composable
    fun Home(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
        ) {
            //area destaque
            AreaDestaque(listaDestaques)

            Divider()
            //area de postagens
            AreaPostagem(listaPostagens)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        AulaJetpackComposeTheme {
            Home()
        }
    }
}//fim activity

