# Calculating Areas of Rectangles and Circles

## Description
This project demonstrates the use of **Abstract Classes** and **Polymorphism** in Java Object-Oriented Programming (OOP).

### Problem Overview
The objective is to calculate the area of different geometric shapes. Since the calculation formula differs depending on the shape, an abstract base class is used. 

### Solution Structure
1. **`Shape` (Abstract Class):** Contains an abstract method `area()` that enforces child classes to provide their own implementation for calculating the area.
2. **`Rectangle`:** Extends `Shape`. Takes `length` and `width` via the constructor and implements `area()` as `length * width`.
3. **`Circle`:** Extends `Shape`. Takes `radius` via the constructor and implements `area()` as $\pi \times radius^2$ using Java's `Math.PI` and `Math.pow()`.
4. **`Main`:** Reads user input for the dimensions, instantiates the shapes, and prints their calculated areas.

## Key Concepts Demonstrated
- Abstract Classes (`abstract class`)
- Abstract Methods
- Method Overriding (`@Override`)
- Utilizing the `java.lang.Math` class for precise mathematical calculations.

## Sample Execution

### Sample Input
```text
5
3
4
```
### Sample Output
```text
Plaintext
15.0
50.26548245743669
```
