package pl.edu.agh.bioauthdemo

import android.app.Application
import pl.edu.agh.bioauth.BioAuth

class BioAuthDemoApp : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        BioAuth.init(this, BuildConfig.APP_ID, BuildConfig.APP_SECRET)
    }
}