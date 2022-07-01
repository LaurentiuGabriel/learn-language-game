package dto

import kotlinx.serialization.Serializable

@Serializable
data class ResponseData(
    val translatedText: String,
    val match: String
)
