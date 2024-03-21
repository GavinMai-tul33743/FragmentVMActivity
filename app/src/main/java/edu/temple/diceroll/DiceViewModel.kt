package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DiceViewModel : ViewModel() {
    private val diceValue = MutableLiveData<String>()

    val newDiceValue : LiveData<String>
        get() = diceValue

    fun UpdateDiceValue(_newVal : String){
        diceValue.value = _newVal
    }

    
}