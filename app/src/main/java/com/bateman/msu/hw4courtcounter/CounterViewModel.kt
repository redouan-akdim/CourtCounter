package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var scoreTeamA = 0
    private var scoreTeamB = 0

    fun addOneForA(){
        scoreTeamA++
    }

    fun addTwoForA(){
        scoreTeamA+=2
    }

    fun addThreeForA(){
        scoreTeamA+=3
    }

    fun addOneForB(){
        scoreTeamB++
    }

    fun addTwoForB(){
        scoreTeamB+=2
    }

    fun addThreeForB(){
        scoreTeamB+=3
    }

    fun resetScore(){
        scoreTeamA = 0
        scoreTeamB = 0
    }

    /*Getter*/
    fun getScoreA(): Int {
        return scoreTeamA
    }

    fun getScoreB(): Int {
        return scoreTeamB
    }
}