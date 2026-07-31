# Vehicle Hierarchy in Java

A simple Object-Oriented Programming (OOP) project in Java demonstrating basic **Inheritance** and **Method Overriding**.

---

## 📜 Problem Statement

Design a simple vehicle hierarchy with a base class `Vehicle` and two subclasses `Car` and `Motorcycle`.

### Requirements:
1. **Base Class (`Vehicle`)**:
   - Properties: `brand` (String), `year` (int).
   - Method: `displayInfo()` to print basic vehicle information.
2. **Subclasses**:
   - `Car` (extends `Vehicle`): Adds a `numDoors` (int) property.
   - `Motorcycle` (extends `Vehicle`): Adds a `hasSidecar` (boolean) property.
3. **Execution**:
   - Read user input for vehicle type (`"Car"` or `"Motorcycle"`), `brand`, and `year`.
   - Read specific parameters (`numDoors` for `Car`, `hasSidecar` for `Motorcycle`).
   - Instantiate the correct object and call its `displayInfo()` method.

---

## 🚀 Input & Output Format

### Input Order:
1. Vehicle Type (`Car` or `Motorcycle`)
2. Brand
3. Year
4. Specific Property (`numDoors` for Car / `hasSidecar` for Motorcycle)

### Sample 1:
**Input:**
```text
Car
Toyota
2022
4
