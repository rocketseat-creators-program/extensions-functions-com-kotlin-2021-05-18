package br.com.kassiano.extensionfunctions

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Context.alert(title: String, message: String) {
    AlertDialog.Builder(this)
        .setTitle(title)
        .setMessage(message)
        .show()
}

//Test extensions
class TestFragment(): Fragment() {

    fun teste() {
        requireContext().toast("Olá Rocketseat")

        requireContext().alert(
            title = "Olá",
            message = "Rocketseat!"
        )
    }

}