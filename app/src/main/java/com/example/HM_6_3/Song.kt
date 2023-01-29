package com.example.HM_6_3

data class Song(
    val number: Int,
    var song: String? = "Unknown Song",
    var artist: String? = "Unknown Artist",
    var duration: String? = "0:00"
)
