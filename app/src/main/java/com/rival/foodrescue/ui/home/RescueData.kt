package com.rival.foodrescue.ui.home

import com.rival.foodrescue.R

data class RescueData (
    val id: Int,
    val nameFood: String,
    val placeFood: String,
    val kilometer: String,
    val image: Int
)

val randomNameFood = listOf(
    "Pizza",
    "Burger",
    "Sushi",
    "Tacos",
    "Pasta",
    // Tambahkan nama makanan lainnya sesuai kebutuhan Anda
)

val randomPlaceFood = listOf(
    "Tangerang",
    "Jakarta",
    "Bandung",
    "Surabaya",
    "Medan",
    // Tambahkan tempat lainnya sesuai keinginan Anda
)

val randomKilometer = listOf(
    "1 km",
    "2 km",
    "3 km",
    "4 km",
    "5 km",
    // Tambahkan jarak lainnya sesuai kebutuhan
)

val randomRescueDataList = List(3) { index ->
    val randomImageRescue = when ((index % 5) + 1) {
        1 -> R.drawable.image1
        2 -> R.drawable.image2
        3 -> R.drawable.image3
        4 -> R.drawable.image4
        else -> R.drawable.image5
    }

    RescueData(
        index + 1,
        randomNameFood.random(),
        randomPlaceFood.random(),
        randomKilometer.random(),
        randomImageRescue
    )
}

