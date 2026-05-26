# 🎵 BeatDrop

BeatDrop is a sleek, modern, cross-platform music player designed for seamless audio playback. Built from the ground up using **Kotlin Multiplatform (KMP)** and **Compose Multiplatform**, BeatDrop delivers a synchronized, high-performance native music-listening experience across both **Android** and **iOS** devices from a single, unified codebase.

---

## 📝 Description

BeatDrop is a feature-rich music streaming and playback application engineered for the modern listener. It combines a beautiful, responsive user interface with a robust audio engine to handle everything from managing local tracks to streaming music from remote servers.

By utilizing Kotlin Multiplatform, BeatDrop compiles directly to native components on both iOS and Android rather than relying on heavy web-views. This ensures that transitions between tracks are buttery smooth, animations match the rhythm of your usage, and battery consumption remains incredibly low during long listening sessions.

---

## ✨ Key Features

* **🎧 Seamless Audio Playback:** A fully optimized audio pipeline built to handle music streaming, background audio playback, and smooth track transitions.
* **📦 Unified Cross-Platform UI:** Enjoy an identical, modern music player interface—complete with player controls, progress bars, and queue management—whether you are on an Android or iOS device.
* **⚡ Instant Album Art Loading:** Powered by the modern Coil 3 engine, high-resolution album artwork, track thumbnails, and artist profiles load instantly and cache intelligently to save your mobile data.
* **🎵 Queue & Playlist Management:** Easily organize your listening experience with intuitive queue systems, track skipping, shuffling, and playlist creation.
* **🎨 Immersive Visual Design:** A beautiful, dark-mode-first user interface featuring dynamic theme accents that complement your favorite music.

---

## 🏗️ Architecture & Core Frameworks

BeatDrop is engineered using industry-standard patterns to ensure audio stability, scalability, and stellar performance:

* **Compose Multiplatform:** Handles the entire visual layout, ensuring a pixel-perfect player interface across different phone and tablet screen dimensions.
* **MVVM Architecture (Model-View-ViewModel):** Keeps the heavy lifting of audio states, track timelines, and media playback logic separate from the user interface. This guarantees your music keeps playing seamlessly even if you rotate your screen or switch apps.
* **Coil 3 (Coroutine Image Loader):** Manages asynchronous background image fetching and disk caching for album artwork without lagging the app's main UI thread.
* **Shared Business Logic:** 90% of the application's core logic (track data models, playlist algorithms, and network streaming states) is written once and shared globally across both platforms.
