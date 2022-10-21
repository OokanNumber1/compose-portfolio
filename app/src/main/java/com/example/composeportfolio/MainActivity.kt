package com.example.composeportfolio

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeportfolio.ui.theme.ComposePortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePortfolioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PortfolioCard()
                }
            }
        }
    }
}

@Composable
fun DetailsRow(label: Int, detail: String){
    Row(
        modifier = Modifier.padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = stringResource(id = label))
        Text(text = detail)
    }
}

@Composable
fun PortfolioCard() {
    Column(
        modifier = Modifier.padding(24.dp),
        verticalArrangement = Arrangement.Center

    ) {
        Surface(modifier = Modifier.border( 2.dp, Color.DarkGray , CircleShape,),
            shape = CircleShape
        ) {
            Image(painter = painterResource(id = R.drawable.profile), contentDescription ="Profile picture" )
        }
        DetailsRow(label = R.string.name, detail = " Mubaraq Lawal")
        DetailsRow(label = R.string.nick_name, detail = " normal")
        DetailsRow(label = R.string.skillset, detail = " Flutter || Learning Jetpack Compose")
        DetailsRow(label = R.string.school, detail = " University of Ilorin")
        DetailsRow(label = R.string.faculty, detail = " Faculty of Engineering and Technology")
        DetailsRow(label = R.string.department, detail = " Computer Engineering")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePortfolioTheme {
        PortfolioCard()
    }
}