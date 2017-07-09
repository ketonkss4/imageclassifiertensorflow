package com.example.kevin.allseeinglenz

import android.graphics.Bitmap
import android.graphics.RectF

interface Classifier {
    fun recognizeImage(bitmap: Bitmap): List<Recognition>
    fun enableStatLogging(debug: Boolean)
    fun getStatString(): String
    fun close()

    data class Recognition(val id: String?, val title: String?, val confidence: Float?, val location: RectF?) {
        override fun toString(): String {
            var resultString = ""
            when {
                id != null -> resultString += "[$id] "
                title != null -> resultString += title + " "
                confidence != null -> resultString += String.format("(%.1f%%) ", confidence * 100.0f)
                location != null -> resultString += location.toString() + " "
            }
            return resultString.trim()
        }
    }
}
