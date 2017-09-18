package club.project8078.tictaktoy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    protected fun button_Click(view:View) {

        val button_Select = view as Button
        var CellID:Int = 0
        when (button_Select.id) {
            R.id.button_1 -> CellID = 1
            R.id.button_2 -> CellID = 2
            R.id.button_3 -> CellID = 3
            R.id.button_4 -> CellID = 4
            R.id.button_5 -> CellID = 5
            R.id.button_6 -> CellID = 6
            R.id.button_7 -> CellID = 7
            R.id.button_8 -> CellID = 8
            R.id.button_9 -> CellID = 9
        }


Toast.makeText (this, "ID: $CellID", Toast.LENGTH_LONG).show()


    }

}


