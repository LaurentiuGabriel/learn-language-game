package dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.Serializable

@Serializable
@JsonIgnoreProperties(ignoreUnknown = true)
data class ResponseEntity(
    val responseData: ResponseData,
    val responseStatus: Integer
)