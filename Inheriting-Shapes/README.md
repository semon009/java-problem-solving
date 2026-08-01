# Java OOP: Inheriting Shapes with Constructors

## Problem Description
Create a base class called `Shape` with a constructor that takes the shape's name as a parameter. Then, create a derived class called `Rectangle` that inherits from `Shape` with a constructor that takes the shape's `name`, `width`, and `height`. 

The `Rectangle` constructor must call the base class constructor using the `super` keyword. Finally, instantiate a `Rectangle` object using user input and print its attributes.

### Input Format
- **Line 1:** String (`name`)
- **Line 2:** Integer (`width`)
- **Line 3:** Integer (`height`)

### Sample Input
```text
Square
5
5
