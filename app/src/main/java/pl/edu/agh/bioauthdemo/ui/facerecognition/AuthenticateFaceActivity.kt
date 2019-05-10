package pl.edu.agh.bioauthdemo.ui.facerecognition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authenticate_face.*
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauthdemo.R
import pl.edu.agh.bioauthdemo.util.AppConfig

class AuthenticateFaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticate_face)

        faceAuthenticationView.initAuthentication(null, object : AuthenticationListener {
            override fun onSuccess(userId: String, challenge: String, signedChallenge: String) {
                Toast.makeText(this@AuthenticateFaceActivity, "Authenticated", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(error: Throwable) {
                Toast.makeText(this@AuthenticateFaceActivity, "Authentication failed.", Toast.LENGTH_SHORT).show()
            }
        }, AppConfig.livenessMode)
    }
}
