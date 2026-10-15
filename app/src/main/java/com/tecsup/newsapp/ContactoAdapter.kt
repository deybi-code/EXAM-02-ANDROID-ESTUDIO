package com.tecsup.newsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ContactoAdapter(
    context: Context,
    private val contactos: List<Contacto>
) : ArrayAdapter<Contacto>(context, R.layout.item_contacto, contactos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val vista = convertView
            ?: LayoutInflater.from(context).inflate(R.layout.item_contacto, parent, false)

        val contacto = contactos[position]
        vista.findViewById<TextView>(R.id.tvContacto).text =
            context.getString(R.string.formato_contacto, contacto.nombre, contacto.telefono)

        return vista
    }
}
