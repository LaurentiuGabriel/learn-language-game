package service

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import dto.ResponseEntity

class ResponseDecoder {
    private val objectMapper: ObjectMapper = ObjectMapper().registerKotlinModule()

    fun decodeResponse(responseBody: String): ResponseEntity =
        objectMapper.readValue(responseBody, ResponseEntity::class.java)

}