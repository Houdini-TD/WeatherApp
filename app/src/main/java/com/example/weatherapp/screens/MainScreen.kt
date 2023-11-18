package com.example.weatherapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherapp.R
import com.example.weatherapp.ui.theme.PurpleGrey80

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Image(painter = painterResource(id = R.drawable.main_bg),
        contentDescription = "im1",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxHeight())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ){
        Card(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = PurpleGrey80,
                contentColor = Color.Gray),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            shape = RoundedCornerShape(10.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "20 jun 2022 20:30",
                        style = TextStyle(fontSize = 18.sp),
                        color = Color.Black
                    )
                    AsyncImage(model = "https://cdn.weatherapi.com/weather/64x64/night/143.png",
                        contentDescription = "im2",
                        modifier = Modifier.size(35.dp));
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Санкт-Петербург",
                        fontSize = 24.sp,
                        color = Color.DarkGray)
                    Text(text = "9°С",
                        style = TextStyle(fontSize = 72.sp,
                            color = colorResource(R.color.black),
                            fontWeight = FontWeight.Medium)
                    )
                    Text(text = "Переменная облачность",
                        style = TextStyle(
                            fontSize = 18.sp,
                            color = Color.DarkGray
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(painter = painterResource(id = R.drawable.search),
                                contentDescription = "search",
                                modifier = Modifier.fillMaxSize(),
                                tint = Color.DarkGray)
                        }
                        Text(text = "24/7",
                            style = TextStyle(
                                fontSize = 18.sp,
                                color = Color.DarkGray
                            )
                        )
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(painter = painterResource(id = R.drawable.refresh),
                                contentDescription = "refresh",
                                tint = Color.DarkGray,
                                modifier = Modifier.fillMaxSize())
                        }
                    }
                }

            }
        }
    }









}