# Project Tech Stack & Audit Matrix

| Frameworks Used | Frontend Frameworks | Backend Frameworks | Languages Percentage (Bytes > 5%) | Frameworks Percentage (Bytes > 5%) | Databases Used | Third-Party APIs | Setup Guidelines | Security Findings | Documentation Quality |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| Android SDK (API 36), AndroidX (AppCompat 1.7.0, Fragment 1.8.6, Lifecycle 2.8.7), Material Components (1.12.0), usb-serial-for-android (3.9.0), Gradle (9.6.1) | Android View System (XML Layouts, Custom Spannable Views, Material Design 3, FragmentManager, Edge-to-Edge Window Insets) | N/A (Client-side native Android application; Foreground Service architecture with SerialService) | Java (61.4%), Markdown (16.5%), XML (10.7%), PNG (8.3%) | AndroidX / Android View Framework (68.5%), usb-serial-for-android (31.5%) | None (In-Memory Circular Buffers, Ring Buffers, and Android SharedPreferences for configuration storage) | usb-serial-for-android (com.github.mik3y:usb-serial-for-android:3.9.0), Android USB Host API (android.hardware.usb.UsbManager, UsbDevice, UsbDeviceConnection) | 1. Clone repository; 2. Open in Android Studio (Jellyfish 2024.1+); 3. JDK 17/21 & Android SDK 36 (minSdk 21); 4. Run './gradlew assembleDebug'; 5. Deploy to USB-OTG capable device. | Zero network permissions (android.permission.INTERNET omitted); runtime USB permission gating via UsbManager; foreground service restricted to connectedDevice/dataSync; components unexported (exported=false); no hardcoded secrets. | High / Comprehensive (Complete README, detailed ARCHITECTURE.md, 25 specialized technical guides in docs/, Javadoc API docs, and code style / contribution rules). |

---

## Detailed Breakdown

### 1. Frameworks Used
* **Android SDK:** Targeted at API 36 (Android 16), backward compatible down to API 21 (Android 5.0 Lollipop).
* **AndroidX Ecosystem:**
  * `androidx.appcompat:appcompat:1.7.0`: Core UI backwards compatibility.
  * `androidx.fragment:fragment:1.8.6`: Fragment lifecycle, transitions, and modular screen management.
  * `androidx.lifecycle:lifecycle-common:2.8.7`: Architecture components and lifecycle-aware state handling.
* **Google Material Components:**
  * `com.google.android.material:material:1.12.0`: Material Design 3 styling, theme attributes, and dynamic color.
* **Hardware Interop Library:**
  * `com.github.mik3y:usb-serial-for-android:3.9.0`: Complete UART driver support for FTDI, CP210x, CH34x, PL2303, and USB CDC/ACM.
* **Build System:**
  * Gradle 9.6.1 with Android Gradle Plugin (AGP) 8.13.0.

### 2. Frontend Frameworks
* **Native Android View System:** Declarative XML layouts optimized with ConstraintLayout, FrameLayout, and LinearLayout.
* **Custom Text Rendering Engine:** Live serial terminal rendering using custom spannable byte formatters with color-coded TX/RX highlighting.
* **Material Design 3:** Modern dark/light styling, dynamic theming, and edge-to-edge system bar window insets handling.
* **Navigation Architecture:** Modular single-activity pattern with `FragmentManager` controlling `DevicesFragment` and `TerminalFragment`.

### 3. Backend Frameworks
* **Architecture:** N/A — Pure native client application.
* **Local Background Worker:** Android Foreground Service (`SerialService`) running with `FOREGROUND_SERVICE_CONNECTED_DEVICE` type to maintain uninterrupted serial streaming during configuration changes and background multitasking.

### 4. Languages Percentage (Bytes > 5%)
Tracked repository files by language byte distribution:
* **Java:** `96,191 bytes` (`61.43%`) — *83.3% of source code*
* **Markdown:** `25,915 bytes` (`16.55%`) — Documentation and technical specifications
* **XML:** `16,812 bytes` (`10.74%`) — *14.6% of source code* (Layouts, themes, device filters, manifest)
* **PNG:** `13,050 bytes` (`8.33%`) — App launcher icons and visual assets

### 5. Frameworks Percentage (Bytes > 5%)
Relative distribution of framework code and dependency integrations:
* **AndroidX & Native Android View Framework:** `68.5%`
* **usb-serial-for-android Driver Library:** `31.5%`

### 6. Databases Used
* **None:** No relational database (SQLite / Room) or embedded key-value document store is required.
* **In-Memory Telemetry Buffers:** Circular byte buffers, FIFO packet queues, and RingBuffer implementations with drop policies for memory-safe terminal history.
* **Persistent Configuration:** Lightweight Android `SharedPreferences` for user baud rate, newline mode, and terminal display preferences.

### 7. Third-Party APIs
* **usb-serial-for-android (`com.github.mik3y:usb-serial-for-android:3.9.0`):** Provides low-level USB-to-UART bridge protocol drivers.
* **Android USB Host API (`android.hardware.usb.*`):**
  * `UsbManager`: Hardware discovery, enumeration, and runtime permission dialogs.
  * `UsbDevice`: Hardware identifier inspection (VID, PID, manufacturer, device name).
  * `UsbDeviceConnection`: Hardware endpoint binding, bulk transfer, and control transfer polling.

### 8. Setup Guidelines
1. **Clone repository:**
   ```bash
   git clone https://github.com/Alfaizkhan/USB-Serial-Communication.git
   cd USB-Serial-Communication
   ```
2. **Environment Requirements:**
   * JDK 17 or JDK 21 installed.
   * Android Studio Jellyfish (2024.1+) or newer.
   * Android SDK Platform 36 and Android SDK Build-Tools 36.
3. **Build via Command Line:**
   ```bash
   ./gradlew clean assembleDebug
   ```
4. **Run Unit Tests & Lint:**
   ```bash
   ./gradlew test lintDebug
   ```
5. **Deployment:** Install APK onto an Android device supporting USB Host / OTG mode via `adb install` or Android Studio Run. Connect USB serial device via OTG adapter.

### 9. Security Findings
* **Network Isolation:** No network permissions requested — `android.permission.INTERNET` is completely absent from `AndroidManifest.xml`. Zero network attack surface.
* **Hardware Access Control:** Explicit runtime permission required for each USB device connection via `UsbManager.requestPermission()`. Broadcast receivers use secure intent filtering.
* **Foreground Service Hardening:** `SerialService` explicitly declares foreground service type `connectedDevice` on Android 14+ (API 34+) preventing background execution vulnerabilities.
* **Component Export Security:** Non-exported components have `android:exported="false"`. `MainActivity` is the sole entry point with `MAIN`/`LAUNCHER` intent filters.
* **Credential Safety:** No hardcoded tokens, API keys, private certificates, or proprietary secrets in the codebase.

### 10. Documentation Quality
* **Rating:** `High / Comprehensive`
* **Coverage:**
  * Complete, beautifully formatted root `README.md` covering architecture, chipsets, wiring, pinouts, and quickstart.
  * 25 specialized technical reference guides under `docs/` covering serial protocols, baud rates, buffer management, power management, modem signals, permissions, and debugging.
  * Full Javadoc documentation on public APIs and utility classes.
  * Clean style configuration (`checkstyle.xml`, `lint.xml`) and comprehensive `CONTRIBUTING.md`.
