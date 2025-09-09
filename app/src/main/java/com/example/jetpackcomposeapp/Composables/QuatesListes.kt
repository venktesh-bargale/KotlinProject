package com.example.jetpackcomposeapp.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun QuatesListesItem() {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        )
        {
            Image(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "My Image",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .background(color = androidx.compose.ui.graphics.Color.LightGray)
                    .size(40.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "This is the most valuable thing a men can do in his life",
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp)
                )
                Box(
                    modifier = Modifier.fillMaxWidth(.4f)
                        .background(Color(0xFFEEEEEE))
                        .height(1.dp)
                )
                Text(
                    text = "Vyanktesh Bargale",
                    modifier = Modifier.padding(0.dp, 4.dp, 0.dp, 0.dp),
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                    fontWeight = FontWeight.Thin


                )
            }
        }
    }
}

@Preview
@Composable
fun QuatesListesPreview() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Brush.sweepGradient(
                colors = listOf(
                    Color(0xFF6dd5ed),
                    Color(0xFF2193b0)
                )
            ))
    ) {
        Card(
            modifier = Modifier.padding(32.dp),
            elevation = CardDefaults.cardElevation(4.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(8.dp)

            ) {
                Image(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "My Image",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color.Black)
                )
                Text(
                    text = "Daily Quates hdcvd j jhcbhuefcj effhjeff uch efhc ejfh yuef hefu j efuhb hef hefhvudvcudcveud cefhbcyvefuyc uefb",
                    modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 8.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Vyanktesh Bargale",
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 0.dp),
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Thin
                )
            }
        }
    }

}
