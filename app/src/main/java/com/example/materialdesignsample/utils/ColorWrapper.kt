package com.example.materialdesignsample.utils

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ColorWrapper(
        var hex: String = "",
        var name: String = "",
        var rgb: String = ""
) : Parcelable
