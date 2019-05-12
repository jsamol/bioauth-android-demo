package pl.edu.agh.bioauthdemo.util

import android.app.Activity
import android.content.Intent

fun Activity.navigateTo(target: Class<out Activity>) {
    startActivity(Intent(this, target))
}