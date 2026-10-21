# 🧮 BMI Calculator – Android App

A simple, lightweight, and user-friendly **BMI (Body Mass Index) Calculator Android application** built using **Kotlin and XML**.

The application allows users to enter their height and weight, calculate their BMI instantly, and view the corresponding BMI category through a clean and easy-to-use interface.

## ✨ Features

- 📏 Enter height and weight
- 🧮 Calculate BMI instantly
- 📊 Display the calculated BMI value
- 💡 Show the corresponding BMI category
- ✅ Input validation for user entries
- 📱 XML-based user interface
- ⚡ Lightweight and fast performance
- 🎨 Simple and user-friendly design

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Kotlin | Application logic |
| XML | UI development |
| Android Studio | Development environment |
| Android SDK | Android application development |
| Gradle | Build and dependency management |

## 📊 BMI Categories

| BMI Range | Category |
|---|---|
| Below 18.5 | Underweight |
| 18.5 – 24.9 | Normal |
| 25.0 – 29.9 | Overweight |
| 30.0 and above | Obese |

*Note: These are general adult BMI categories and are not intended for interpreting BMI in children or teenagers.*

## 🧮 BMI Formula

```text
BMI = Weight (kg) / Height (m)²
```

### Example

```text
Weight = 70 kg
Height = 1.75 m

BMI = 70 / (1.75 × 1.75)

BMI ≈ 22.86
Category = Normal
```

## 📱 How It Works

1. Enter your weight in kilograms.
2. Enter your height in meters.
3. Tap the **Calculate BMI** button.
4. The application calculates BMI using the standard formula.
5. View the calculated result and its corresponding category.

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Aman-Kumar-Goswami/BMICalculator.git
```

### 2. Open the Project

Open the cloned repository in Android Studio.

### 3. Sync Gradle

Allow Android Studio to complete Gradle synchronization and download the required dependencies.

### 4. Run the Application

Connect an Android device or start an Android emulator, then click **Run ▶** in Android Studio.

## 📂 Project Structure

```text
BMICalculator/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── ... (Kotlin source files)
│           ├── res/
│           │   ├── layout/
│           │   ├── drawable/
│           │   └── values/
│           └── AndroidManifest.xml
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🎯 Learning Objectives

This project helps practice the following Android development concepts:

- Kotlin fundamentals
- XML-based Android UI development
- User input handling and validation
- Mathematical calculations
- Button click events
- Dynamic UI updates
- Android project structure
- Building and running Android applications

## 🔮 Future Improvements

- 🌙 Dark mode support
- 📜 BMI calculation history
- 📏 Height unit conversion (cm / ft & in)
- ⚖️ Weight unit conversion (kg / lb)
- 🔄 Reset and clear input functionality
- 💾 Local data storage using Room Database
- 📊 BMI history charts
- 🎨 Improved UI with animations
- 💡 Additional health and wellness information

## 📌 Project Highlights

This project demonstrates a basic Android application workflow:

**User Input → Validation → Calculation → Result Processing → UI Display**

It is designed as a beginner-friendly project for learning Kotlin, XML layouts, and fundamental Android development concepts.

## 👨‍💻 Author

**Aman Kumar**

Android Developer | Kotlin | XML | Jetpack Compose

- **GitHub:** [Aman-Kumar-Goswami](https://github.com/Aman-Kumar-Goswami)
- **Project Repository:** [BMICalculator](https://github.com/Aman-Kumar-Goswami/BMICalculator)

---

⭐ If you find this project useful, consider giving the repository a star!
