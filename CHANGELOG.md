# 📋 Hab App — Changelog

---

## v2.0.3 — 2026-05-23 (Google Sign-In + Auth Methods)

### 🔐 Auth Methods Enabled
- ✅ **Email / Password** — full register + sign-in
- ✅ **Google Sign-In** — `signInWithPopup()` using `GoogleAuthProvider`
  - OAuth Client ID: `121711657972-hefsu17as0bvt7s5il23ec7dhd5esv27.apps.googleusercontent.com`
  - Certificate hash (SHA1): `72a8822d2808c2063e6647cebbf555bde5b00ddd`
  - Auto-creates Firestore profile on first Google login
- ✅ **Anonymous / Guest** — `signInAnonymously()` for testing
- Added real Google 'G' logo SVG button on auth screen
- Added `firebase-analytics-compat.js` script for Analytics support
- Updated `google-services.json` with OAuth client entries (v2 with SHA fingerprint)

---

## v2.0.2 — 2026-05-23 (Android SHA Fingerprints + google-services.json)

### 🔐 Android Fingerprints Extracted
- **SHA1:** `72:A8:82:2D:28:08:C2:06:3E:66:47:CE:BB:F5:55:BD:E5:B0:0D:DD`
- **SHA256:** `BA:AB:55:87:D7:DC:6E:A6:9B:E2:B3:8A:97:3F:93:74:FF:B4:BE:2E:36:75:79:95:C7:12:35:32:39:D9:01:BE`
- Keystore: `%USERPROFILE%\.android\debug.keystore` — Algorithm: SHA256withRSA

### 📄 google-services.json
- Copied from `D:\Downloads\google-services.json` → project root
- **Package:** `com.hab` | **Android App ID:** `1:121711657972:android:eefa5d9d29ce2bae916fa1`
- Place at `android/app/google-services.json` after Capacitor init

---

## v2.0.1 — 2026-05-23 (Live Firebase Config Connected)

### 🔥 Firebase Integration — LIVE
- Injected real Firebase project credentials into `CUSTOM_FIREBASE_CONFIG`
- **Project:** `habt-d755a`
- **Auth Domain:** `habt-d755a.firebaseapp.com`
- **App ID:** `1:121711657972:web:ab1628140b60c7e9916fa1`
- **Measurement ID:** `G-5KBN35YBXN` (Analytics enabled)
- App now connects to Firestore for real-time cloud sync when auth is active
- Firebase Analytics (`getAnalytics`) is tracked via the measurementId

> ⚠️ **Next steps required:**
> 1. Enable Email/Password + Anonymous auth in Firebase Console
> 2. Add SHA1 + SHA256 fingerprints for Android app in Firebase Console
> 3. Download `google-services.json` and place at `android/app/`
> 4. Set Firestore Security Rules (see `firebase_setup_guide.md`)

---

## v2.0.0 — 2026-05-23 (Major Redesign + Firebase Workflow)

### ✨ UI Redesign — "Dark Athletic Premium"
- **Complete visual overhaul** — replaced slate/white light theme with deep charcoal (`#0e0f11`) dark theme
- **New color system** with CSS design tokens (`--accent`, `--success`, `--danger`, `--info`, etc.)
- **Typography upgrade** — Google Fonts `DM Sans` (body) + `JetBrains Mono` (labels, code, badges)
- **Amber/gold accent** (`#FFB74D`) replaces plain black as the primary interactive color
- **Progress ring** SVG for daily completion % (replaces plain text)
- **Animated bottom nav** with active indicator top-bar pill per tab
- **Habit cards** now show color-coded completion states (green glow on complete)
- **Redesigned checkmark** with CSS stroke-dashoffset animation
- **Numeric stepper** control component for countable habits
- **Glassmorphism header + nav** with backdrop blur
- **Modal redesign** — slide-up animation, dark panel, better form layout
- **Level Up modal** — large icon, dark overlay, blurred backdrop
- **Toast notifications** — color-coded (success green / error red / info amber)

### 🔧 Workflow Improvements
- **Build tab expanded** into a full structured 4-step Android guide:
  - Step 01: Firebase Web SDK Config (with code template + CLI alternative)
  - Step 02: SHA Fingerprints (debug + release keytool commands for macOS, Linux, Windows)
  - Step 03: Capacitor setup commands
  - Step 04: google-services.json template + capacitor.config.json
- **Better empty states** with consistent centered layout
- **Sound engine refactor** — cleaner `sfx()` helper with error/click/complete/levelup sounds
- **Touch swipe** refined (65px → 60px threshold, cleaner guard logic)
- **LocalStorage keys** bumped to `v5` (non-breaking — fresh install)

### 📄 New Files
- `firebase_setup_guide.md` — Detailed Firebase SHA fingerprint + web key documentation
- `CHANGELOG.md` — This file

### 🐛 Fixes
- Fixed `authLoading` flash — spinner now shows a proper centered dark screen
- Fixed tab indicator not visually marking active tab consistently
- Fixed modal scroll on short-screen devices (max-height + overflow-y)
- Removed Tailwind CDN dependency — now uses pure CSS design tokens

---

## v1.0.0 — (Original)

- Initial `hab_mobile_app.html` — light slate theme
- React 18 + Babel + Firebase compat layer
- 5 tabs: Dashboard, Rituals, Insights, Arena, Capacitor
- Checkbox + numeric habits, XP system, level ladder
- Firestore sync + localStorage fallback
- Touch swipe date navigation
- SVG checkmark animation
- Synth sound effects

---

> **Next Steps:**
> 1. Add your Firebase config to `CUSTOM_FIREBASE_CONFIG` in the HTML
> 2. Follow `firebase_setup_guide.md` to set up SHA fingerprints
> 3. Run local server: `python -m http.server 8080`
> 4. Open: `http://localhost:8080/hab_mobile_app.html`
> 5. Package as APK using Capacitor (see Build tab in app)
