package com.example.cp3_appmarvel.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse (
    @SerializedName("result") val characters: List<Character>
)
