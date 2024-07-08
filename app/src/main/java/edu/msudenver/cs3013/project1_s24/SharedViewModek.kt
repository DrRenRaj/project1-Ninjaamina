package edu.msudenver.cs3013.project1_s24

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int> get() = _score

    fun setScore(score: Int) {
        _score.value = score
    }
}
