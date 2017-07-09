package com.example.kevin.allseeinglenz

import android.graphics.Bitmap

class TensorflowImageClassifier : Classifier {

    companion object {
        val TAG = "TensorflowImageClassifier"
        val MAX_RESULTS = 3
        val THRESHOLD = 0.1f
    }

    private lateinit var inputName: String
    private lateinit var outputName: String
    private var inputSize = 0
    private var imageMean = 0
    private var imageStd = 0.0f

    override fun recognizeImage(bitmap: Bitmap): List<Classifier.Recognition> {
        TODO("not implemented")
    }

    override fun enableStatLogging(debug: Boolean) {
        TODO("not implemented")
    }

    override fun getStatString(): String {
        TODO("not implemented")
    }

    override fun close() {
        TODO("not implemented")
    }
}
