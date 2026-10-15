package com.tecsup.newsapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.tecsup.newsapp.databinding.ActivityPerfilBinding

class PerfilActivity : BaseActivity() {

    private lateinit var binding: ActivityPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configurarToolbar(binding.toolbar, conFlechaAtras = true)

        binding.tvInformacion.setOnClickListener { mostrarMensaje(R.string.msg_seccion) }
        binding.tvNotificaciones.setOnClickListener { mostrarMensaje(R.string.msg_seccion) }
        binding.tvFavoritos.setOnClickListener { mostrarMensaje(R.string.msg_seccion) }
        binding.btnCerrarSesion.setOnClickListener { cerrarSesion() }
    }

    // Menú de opciones (parte superior)
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_perfil, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_buscar -> {
                mostrarMensaje(R.string.msg_buscar)
                true
            }
            R.id.action_mensajes -> {
                mostrarMensaje(R.string.msg_mensajes)
                true
            }
            R.id.action_privacidad -> {
                startActivity(Intent(this, PrivacidadActivity::class.java))
                true
            }
            R.id.action_contactos -> {
                startActivity(Intent(this, ContactosActivity::class.java))
                true
            }
            R.id.action_central -> {
                mostrarMensaje(R.string.msg_central)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun cerrarSesion() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}
