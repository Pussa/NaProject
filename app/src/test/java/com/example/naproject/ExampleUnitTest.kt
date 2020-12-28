package com.example.naproject

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*
import java.nio.file.Files.size
import kotlin.coroutines.CoroutineContext

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun coroutinesTest() {
        runBlocking {


            val job = launch {
                delay(1000)
                print("Hello")

            }
            cancel()
            // val result: Deferred<String> = async {
            //     "world"

            //  }
            // print(result.await())

            print("world")
        }
    }

}

class Preseneter : CoroutineScope {

    private lateinit var 
    override val coroutineContext: CoroutineContext
        get() = Job()

    fun test(){
        job = launch {


        }

    }

}