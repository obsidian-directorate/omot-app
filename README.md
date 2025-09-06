# OMOT - Obsidian Mobile Ops Terminal

[![License: MIT](https://img.shields.io/badge/License-MIT-black.svg)](https://opensource.org/licenses/MIT)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84.svg?logo=android)](https://www.android.com/)
[![Codebase: Java](https://img.shields.io/badge/Codebase-Java-%23ED8B00.svg?logo=openjdk)](https://www.java.com/)
[![Min API: 24](https://img.shields.io/badge/Min%20API-24%20(Nougat)-3DDC84.svg)](https://developer.android.com/about/versions/nougat)

> **Official Notice from the Obsidian Taskforce Department**

> This repository contains the source code for the Obsidian Mobile Ops Terminal (OMOT), a multi-layered intelligence suite tailored for field agents of the Obsidian Directorate (OSD). All data is encrypted and the system is designed for operational security above all else. Unauthorized access is monitored.

## 🕶️ Overview

OMOT is the primary field application for operatives within the fictional universe of the **Obsidian Corridor**. It features secure authentication, mission management, encrypted communications, dossier access, and real-time tactical tools—all behind military-grade encryption and an immersive, in-world user interface.

**Current Project Status:** Foundation Phase. Establishing core visual identity and security architecture.

## 🎨 Visual Identity

- **Color palette:** A dark theme based on `#0A0A0F` (Obsidian) and accented with `#00C2FF 
  (Circuit Blue).
- **Typography:**
  - **Headings:** Orbitron (Futuristic, Authoritative)
  - **Body & UI:** Exo 2 (Sleek, Sci-Fi)
  - **Terminal Text:** Roboto Mono (Monospaced, Technical)
  - **Alerts & Labels:** Russo One (Bold, Impactful)
- **Logo:** A custom vector asset combining a shield and digital eye motif.

## ⚠️ Disclaimer

This is a **fictional project** created for portfolio and developmental purposes. The Obsidian Directorate, its universe, and all associated lore are works of fiction. This project does not facilitate, endorse, or relate to any real-world intelligence activities.

## 🛠️ Tech Stack

- **Language:** Java
- **Minimum SDK:** API 24 (Android 7.0 Nougat)
- **Architecture:** To be determined (MVVM/MVI under consideration)
- **Local Database:** SQLite with SQLCipher encryption
- **Biometrics:** Android BiometricPrompt
- **Theming:**: Material Design 3 (MD3) with full custom OSD palette.

## 📁 Project Structure

.
omot-app/
├── app/
│ └── src/main/
│ ├── res/
│ │ ├── drawable/ # Logo variants (XML vectors)
│ │ ├── values/
│ │ │ ├── colors.xml # OSD Color Palette
│ │ │ ├── themes.xml # Core Theme.OMOT definition
│ │ │ └── font_certs.xml # Pre-declared font families
│ │ └── ...
│ └── ...
├── docs/
├── .github/
└── ...
*(To be expanded as the project evolves)*

## 🔐 License

This project is open-sourced under the **MIT License**. See the [LICENSE](LICENSE) file for details.
*Note: Within the fiction of the Obsidian Corridor, this software is considered classified and proprietary to the OSD.*