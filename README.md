# Práctica Calificada 02 - Grupo A: NewsApp

Aplicación móvil desarrollada en Android Studio con Kotlin para la gestión y visualización de noticias, perfiles de usuario y lista de contactos.

---

## Funcionalidades y Pantallas

* **Inicio de Sesión (`LoginActivity`):** Pantalla de autenticación para el acceso a la aplicación.
* **Sección de Noticias (`NoticiasActivity`):** Muestra de artículos y noticias de actualidad con opciones de navegación.
* **Perfil de Usuario (`PerfilActivity`):** Gestión de la información del usuario e interfaz personalizada.
* **Lista de Contactos (`ContactosActivity`):** Visualización interactiva mediante `RecyclerView` y `ContactoAdapter`.
* **Políticas de Privacidad (`PrivacidadActivity`):** Información sobre términos y privacidad de la app.
* **Navegación y Menús:** Menús generales, contextuales y específicos por pantalla.

---

## Tecnologías y Herramientas Usadas

* **Lenguaje:** Kotlin
* **Entorno de Desarrollo:** Android Studio
* **Componentes de UI:** XML, Layouts dinámicos, RecyclerView, Menús contextuales y de opciones.
* **Arquitectura:** Clases base (`BaseActivity`) para reutilización de código y componentes de diseño.

---

## Estructura del Proyecto

```text
com.tecsup.newsapp/
│
├── BaseActivity.kt
├── LoginActivity.kt
├── NoticiasActivity.kt
├── PerfilActivity.kt
├── ContactosActivity.kt
├── PrivacidadActivity.kt
├── Contacto.kt
└── ContactoAdapter.kt
