package com.example.naproject.data

import com.example.naproject.Rocket

interface MostSuccessfulRocketsDao {
    /**
     * отсортировать по рейтингу
     * */
    fun sort(rockets: List<Rocket>)
    /**
     *@return лучшие ракеты
     * не может быть пустым
     * */
    fun getAll():List<Rocket>

    /**
     * @return true если в топе, иначе false
     * */
    fun isInTop(rocket: Rocket):Boolean
}

