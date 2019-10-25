package pl.edu.agh.bioauthdemo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import pl.edu.agh.bioauthdemo.R
import pl.edu.agh.bioauthdemo.ui.facerecognition.AuthenticateFaceActivity
import pl.edu.agh.bioauthdemo.ui.facerecognition.RegisterFaceActivity
import pl.edu.agh.bioauthdemo.ui.facerecognition.RegisterFaceActivity.Companion.EXTRA_USER_ID
import pl.edu.agh.bioauthdemo.util.navigateTo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerFaceButton.setOnClickListener {
            navigateTo(RegisterFaceActivity::class.java, Bundle().apply { putString(EXTRA_USER_ID, userIdEditText.text.toString()) })
        }
        authenticateFaceButton.setOnClickListener { navigateTo(AuthenticateFaceActivity::class.java) }
    }
}
