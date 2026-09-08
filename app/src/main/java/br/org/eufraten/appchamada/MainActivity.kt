package br.org.eufraten.appchamada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

private enum class Screen { UNIDADE, OFICINA, CHAMADA, REVISAO, HISTORICO }

private val unidades = listOf("Unidade 1", "Unidade 2")
private val oficinas = listOf("Oficina de Informática", "Oficina de Mídias Digitais", "Oficina de Jiu-Jitsu")
private val educandos = listOf("Educando 01", "Educando 02", "Educando 03", "Educando 04", "Educando 05")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { App() } } }
    }
}

@Composable
private fun App() {
    var screen by remember { mutableStateOf(Screen.UNIDADE) }
    var unidade by remember { mutableStateOf<String?>(null) }
    var oficina by remember { mutableStateOf<String?>(null) }
    val presencas = remember { mutableStateMapOf<String, Boolean>() }

    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("APP Chamada", style = MaterialTheme.typography.headlineMedium)
        Text("Fundação Eufraten")

        when (screen) {
            Screen.UNIDADE -> {
                Text("Selecione a unidade")
                unidades.forEach { item ->
                    Button(
                        onClick = { unidade = item; screen = Screen.OFICINA },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text(item) }
                }
            }
            Screen.OFICINA -> {
                Text("Oficinas da unidade: " + unidade)
                oficinas.forEach { item ->
                    Button(
                        onClick = { oficina = item; screen = Screen.CHAMADA },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text(item) }
                }
            }
            Screen.CHAMADA -> {
                Text("Chamada: " + oficina)
                educandos.forEach { nome ->
                    val presente = presencas[nome]
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(nome, Modifier.weight(1f))
                        Button(onClick = { presencas[nome] = true }) {
                            Text(if (presente == true) "✓ Presente" else "Presente")
                        }
                        Button(onClick = { presencas[nome] = false }) {
                            Text(if (presente == false) "✓ Ausente" else "Ausente")
                        }
                    }
                }
                Button(
                    onClick = { screen = Screen.REVISAO },
                    modifier = Modifier.fillMaxWidth()
                ) { Text("Revisar chamada") }
            }
            Screen.REVISAO -> {
                val presentes = presencas.values.count { it }
                val ausentes = presencas.values.count { !it }
                val naoMarcados = educandos.size - presencas.size
                Text("Revisão", style = MaterialTheme.typography.headlineSmall)
                Text("Presentes: " + presentes)
                Text("Ausentes: " + ausentes)
                Text("Não marcados: " + naoMarcados)
                Button(onClick = { screen = Screen.CHAMADA }, Modifier.fillMaxWidth()) {
                    Text("Voltar e corrigir")
                }
                Button(onClick = { screen = Screen.HISTORICO }, Modifier.fillMaxWidth()) {
                    Text("Confirmar chamada")
                }
            }
            Screen.HISTORICO -> {
                Text("Histórico", style = MaterialTheme.typography.headlineSmall)
                Text(oficina + " — hoje")
                Text("Presentes: " + presencas.values.count { it })
                Text("Ausentes: " + presencas.values.count { !it })
                Button(
                    onClick = { presencas.clear(); screen = Screen.UNIDADE },
                    modifier = Modifier.fillMaxWidth()
                ) { Text("Nova chamada") }
            }
        }
    }
}
