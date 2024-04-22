package com.example.clubquest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clubquest.ui.theme.ui.theme.ClubQuestTheme

class SearchClubs : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClubQuestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SearchClubContent()
                }
            }
        }
    }


    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun SearchClubContent() {
        Column{
            TopAppBar(
                title = {
                    Text(
                        text = "Search Club",
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp)
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            val goBack = Intent(this@SearchClubs,MainActivity::class.java)
                            startActivity(goBack)
                        },
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource (id = R.drawable.bg2),
                    contentDescription = "Background image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.matchParentSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
//                    .background(Color.Blue)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .weight(1.5f)
                    ) {
                        Text(
                            text = "Football league name",
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 5.dp, top = 10.dp, bottom = 20.dp)
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .padding(4.dp)
//                            .background(Color.Blue)
                                .fillMaxWidth(),
                            value = "", // Provide a non-null initial value here
                            onValueChange = { /* Handle value change */ },
                            enabled = true,
                            label = {
                                Text(
                                    text = "Enter Name"
                                )
                            }
                        )

                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(20),
                            modifier = Modifier
                                .padding(top = 10.dp, bottom = 10.dp)
                                .fillMaxWidth()
                        )
                        {
                            Text(
                                text = "Retrieve Clubs",
                                fontSize = 18.sp,
                                modifier = Modifier
                                    .padding(10.dp)
                            )
                        }

                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(20),
                            modifier = Modifier
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(31,56,83)

                            )
                        )
                        {
                            Text(
                                text = "Save clubs to Database",
                                fontSize = 18.sp,
                                modifier = Modifier
                                    .padding(10.dp)
                            )
                        }
                    }

                    Column(
                        modifier = Modifier
//                            .background(Color.Blue)
                            .fillMaxWidth()
                            .weight(2f)
                    ) {
//                        Text(text = "hello")
                    }

                }
            }
        }
    }
}

