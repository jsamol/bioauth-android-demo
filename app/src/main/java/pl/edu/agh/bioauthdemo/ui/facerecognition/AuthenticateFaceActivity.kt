package pl.edu.agh.bioauthdemo.ui.facerecognition

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_authenticate_face.*
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.stats.StatsUtil
import pl.edu.agh.bioauthdemo.R
import pl.edu.agh.bioauthdemo.util.AppConfig

class AuthenticateFaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticate_face)

        faceAuthenticationView.initAuthentication(null, object : AuthenticationListener {
            override fun onSuccess(userId: String, challenge: String, signedChallenge: String) {
                StatsUtil.onEnd()
                Toast.makeText(this@AuthenticateFaceActivity, "Authenticated", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(error: Throwable) {
                StatsUtil.onEnd()
                Toast.makeText(this@AuthenticateFaceActivity, "Authentication failed. ${error.message}", Toast.LENGTH_SHORT).show()
            }
        }, AppConfig.livenessMode)
    }
}
