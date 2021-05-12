package egor_ind.apps.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var diceImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImg = findViewById(R.id.diceImg)
        val diceRollBtn: Button = findViewById(R.id.diceRollBtn)
        diceRollBtn.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        val mainDice = Dice(6)
        val toastText = when (mainDice.diceRollValue()) {
            1 -> {
                diceImg.setImageResource(R.drawable.dice_1)
                "You rolled 1!"
            }
            2 -> {
                diceImg.setImageResource(R.drawable.dice_2)
                "You rolled 2!"
            }
            3 -> {
                diceImg.setImageResource(R.drawable.dice_3)
                "You rolled 3!"
            }
            4 -> {
                diceImg.setImageResource(R.drawable.dice_4)
                "You rolled 4!"
            }
            5 -> {
                diceImg.setImageResource(R.drawable.dice_5)
                "You rolled 5!"
            }
            6 -> {
                diceImg.setImageResource(R.drawable.dice_6)
                "You rolled 6!"
            }
            else -> "An error occurred!"
        }
        Snackbar.make(diceImg, toastText, Snackbar.LENGTH_LONG).show()
    }
}