package com.tecsup.newsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.tecsup.newsapp.databinding.ActivityPrivacidadBinding

class PrivacidadActivity : BaseActivity() {

    private lateinit var binding: ActivityPrivacidadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrivacidadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configurarToolbar(binding.toolbar, conFlechaAtras = true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_general, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_acerca_de -> {
                mostrarMensaje(R.string.msg_acerca_de)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
