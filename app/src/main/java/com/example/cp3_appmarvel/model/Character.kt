package com.example.cp3_appmarvel.model

import android.media.Image
import java.io.Serializable

data class Character (
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: Image,
) : Serializable