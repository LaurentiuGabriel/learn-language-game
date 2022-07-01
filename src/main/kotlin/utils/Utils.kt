package utils

import java.io.File
import java.io.FileInputStream
import java.util.*

class Utils {
    val file = File("src\\main\\resources\\config.properties")
    val prop = Properties()

    private fun initializePropertyFile(){
        FileInputStream(file).use { this.prop.load(it) }
    }

    fun getProperty(prop: String): String{
        initializePropertyFile()
        return this.prop.getProperty(prop)
    }
}