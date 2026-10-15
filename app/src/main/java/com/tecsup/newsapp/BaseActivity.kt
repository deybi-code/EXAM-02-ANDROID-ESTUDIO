package com.tecsup.newsapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * Funciones comunes a todas las pantallas: barra superior, mensajes
 * y apertura segura de intents.
 */
abstract class BaseActivity : AppCompatActivity() {

    protected fun configurarToolbar(toolbar: Toolbar, conFlechaAtras: Boolean) {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(conFlechaAtras)
    }

    protected fun mostrarMensaje(@StringRes mensaje: Int) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    /** Abre un intent y evita cierres inesperados si no hay app que lo atienda. */
    protected fun abrirIntent(intent: Intent) {
        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            mostrarMensaje(R.string.sin_aplicacion)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
