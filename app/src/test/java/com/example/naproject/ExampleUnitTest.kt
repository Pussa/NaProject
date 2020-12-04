package com.example.naproject

import org.junit.Test

import org.junit.Assert.*
import java.nio.file.Files.size

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    val baobab = Tree(10,"baobab","Adansonia digitata")
    val fir = Tree(5,"fir","Abies")
    val pine = Tree(4,"pine","pinus")
    val palm = Tree(8,"palm","Pálmae")

    var collecrion = listOf(fir,pine,baobab,palm)
    @Test
    fun addition_isCorrect() {
        print(collecrion.sort())
    }

    fun List<Tree>.sort():List<Tree> = this.sortedBy { it.height }

}