# Kotlin Calculator App

A simple, console-based calculator application written in Kotlin. This project demonstrates basic Kotlin programming concepts and serves as a starting point for more complex calculator applications.

## Features

- Perform basic arithmetic operations: addition, subtraction, multiplication, and division
- Continuous operation: perform multiple calculations in one session
- Error handling: deals with invalid inputs and division by zero

## Getting Started

### Prerequisites

- Kotlin compiler (version 1.5 or higher recommended)
- JDK (version 8 or higher)

### Running the application

1. Clone the repository:
   ```
   git clone https://github.com/S-Mircea/kotlin-calculator-app.git
   ```
2. Navigate to the project directory:
   ```
   cd kotlin-calculator-app
   ```
3. Compile the Kotlin file:
   ```
   kotlinc CalculatorApp.kt -include-runtime -d CalculatorApp.jar
   ```
4. Run the application:
   ```
   java -jar CalculatorApp.jar
   ```

## Usage

When you run the application, you'll be presented with a prompt to enter an operation. Here's how to use it:

1. Enter one of the following operators: +, -, *, /
2. Enter the first number when prompted
3. Enter the second number when prompted
4. View the result
5. Repeat or enter 'q' to quit the application

Example:
```
Welcome to Simple Calculator!

Enter an operation (+, -, *, /) or 'q' to quit:
+
Enter the first number:
5
Enter the second number:
3
Result: 8.0

Enter an operation (+, -, *, /) or 'q' to quit:
q
Thank you for using Simple Calculator. Goodbye!
```


