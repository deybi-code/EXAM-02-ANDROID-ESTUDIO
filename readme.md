<div align="center">

  <img src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/android/android.png" width="100" height="100" alt="Android Logo" />

  # 📱 NewsApp — Android Application

  **Práctica Calificada 02 • Grupo A**  
  *Desarrollo de Aplicaciones Móviles — Tecsup*

  <p align="center">
    <a href="#-acerca-del-proyecto">Acerca de</a> •
    <a href="#-tecnologías-y-herramientas">Tecnologías</a> •
    <a href="#-pantallas-y-módulos">Módulos</a> •
    <a href="#-estructura-del-código">Estructura</a> •
    <a href="#-instalación-y-ejecución">Instalación</a>
  </p>

  <!-- BADGES -->
  <p align="center">
    <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin" />
    <img src="https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white" alt="Android Studio" />
    <img src="https://img.shields.io/badge/Android%20SDK-API%2024%2B-34A853?style=for-the-badge&logo=android&logoColor=white" alt="Android SDK" />
    <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" />
    <img src="https://img.shields.io/badge/Material_Design-0081CB?style=for-the-badge&logo=materialdesign&logoColor=white" alt="Material Design" />
  </p>

  ---
</div>

## 📌 Acerca del Proyecto

> **NewsApp** es una aplicación móvil nativa diseñada bajo patrones recomendados de desarrollo en Android. Ofrece una arquitectura modular limpia con gestión centralizada a través de `BaseActivity`, control de navegación, autenticación de usuario, consumo de noticias y un listado optimizado con `RecyclerView`.

<br/>

## 🛠️ Tecnologías y Herramientas

| Componente | Tecnología | Badge | Rol en el Proyecto |
| :--- | :--- | :---: | :--- |
| **Lenguaje** | Kotlin | <img src="https://img.shields.io/badge/-Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white"/> | Lenguaje base para lógica y controladores |
| **IDE** | Android Studio | <img src="https://img.shields.io/badge/-Android%20Studio-3DDC84?style=flat-square&logo=androidstudio&logoColor=white"/> | Entorno de desarrollo integrado |
| **Plataforma** | Android SDK | <img src="https://img.shields.io/badge/-Android-34A853?style=flat-square&logo=android&logoColor=white"/> | Framework y componentes nativos |
| **Diseño UI** | XML & Material Design | <img src="https://img.shields.io/badge/-Material%20Design-0081CB?style=flat-square&logo=materialdesign&logoColor=white"/> | Layouts responsive y estilos visuales |
| **Construcción** | Gradle | <img src="https://img.shields.io/badge/-Gradle-02303A?style=flat-square&logo=gradle&logoColor=white"/> | Gestión de dependencias y compilación |

<br/>

## ⚡ Pantallas y Módulos

<table align="center" width="100%">
  <tr>
    <td width="50%" valign="top">
      <h3>🔑 Autenticación & Perfil</h3>
      <ul>
        <li><b><code>LoginActivity</code></b>: Control de acceso y validación de credenciales.</li>
        <li><b><code>PerfilActivity</code></b>: Gestión de la información del usuario e interfaz personalizada.</li>
      </ul>
    </td>
    <td width="50%" valign="top">
      <h3>📰 Contenido & Listas</h3>
      <ul>
        <li><b><code>NoticiasActivity</code></b>: Feed principal para visualización de artículos.</li>
        <li><b><code>ContactosActivity</code></b>: Lista interactiva mediante <code>RecyclerView</code> e integración con <code>ContactoAdapter</code>.</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td width="50%" valign="top">
      <h3>⚙️ Ajustes & Políticas</h3>
      <ul>
        <li><b><code>PrivacidadActivity</code></b>: Sección de términos, condiciones y políticas de la app.</li>
      </ul>
    </td>
    <td width="50%" valign="top">
      <h3>🏗️ Arquitectura Base</h3>
      <ul>
        <li><b><code>BaseActivity</code></b>: Clase abstracta/base para la reutilización de menús y toolbar.</li>
      </ul>
    </td>
  </tr>
</table>

<br/>

## 📂 Estructura del Código

<details open>
<summary><b>🔍 Ver árbol de archivos del paquete principal</b></summary>

```text
com.tecsup.newsapp/
│
├── 🏛️ BaseActivity.kt        # Control compartido de Toolbar y Menús
├── 🔐 LoginActivity.kt       # Formulario y autenticación
├── 📰 NoticiasActivity.kt    # Vista principal de noticias
├── 👤 PerfilActivity.kt      # Información del usuario
├── 📇 ContactosActivity.kt   # Implementación del RecyclerView
├── 📄 PrivacidadActivity.kt  # Políticas y términos
├── 📦 Contacto.kt            # Modelo de datos (Data Class)
└── 🔄 ContactoAdapter.kt     # Adaptador para el RecyclerView
```
</details>

<br/>

## 📸 Capturas de Pantalla

| Login | Noticias | Contactos | Perfil |
| :---: | :---: | :---: | :---: |
| <img src="https://via.placeholder.com/180x360.png?text=LoginActivity" width="180"/> | <img src="https://via.placeholder.com/180x360.png?text=NoticiasActivity" width="180"/> | <img src="https://via.placeholder.com/180x360.png?text=ContactosActivity" width="180"/> | <img src="https://via.placeholder.com/180x360.png?text=PerfilActivity" width="180"/> |

<br/>

## 🚀 Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/deybi-code/EXAM-02-ANDROID-ESTUDIO.git
   ```

2. **Abrir el proyecto:**
   * Abre **Android Studio**.
   * Selecciona `File` > `Open...` y navega hasta la carpeta del repositorio clonado.

3. **Sincronizar Gradle:**
   * Espera a que Gradle descargue las dependencias necesarias o ejecuta `Sync Project with Gradle Files`.

4. **Ejecutar la app:**
   * Selecciona un emulador con Android API 24+ o conecta un dispositivo físico mediante Depuración USB.
   * Presiona el botón **Run** (`Shift + F10`).

---

<div align="center">
  <sub>Desarrollado para la evaluación académica en <b>Tecsup</b></sub>
</div>