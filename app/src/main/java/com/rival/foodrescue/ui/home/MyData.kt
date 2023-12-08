package com.rival.foodrescue.ui.home

import com.rival.foodrescue.R


data class MyData(
    val id: Int,
    val username: String,
    val place: String,
    val status: String,
    val hashtag: List<String>,
    val image: Int,
    val profile: Int
)

val randomUsernames = listOf(
    "@asep",
    "@budi",
    "@cindy",
    "@david",
    "@elena",
    "@fahri",
    "@gita",
    "@hendri",
    "@indah",
    "@joko"
)
val randomPlaces = listOf(
    "di Tangerang",
    "di Jakarta",
    "di Bandung",
    "di Surabaya",
    "di Medan",
    "di Bali",
    "di Makassar",
    "di Yogyakarta",
    "di Malang",
    "di Palembang"
)
val randomStatuses = listOf(
    "Makan siang yang lezat!",
    "Pemandangan yang indah",
    "Malam yang menyenangkan",
    "Perjalanan yang luar biasa",
    "Moment yang tak terlupakan",
    "Suasana yang damai",
    "Petualangan seru",
    "Kisah yang menginspirasi",
    "Makan malam yang enak",
    "Bermain bersama teman-teman"
)
val randomHashtags = listOf(
    "#kuliner",
    "#liburan",
    "#santai",
    "#adventure",
    "#moment",
    "#hangout",
    "#family",
    "#explore",
    "#friendship",
    "#happy"
)

val randomDataList = List(10) { index ->
    val randomImage = when ((index % 5) + 1) {
        1 -> R.drawable.image1
        2 -> R.drawable.image2
        3 -> R.drawable.image3
        4 -> R.drawable.image4
        else -> R.drawable.image5
    }

    val randomImageProfile = when ((index % 5) + 1) {
        1 -> R.drawable.profile1
        2 -> R.drawable.profile2
        3 -> R.drawable.profile3
        4 -> R.drawable.profile4
        else -> R.drawable.profile5
    }

    // Membuat beberapa hashtag secara acak untuk setiap postingan
    val numberOfHashtags = (1..3).random() // Misalnya, batas maksimum adalah 3 hashtag
    val randomHashtags = List(numberOfHashtags) { randomHashtags.random() }

    MyData(
        index + 1,
        randomUsernames.random(),
        randomPlaces.random(),
        randomStatuses.random(),
        randomHashtags,
        randomImage,
        randomImageProfile
    )
}