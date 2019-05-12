package pl.edu.agh.bioauthdemo.ui.facerecognition

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register_face.*
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.stats.StatsUtil
import pl.edu.agh.bioauthdemo.R
import pl.edu.agh.bioauthdemo.util.AppConfig
import java.security.PublicKey

class RegisterFaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_face)

        faceRegistrationView.initRegistration("testUser", object : RegistrationListener {
            override fun onSuccess(publicKey: PublicKey) {
                StatsUtil.onEnd()
                Toast.makeText(this@RegisterFaceActivity, "Samples registered.", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(error: Throwable) {
                StatsUtil.onEnd()
                Toast.makeText(this@RegisterFaceActivity, "Samples could not be registered.", Toast.LENGTH_SHORT).show()
            }
        }, AppConfig.livenessMode)
    }
}
