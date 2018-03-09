package com.java_lang_programming.android_kotlin_library.kodein.article93

/**
 * Created by msuzuki on 2018/02/22.
 */
object Sample {
    fun calling(type: Int): String {
        return when (type) {
            1 -> "called type is $type"
            2 -> "called type is $type"
            else -> "called type is $type"
        }
    }

    fun getBalance(): String {
        return "balance"
    }
}