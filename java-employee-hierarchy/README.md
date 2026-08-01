# 🏢 Employee Class Hierarchy in Java

An Object-Oriented Programming (OOP) project demonstrating **Inheritance**, **Encapsulation**, and **Constructor Chaining** in Java by designing a structured domain model for various employee types.

---

## 📌 Problem Description

Design a class hierarchy for an organization's workforce consisting of three main classes:
1. **`Employee`** (Base Class): Represents common attributes of all employees.
2. **`Developer`** (Subclass): Inherits from `Employee` and adds domain-specific attributes for software engineers.
3. **`DataAnalyst`** (Subclass): Inherits from `Employee` and adds attributes tailored for data science professionals.

---

## 💡 Key Concepts Applied

* **Inheritance (`extends`)**: Subclasses inherit common fields (`name`, `email`, `experience`) and behavior from `Employee` to promote code reuse.
* **Encapsulation**: Class attributes are marked `private` and accessed securely using `public` getter methods.
* **Constructor Chaining (`super`)**: Subclasses pass base arguments to `Employee` using `super(name, email, experience)`.
* **Java Naming Conventions**: Boolean getter method follows the `is<Field>()` standard (e.g., `isPhd()`).

---

## 📊 Class Structure Overview
