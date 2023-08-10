package service

import utils.Utils
import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.URLEncoder

class TranslationService(val utils: Utils) {
    private val client = OkHttpClient()
    private val responseDecoder = ResponseDecoder()

    private fun getRapidAPIKey(): String {
        return utils.getProperty("rapid-api-key")
    }

    fun getTranslation(word: String, targetLang: String, sourceLang: String): String {
        val encodedWord = URLEncoder.encode(word, "utf-8")
        val request = Request.Builder()
            .url("https://translated-mymemory---translation-memory.p.rapidapi.com/get?langpair=$sourceLang%7C$targetLang&q=$encodedWord&mt=1&onlyprivate=0&de=a%40b.c")
            .get()
            .addHeader("X-RapidAPI-Key", getRapidAPIKey())
            .addHeader("X-RapidAPI-Host", "translated-mymemory---translation-memory.p.rapidapi.com")
            .build()

        return responseDecoder.decodeResponse(
            client.newCall(request).execute().body().string()
        ).responseData.translatedText
    }
}