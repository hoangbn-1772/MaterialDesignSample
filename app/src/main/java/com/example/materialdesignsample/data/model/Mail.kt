package com.example.materialdesignsample.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mail(
    val id: String,
    val author: String,
    val authorAvatar: String,
    val title: String,
    val containsAttachment: Boolean,
    val description: String,
    val picture: List<Picture>
) : Parcelable
