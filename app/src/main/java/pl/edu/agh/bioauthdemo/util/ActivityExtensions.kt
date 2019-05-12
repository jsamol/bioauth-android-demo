package pl.edu.agh.bioauthdemo.util

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

fun Activity.navigateTo(target: Class<out Activity>, bundle: Bundle? = null) {
    val intent = Intent(this, target).apply {
        bundle?.let { putExtras(it) }
    }
    startActivity(intent)
}