# learn-language-game :open_book: :nerd_face: :capital_abcd:

![Gradle Build](https://github.com/LaurentiuGabriel/learn-language-game/actions/workflows/gradle.yml/badge.svg)

This is a simple console-based game which helps you learn new words each day. 

## Prerequisites

* An API-KEY is required from RapidAPI. The API-KEY needs to be placed inside config.properties file. 
* A subscription is needed on the translation API. You can subscribe for free for this API here: https://rapidapi.com/translated/api/mymemory-translation-memory/.

## How to play

The principle of the game is simple:

1. You upload a file called "data" with words you want to learn in German, English or Spanish, in src/main/resources. The file must have one word per line, in order for the app to pick each word correctly.
2. You start the main function from main.kt class. 
3. Specify the source language from the data file. Currently, only German, English or Spanish are supported (DE, EN, ES).
4. Specify the target language, which is the language in which the source word will be translated.

Then the program will output random words from the list for which you need to type the translation. For each correct translation you will receive a point. If you fail to provide the translation, the program will output the right word for you.

If you are looking to improve your vocabulary in a language, this tool could help you a lot. It's also a great way to review words that you already know, or some that you learned a long time ago and didn't use them. Think about what it's like to learn only 3 words per day. This means more than 1000 words per year! 

Feel free to push code to this repository to enhance the tool. I will be working constantly on adding new features and unit tests.

### Running it from the .jar file

1. Download the first released version.
2. Extract the contents of the zip/tar.gz file. 
3. Add the txt file into the bin folder, right next to the app executable. 
4. Run the app. It will use the data.txt file that you uploaded. 
