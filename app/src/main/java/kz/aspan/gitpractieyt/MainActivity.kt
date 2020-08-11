package kz.aspan.gitpractieyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("THIS IS CONTAINED IN MY SECOND COMMIT")
        println("4 commit")
        println("Local change")
        println("change 2")
    }
}