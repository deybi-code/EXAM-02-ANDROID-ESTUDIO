package com.tecsup.newsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import com.tecsup.newsapp.databinding.ActivityContactosBinding

class ContactosActivity : BaseActivity() {

    private lateinit var binding: ActivityContactosBinding

    private val contactos = listOf(
        Contacto("Prensa Editorial", "+51 1 987987987"),
        Contacto("Prensa Editorial", "+51 1 987987987"),
        Contacto("Prensa Editorial", "+51 1 987987987"),
        Contacto("Prensa Editorial", "+51 1 987987987"),
        Contacto("Prensa Editorial", "+51 1 987987987"),
        Contacto("Prensa Editorial", "+51 1 987987987")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configurarToolbar(binding.toolbar, conFlechaAtras = true)

        binding.lvContactos.adapter = ContactoAdapter(this, contactos)
        // Menú contextual sobre cada elemento de la lista
        registerForContextMenu(binding.lvContactos)
    }

    // Menú de opciones (parte superior)
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

    // Menú contextual (mantener presionado un contacto)
    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val info = menuInfo as? AdapterView.AdapterContextMenuInfo ?: return
        menu.setHeaderTitle(contactos[info.position].telefono)
        menuInflater.inflate(R.menu.menu_contextual, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as? AdapterView.AdapterContextMenuInfo
            ?: return super.onContextItemSelected(item)
        val numero = contactos[info.position].telefono.replace(" ", "")

        return when (item.itemId) {
            R.id.ctx_llamar -> {
                abrirIntent(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$numero")))
                true
            }
            R.id.ctx_enviar_mensaje -> {
                abrirIntent(Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$numero")))
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}
