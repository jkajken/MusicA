package com.example.musica

import android.provider.MediaStore.Audio.ArtistColumns

data class Songs(
    val name: String,
    val artist: String,
    val minute : String,
    val numberOfSong:String
):java.io.Serializable
