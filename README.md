# 🧮 BMI Calculator

A simple, lightweight, and user-friendly **BMI (Body Mass Index) Calculator Android application** built using **Kotlin and XML**.

The application allows users to enter their **height and weight**, calculate their BMI instantly, and view their corresponding **BMI category** through a clean and easy-to-use interface.

## ✨ Features

* 📏 Enter height and weight
* 🧮 Calculate BMI instantly
* 📊 Display calculated BMI value
* 💡 Show BMI category
* ✅ Input validation for user entries
* 📱 Clean XML-based user interface
* ⚡ Lightweight and fast
* 🎨 Simple and user-friendly design

## 🛠️ Tech Stack

* **Kotlin** – Application logic
* **XML** – UI development
* **Android Studio** – Development environment
* **Android SDK** – Android application development
* **Gradle** – Build and dependency management

## 📊 BMI Categories

| BMI Range      | Category    |
| -------------- | ----------- |
| Below 18.5     | Underweight |
| 18.5 – 24.9    | Normal      |
| 25.0 – 29.9    | Overweight  |
| 30.0 and above | Obese       |

## 🧮 BMI Formula

```text
BMI = Weight (kg) / Height² (m)
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

1. Enter your **weight in kilograms**.
2. Enter your **height in meters**.
3. Tap the **Calculate BMI** button.
4. The application calculates the BMI using the standard formula.
5. The calculated BMI and corresponding category are displayed.

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Aman-Kumar-Goswami/BMICalculator.git
```

### 2. Open the Project

Open the cloned project in **Android Studio**.

### 3. Sync Gradle

Allow Android Studio to complete the **Gradle sync** and download the required dependencies.

### 4. Run the Application

Connect an Android device or start an **Android Emulator**, then click **Run ▶** in Android Studio.

## 📂 Project Structure

```text
BMICalculator/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── ...
│           └── res/
│               ├── layout/
│               ├── drawable/
│               └── values/
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🎯 Learning Objectives

This project was developed to practice and strengthen the following Android development concepts:

* Kotlin fundamentals
* XML-based Android UI development
* User input handling
* Input validation
* Mathematical calculations
* Button click and event handling
* Updating UI dynamically
* Android project structure
* Building and running Android applications

## 🔮 Future Improvements

The project can be further enhanced with:

* 🌙 Dark Mode support
* 📜 BMI calculation history
* 👤 Age and gender-based analysis
* 💡 General health and wellness information
* 🎨 Improved UI with animations
* 📏 Height unit conversion — cm / ft & in
* ⚖️ Weight unit conversion — kg / lb
* 📊 BMI history charts
* 💾 Local storage using Room Database
* 🔄 Reset / clear input functionality

## 📌 Project Highlights

This project demonstrates a complete basic Android application workflow, including:

**User Input → Validation → Calculation → Result Processing → UI Display**

It is designed as a beginner-friendly Android project while following a clean and straightforward application structure.

## 👨‍💻 Author

**Aman Kumar**

* Android Developer
* Kotlin | XML | Jetpack Compose
* GitHub: [Aman-Kumar-Goswami](https://github.com/Aman-Kumar-Goswami)

---

⭐ If you find this project useful, consider giving the repository a star!
