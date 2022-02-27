package com.tkacik.cvs.data.remote.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Media(
    val m: String
)
