package com.app.world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.app.world.data.Place
import com.app.world.data.places
import com.app.world.ui.theme.WorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldTheme{
                Surface(
                    modifier =Modifier.fillMaxSize()
                ) {
                    WorldApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorldApp() {
    Scaffold(
        topBar ={ WorldTopAppBar() }
    ) { it->
        LazyColumn(contentPadding = it){
            items(places){
                WorldItem(
                    place = it,
                    modifier = Modifier. padding(dimensionResource(R.dimen.padding_small)),
                    )
            }
        }
    }

}
@Composable
fun WorldItem(place: Place, modifier: Modifier = Modifier){
    var expanded by remember { mutableStateOf(false) }
    Card (modifier = modifier) {
        Column (
            modifier = modifier
                .clickable { expanded = !expanded }
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_small))
            ){
                WorldInformation(
                    worldName = place.name ,
                    worldIcon = place.imageResourceId)
                }
            if (expanded)
                WorldBriefing(
                    place.briefing,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_small),
                        top = dimensionResource(R.dimen.padding_small),
                        bottom = dimensionResource(R.dimen.padding_small),
                        end = dimensionResource(R.dimen.padding_small)
                    )
                )
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorldTopAppBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = stringResource(R.string.app_bar_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}
@Composable
fun WorldInformation(
    @StringRes worldName:Int,
    @DrawableRes worldIcon: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ){
        Text(
            text = stringResource(worldName),
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier
                .padding(
                    top = dimensionResource(R.dimen.padding_small),
                    start = dimensionResource(R.dimen.padding_medium)
                )
        )
        Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium)
                    ),
                painter = painterResource(worldIcon),
                contentDescription =stringResource(R.string.expand_button_content_description),
                contentScale = ContentScale.Crop,
            )
    }
}
@Composable
fun WorldBriefing(
    @StringRes worldBriefing: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.about),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(
                start = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(worldBriefing),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(
                start = dimensionResource(R.dimen.padding_small),
                top = dimensionResource(R.dimen.padding_small),
                bottom = dimensionResource(R.dimen.padding_small),
                end = dimensionResource(R.dimen.padding_small)
            )
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WorldPreview() {
    WorldTheme(darkTheme = false) {
        WorldApp()
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun WorldDarkThemePreview(){
    WorldTheme( darkTheme = true) {
        WorldApp()
    }
}


