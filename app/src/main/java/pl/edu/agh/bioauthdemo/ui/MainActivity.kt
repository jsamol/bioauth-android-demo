package pl.edu.agh.bioauthdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import pl.edu.agh.bioauthdemo.BuildConfig
import pl.edu.agh.bioauthdemo.R
import pl.edu.agh.bioauthdemo.util.AppConfig

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
