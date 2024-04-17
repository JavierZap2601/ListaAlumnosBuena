package com.example.alumnlist.models

import androidx.annotation.DrawableRes

data class Alumn(
    val id: Int,
    val name: String,
    val mail: String,
    val semester: Int,
    val career: String,
    val hasScolarship: Boolean,
    val gpa: Double,
    val soldTickets: Int,
    @DrawableRes val profilePic: Int
)
