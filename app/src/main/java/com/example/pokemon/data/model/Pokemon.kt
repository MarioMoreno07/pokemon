package com.example.pokemon.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Pokemon(

    val name:String,
    val defaultSprite:String,
    val url:String

):Parcelable
