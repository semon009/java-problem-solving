# Vehicle Hierarchy - Java OOP Practice

A simple Java application demonstrating fundamental Object-Oriented Programming (OOP) concepts, specifically **Inheritance** and **Method Overriding**.

## Problem Description
Create a `Vehicle` base class and two derived subclasses: `Car` and `Motorcycle`. The program accepts an integer representing speed and outputs details for both vehicles.

* **Vehicle**: Base class with a `speed` property and a `getInfo()` method.
* **Car**: Subclass overriding `getInfo()` to output doors count (`Doors: 4`).
* **Motorcycle**: Subclass overriding `getInfo()` to output sidecar status (`Sidecar: false`).

## Key Concepts Demonstrated
- **Inheritance (`extends`)**: Subclasses inheriting attributes from the `Vehicle` base class.
- **Method Overriding (`@Override`)**: Customizing `getInfo()` logic in derived classes.
- **Constructor Chaining (`super`)**: Invoking parent class constructors to initialize member fields.

## Input & Output Example

### Input
```
60
```
### Output
```
Car: Speed 60 mph, Doors: 4
Motorcycle: Speed 60 mph, Sidecar: false
```
