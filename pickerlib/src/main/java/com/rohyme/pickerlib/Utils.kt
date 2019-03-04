package com.rohyme.pickerlib

import android.content.Context
import com.google.gson.Gson

inline fun <reified T> getData(context: Context, fileName: String): T {
    val json = context.assets.open("$fileName.json").bufferedReader().use {
        it.readText()
    }
    return Gson().fromJson(json, T::class.java)
}