# 🧮 BMI Calculator

A simple and user-friendly **BMI (Body Mass Index) Calculator Android application** built using **Kotlin and XML**.

The application allows users to enter their **height and weight**, calculate their BMI instantly, and view their corresponding BMI category.

## ✨ Features

* 📏 Enter height and weight
* 🧮 Calculate BMI instantly
* 📊 Display calculated BMI
* 💡 Show BMI category
* ✅ Input validation
* 📱 Simple and clean XML-based UI
* ⚡ Lightweight and easy to use

## 🛠️ Tech Stack

* **Kotlin** – Application logic
* **XML** – User interface
* **Android Studio** – Development environment
* **Android SDK** – Android development
* **Gradle** – Build system

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
4. The application calculates and displays your BMI.
5. The corresponding BMI category is also displayed.

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Aman-Kumar-Goswami/BMICalculator.git
```

### 2. Open the Project

Open the cloned project in **Android Studio**.

### 3. Sync Gradle

Allow Android Studio to complete the **Gradle sync**.

### 4. Run the Application

Connect an Android device or start an Android Emulator and click **Run ▶**.

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

This project was developed to practice:

* Kotlin fundamentals
* Android application development
* XML-based UI development
* User input handling
* Input validation
* Basic mathematical calculations
* Event handling in Android
* Building and running an Android application

## 🔮 Future Improvements

* 🌙 Add Dark Mode
* 📜 Add BMI History
* 👤 Add age and gender-based analysis
* 💡 Add general health recommendations
* 🎨 Improve UI and animations
* 📏 Support different height units (cm / ft & in)
* ⚖️ Support different weight units (kg / lb)


