import service.TranslationService
import utils.SupportedLanguages
import utils.Utils
import java.io.File
import kotlin.random.Random

fun main(args: Array<String>){
    println("Starting program");
    val wordKey: ArrayList<String> = ArrayList()
    var sourceLanguage = String()
    var targetLanguage = String()
    var utils = Utils()
    val translationService = TranslationService(utils)
    val listOfLines = File("src/main/resources/data").bufferedReader().readLines()
    var score = 0
    for(line in listOfLines){
        wordKey.add(line)
    }

    println("Tell me the first two letters of the language you want to translate from")
    val sourceLang = readLine()
    when(sourceLang?.uppercase()){
        SupportedLanguages.DE.name -> sourceLanguage = SupportedLanguages.DE.name
        SupportedLanguages.ES.name -> sourceLanguage = SupportedLanguages.ES.name
        SupportedLanguages.EN.name -> sourceLanguage = SupportedLanguages.EN.name
        else -> println("Currently, the language you provided is not supported")
    }
    if(sourceLanguage == null)
        System.exit(1)

    println("Tell me the first two letters of the language you want to translate to")
    val targetLang = readLine()
    when(targetLang?.uppercase()){
        SupportedLanguages.DE.name -> targetLanguage = SupportedLanguages.DE.name
        SupportedLanguages.ES.name -> targetLanguage = SupportedLanguages.ES.name
        SupportedLanguages.EN.name -> targetLanguage = SupportedLanguages.EN.name
        else -> println("Currently, the language you provided is not supported")
    }
    if(targetLanguage == null)
        System.exit(1)
    if(targetLanguage == sourceLanguage) {
        println("Target language cannot be the same as source language.")
        System.exit(1)
    }

    while(true){
        val index = Random.nextInt(wordKey.size)
        println("Tell me what is the translation of the word ${wordKey.get(index)}")
        val enteredString = readLine()
        val correctWord = translationService.getTranslation(wordKey.get(index), targetLanguage, sourceLanguage)
        if(correctWord.equals(enteredString, ignoreCase = true)){
            score++
            println("You are right! Your score is: $score.")
            wordKey.removeAt(index)
        }
        else
            println("WRONG!! The answer is: $correctWord")
    }
}