package pl.edu.agh.bioauthdemo.util

import pl.edu.agh.bioauthdemo.BuildConfig

object AppConfig {
    enum class LivenessMode {
        MOBILE, SERVER, MACHINE_LEARNING
    }

    val livenessMode: LivenessMode = LivenessMode.valueOf(BuildConfig.LIVENESS_MODE)
}