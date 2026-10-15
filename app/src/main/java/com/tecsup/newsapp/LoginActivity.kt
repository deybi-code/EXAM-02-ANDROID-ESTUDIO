package com.tecsup.newsapp

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import com.tecsup.newsapp.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener { iniciarSesion() }
        binding.btnRegistrar.setOnClickListener { mostrarMensaje(R.string.registro_simulado) }
    }

    /** Login simulado: solo valida el formato del correo y el largo de la contraseña. */
    private fun iniciarSesion() {
        val correo = binding.etCorreo.text.toString().trim()
        val clave = binding.etClave.text.toString()

        binding.tilCorreo.error = null
        binding.tilClave.error = null

        if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
            binding.tilCorreo.error = getString(R.string.error_correo)
            return
        }
        if (clave.length < 6) {
            binding.tilClave.error = getString(R.string.error_clave)
            return
        }

        // Intent explícito: Login -> Noticias
        val intent = Intent(this, NoticiasActivity::class.java)
        intent.putExtra(NoticiasActivity.EXTRA_CORREO, correo)
        startActivity(intent)
        finish()
    }
}
