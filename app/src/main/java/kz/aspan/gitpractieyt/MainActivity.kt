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
        println("change 4")
        println("This line will be merged")
        println("This line will be merged")
        println("commit test Aspan")
        println("commit test Aspan 1")
        println("commit test Aspan 222")
        println("commit test Aspan 2224")
    }
}