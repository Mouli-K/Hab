# 🌱 Hab — Atomic Habit Engine

**Hab** is a premium, high-fidelity atomic routine tracker designed for absolute visual excellence, seamless gamification, and instant cloud vault synchronization. Encapsulating a high-end, responsive dark athletic aesthetic, it delivers micro-animations, rich typography, and native-grade fluid performance built on a clean modern React structure.

---

## 🎨 Design System & Aesthetics

Hab has been crafted with **obsidian-glassmorphic** visual principles:
- **Typographic Pairing**: Utilizes the geometric elegance of **Outfit** for primary headings, call-to-actions, and navigation items, paired with **Plus Jakarta Sans** for detailed readouts and body typography.
- **Luxury Color Accents**:
  - **Light Mode**: Vibrant **Electric Cobalt Blue** (`#1E50FF`) with translucent borders and soft-glow cards.
  - **Dark Mode**: Sleek **Electric Sapphire Blue** (`#4F80FF`) on deep midnight obsidian (`#0e0f11`).
- **Tactile Responses**: Soft micro-scaling transitions on button interaction (`.pressable:active`), custom calendar widgets, and progress bars.
- **Progress Ring**: Dashboard features an animated dynamic SVG progress ring that calculates habit completion percentages in real-time.

---

## ⚡ Core Features

1. **Gamification & Ranks Roadmap**:
   - **XP Engine**: Earn `+15 XP` for registering rituals, `+25 XP` for habit completion, and `+5 XP` for incremental numeric targets.
   - **Rank Roadmaps**: Rise from *Novice Tracker* through 10 distinct milestones up to *Zenith Champion* and *Cosmic Exemplar*.
   - **Visual Alerts**: Triggers haptic vibration sequences and high-fidelity level-up chime events.
2. **Flexible Habit Types**:
   - **Simple Checklist**: One-touch checkbox completions featuring animated vector drawing checkmarks.
   - **Numeric Steppers**: Increment or decrement daily parameters (e.g., Pages, Minutes, Liters) with inline active sliders.
   - **Cue Anchoring**: Anchor habit prompts with a custom target cue input (e.g., *"After I wake up..."*).
3. **Timeline Swipe Gestures**:
   - Touch-gesture enabled active carousel allows swiping left/right to view historical routines.
4. **Cloud Vault Synchronization (Firebase Compat)**:
   - Real-time cloud sync powered by live Firestore.
   - Secure multi-provider sign-ins including **Google OAuth**, Email/Password registration, and one-tap **Guest/Anonymous Testing** mode.
   - Seamless offline fallback to standard LocalStorage if Firebase credentials are omitted.

---

## 🛠️ Technology Stack

- **Core**: HTML5 + Vanilla CSS (No bulky Tailwind CDNs; utilizes native CSS custom variables)
- **Frontend Engine**: React 18 + Standalone Babel Compiler (low-latency, single-file architecture)
- **Database & Auth**: Firebase JS SDK v10 (Firestore + Authentication)
- **Packaging Wrapper**: Capacitor.js (for compiling to native iOS and Android)
- **Asset Pipeline**: `@capacitor/assets` (Adaptive Android launcher mipmaps, drawables, and splash systems)

---

## 🚀 Getting Started

### Local Development Server

1. Host the project locally:
   ```bash
   python -m http.server 8080
   ```
2. Navigate to:
   [http://localhost:8080/hab_mobile_app.html](http://localhost:8080/hab_mobile_app.html)

---

## 📦 Compiling Native Android APK

Hab is fully initialized, synchronized, and pre-packaged with launcher assets:

### 1. Requirements
Ensure you have **Node.js (v18+)** and the **Android SDK** installed.

### 2. Synchronize Web Assets
Copy your changes and sync them with the native wrapper:
```bash
npx cap sync android
```

### 3. Compile the APK
Run the Gradle wrapper inside the native Android folder:
```powershell
cd android
.\gradlew assembleDebug
```
Once compilation finishes, you can locate your runnable APK at:
📂 `android/app/build/outputs/apk/debug/app-debug.apk`

---

## 📄 License
This project is licensed under the MIT License.
