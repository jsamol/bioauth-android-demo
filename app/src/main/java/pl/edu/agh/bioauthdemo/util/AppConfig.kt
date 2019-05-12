package pl.edu.agh.bioauthdemo.util

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauthdemo.BuildConfig

object AppConfig {
    val livenessMode: LivenessMode = LivenessMode.valueOf(BuildConfig.LIVENESS_MODE)
}