 package egor_ind.apps.diceroller

class Dice(private val sides: Int) {

    fun diceRollValue(): Int {
        return (1..sides).random()
    }
}