package com.example.myapplication.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Keep
@Parcelize
data class Data(
    @SerializedName("city")
    val city: String? = "",
    @SerializedName("createdAt")
    val createdAt: String? = "",
    @SerializedName("desc")
    val desc: String? = "",
    @SerializedName("_id")
    val id: String? = "",
    @SerializedName("inter_price")
    val interPrice: Int? = 0,
    @SerializedName("local_price")
    val localPrice: Int? = 0,
    @SerializedName("photo")
    val photo: String? = "",
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("updatedAt")
    val updatedAt: String? = "",
    @SerializedName("__v")
    val v: Int? = 0
) : Parcelable