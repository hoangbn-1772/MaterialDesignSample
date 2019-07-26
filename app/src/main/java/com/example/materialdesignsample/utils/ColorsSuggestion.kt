package com.example.materialdesignsample.utils

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ColorsSuggestion(
        var mColorName: String = "",
        var mIsHistory: Boolean = false
) : Parcelable {

    fun getBody(): String {
        return mColorName.toLowerCase()
    }
}
