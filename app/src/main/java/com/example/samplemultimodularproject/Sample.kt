package com.example.samplemultimodularproject

import android.os.HandlerThread
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

fun main() {
    val abc = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
    val th = HandlerThread("kaka")
    th.start()
    th.looper
    GlobalScope.launch(abc) {
        launch {
            for (i in 1..5) {
                println("Task 1 - $i")
                delay(100L) // Allows Task 2 to run
            }
        }

        launch {
            for (i in 1..5) {
                println("Task 2 - $i")
                delay(100L) // Allows Task 1 to run
            }
        }
    }
}

class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello test!")
        }
    }
}