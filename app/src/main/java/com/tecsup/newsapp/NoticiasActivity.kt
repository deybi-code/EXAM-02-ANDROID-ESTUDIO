package com.tecsup.newsapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.tecsup.newsapp.databinding.ActivityNoticiasBinding

class NoticiasActivity : BaseActivity() {

    companion object {
        const val EXTRA_CORREO = "extra_correo"
    }

    private lateinit var binding: ActivityNoticiasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoticiasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configurarToolbar(binding.toolbar, conFlechaAtras = false)

        binding.fabCompartir.setOnClickListener { compartirNoticias() }

        if (savedInstanceState == null) {
            val correo = intent.getStringExtra(EXTRA_CORREO).orEmpty()
            if (correo.isNotEmpty()) {
                Toast.makeText(this, getString(R.string.bienvenida, correo), Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Menú de opciones (parte superior)
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_noticias, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_perfil -> {
                // Intent explícito: Noticias -> Perfil
                startActivity(Intent(this, PerfilActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /** Intent implícito: abre el selector del sistema para compartir texto. */
    private fun compartirNoticias() {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, getString(R.string.compartir_asunto))
            putExtra(Intent.EXTRA_TEXT, getString(R.string.compartir_texto))
        }
        abrirIntent(Intent.createChooser(intent, getString(R.string.compartir_con)))
    }
}
