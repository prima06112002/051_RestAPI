package com.example.kontak.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    @SerialName(value = "nama")
    val nama: String,
    @SerialName(value = "email")
    val alamat: String,
    @SerialName(value = "nohp")
    val nohp: String
)
