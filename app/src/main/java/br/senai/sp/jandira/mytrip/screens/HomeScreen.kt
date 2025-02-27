import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrip.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(50.dp)
                .width(150.dp),
            shape = RoundedCornerShape(bottomStart = 20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xB9230B56))
        ) {}

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(1000.dp)
                .padding(20.dp)
                .padding(top = 200.dp)
        ) {
            Column {
                Text(
                    text = stringResource(R.string.login),
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xB9230B56)
                )
                Text(text = stringResource(R.string.please_sign))
            }

            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedTextField(
                    value = "",  // Valor vazio, sem uso de estado
                    onValueChange = { /* Não fazer nada, já que o estado foi removido */ },
                    modifier = Modifier
                        .padding(start = 10.dp, top = 10.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = stringResource(R.string.email)) }
                )

                OutlinedTextField(
                    value = "",  // Valor vazio, sem uso de estado
                    onValueChange = { /* Não fazer nada, já que o estado foi removido */ },
                    modifier = Modifier
                        .padding(start = 10.dp, top = 10.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = stringResource(R.string.password)) }
                )

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp)
                        .align(Alignment.End)
                        .padding(top = 10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xB9230B56))
                ) {
                    Text(
                        text = stringResource(R.string.sign_in),
                        fontSize = 16.sp
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()
                        .height(30.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(text = stringResource(R.string.no_account))
                    Text(
                        text = stringResource(R.string.sign_up),
                        color = Color(0xB9230B56),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(50.dp)
                .width(150.dp),
            shape = RoundedCornerShape(topEnd = 20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xB9230B56))
        ) {}
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    LoginScreen()
}
