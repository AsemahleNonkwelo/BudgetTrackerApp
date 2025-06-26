# 💸 SpendSmart – Personal Expense Tracker

## 📱 Overview

**SpendSmart** is an Android app built with Kotlin to help users track expenses, manage spending goals, and build better money habits through gamification. The app is intuitive, visual, and motivating — designed to make personal finance effortless and smart.

---

## 🎯 Purpose of the App

SpendSmart was developed to allow users to:
- Log expenses across customizable categories.
- Set minimum and maximum spending goals per category.
- Visualize spending via graphs over selected periods.
- Earn badges for consistent financial habits.

---

## 🎨 Design Considerations

- Minimalistic UI with light and dark modes.
- Clear, actionable tips to guide user behavior.
- Responsive and touch-friendly layouts.
- Secure login screen for personal tracking.

---

## ✅ Final Features Implemented

### 📊 Graphs
- Displays spending **per category** over a **user-selectable time period**.
- Shows **minimum and maximum goals** visually on the chart.

### 📈 Budget Goal Performance
- A visual dashboard indicates how well users are doing with staying within their budget over the past month.

### 🏅 Gamification System
- Users earn badges for:
  - Logging expenses consistently.
  - Meeting monthly spending goals.
  - Adding entries in multiple categories.

---

## ✨ Custom Features

### 1. **Recurring Expense Reminders**
Set monthly or weekly reminders for fixed expenses like rent or subscriptions.

### 2. **Dark Mode Toggle**
A built-in toggle lets users switch between light and dark themes for better visual comfort.

---

## 👥 Team Members & Contributions

This app was developed collaboratively by:

- **Makaphile** ([GitHub](https://github.com/Makaphile))  
  - Login screen & main dashboard UI  
  - Graph features using MPAndroidChart  
  - Expense category & item tracking logic  

- **Asemahle** ([GitHub](https://github.com/AsemahleNonkwelo))  
  - Gamification features (badges, rewards logic)  
  - GitHub Actions setup for CI/CD  
  - APK packaging, video recording & README documentation

We collaborated using GitHub for version control. Commits and pull requests reflect shared responsibility and group work.

---

## 🧪 GitHub Actions & Testing

We implemented GitHub Actions to automate:
- Project builds on each commit or push
- Basic checks to ensure the app compiles and runs correctly

📂 Workflow File: `.github/workflows/build.yml`  
🔗 GitHub Actions used:  
[Automated Build Android App](https://github.com/marketplace/actions/automated-build-android-app-with-github-action)

---

## 📁 Project Structure

app/
├── java/com/example/spendsmart/
│ ├── LoginActivity.kt
│ ├── DashboardActivity.kt
│ ├── AddExpenseActivity.kt
│ ├── GraphActivity.kt
│ ├── GamificationUtils.kt
├── res/
│ ├── layout/
│ ├── drawable/
│ └── values/
└── AndroidManifest.xml


---

## 🧰 Technologies Used

- **Language**: Kotlin  
- **Database**: Room (SQLite)  
- **Graphing**: MPAndroidChart  
- **CI/CD**: GitHub Actions  
- **Testing**: JUnit / Instrumented Tests  
- **Logging**: Android Logcat

---

## 📹 Demo Video

🎥 Watch the SpendSmart demo (real Android device):  
▶️ [YouTube Demo](https://youtube.com/shorts/mC18W46j9Dk?si=xRILiuD8Z2V9rqCQ)

Includes voice-over walkthrough of all features and navigation.

---

## 📦 APK File

📲 The final APK is attached to the repository under the **Releases** section (or included in your submission folder).

> **Note:** To install on Android, users must enable “Install from unknown sources.”

---

## 📄 Research & Design Documents

This repo includes the research and design documents submitted in Part 1:
- `SpendSmart_Design_Document.pdf`
- `SpendSmart_Research_Report.pdf`

---

## 🔁 Version Control & Collaboration

We used GitHub for full version control:
- Each member committed from their own account
- GitHub Actions used to ensure quality control
- Pull requests tracked collaborative work
- Contributions are publicly visible via the GitHub insights tab

---

## ✅ Submission Checklist

- [x] Source code on GitHub (no ZIPs)
- [x] README with full documentation
- [x] APK included or uploaded
- [x] Demo video with voice-over
- [x] GitHub Actions implemented
- [x] Code includes logging & comments
- [x] Research/design docs included
- [x] Two custom features added
- [x] Visual improvements based on feedback


## 📚 References

Android Developers, 2024. *Developer guides – Android developer documentation*. [online] Available at: <https://developer.android.com/guide> [Accessed 13 May. 2025].

JetBrains, 2024. *Kotlin documentation*. [online] Available at: <https://kotlinlang.org/docs/home.html> [Accessed 26 Jun. 2025].

PhilJay, 2024. *MPAndroidChart – A powerful and easy-to-use chart library for Android*. [online] GitHub. Available at: <https://github.com/PhilJay/MPAndroidChart> [Accessed 02 Jun. 2025].

Android Developers, 2024. *Room Persistence Library*. [online] Available at: <https://developer.android.com/jetpack/androidx/releases/room> [Accessed 26 Jun. 2025].

GitHub Marketplace, 2024. *Automated Build Android App with GitHub Action*. [online] Available at: <https://github.com/marketplace/actions/automated-build-android-app-with-github-action> [Accessed 26 Jun. 2025].

OBS Studio, 2024. *Open Broadcaster Software*. [online] Available at: <https://obsproject.com/> [Accessed 26 Jun. 2025].

GitHub Docs, 2024. *Mastering Markdown*. [online] Available at: <https://docs.github.com/en/get-started/writing-on-github> [Accessed 26 Jun. 2025].

Stack Overflow, 2024. *Community Q&A for coding solutions*. [online] Available at: <https://stackoverflow.com> [Accessed 26 Jun. 2025].

Author

Asemahle Nonkwelo

GitHub: @AsemahleNonkwelo


