# 🧮 BMI Calculator

A simple and user-friendly **BMI (Body Mass Index) Calculator Android application** built using **Kotlin and XML**.

The app allows users to enter their height and weight and quickly calculate their BMI with the corresponding BMI category.

## ✨ Features

* 📏 Enter height and weight
* 🧮 Calculate BMI instantly
* 📊 Display BMI result
* 💡 Show BMI category
* 📱 Simple and clean Android UI
* ⚡ Lightweight and easy to use
* ✅ Input validation

## 🛠️ Tech Stack

* **Kotlin**
* **XML**
* **Android Studio**
* **Android SDK**
* **Gradle**

## 📱 BMI Categories

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

For example:

```text
Weight = 70 kg
Height = 1.75 m

BMI = 70 / (1.75 × 1.75)
BMI ≈ 22.86
```

## 🚀 Getting Started

### Clone the repository

```bash
git clone https://github.com/Aman-Kumar-Goswami/BMICalculator.git
```

### Open the project

Open the cloned project in **Android Studio**.

### Build the project

Allow Gradle to sync and then build the project.

### Run the application

Connect an Android device or start an Android Emulator and click **Run ▶**.

## 📂 Project Structure

```text
BMICalculator/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           └── res/
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🎯 Purpose

This project was created to practice Android application development, Kotlin programming, XML-based UI development, user input handling, and basic mathematical logic.

## 🔮 Future Improvements

* Add dark mode
* Add BMI history
* Add age and gender-based results
* Add health recommendations
* Improve UI animations
* Add unit conversion for height and weight

