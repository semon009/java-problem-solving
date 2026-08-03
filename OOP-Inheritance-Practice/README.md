# Users and WebSites - OOP Abstract Class & Inheritance

## Description
This project demonstrates **Inheritance** and **Refactoring** in Java using the DRY (Don't Repeat Yourself) principle.

### Problem Overview
We collect information about users visiting websites using three classes: `User`, `WebSite`, and `Visit`. Originally, common properties (`id` and `version`) and their respective getter/setter methods were duplicated across all three classes.

### Solution
1. Created an `abstract` base class named `BaseEntity` containing shared attributes (`id`, `version`) and methods.
2. Extended `BaseEntity` in `User`, `WebSite`, and `Visit`.
3. Removed duplicated fields/methods from child classes, keeping only domain-specific attributes.

## Key Concepts Demonstrated
- Abstract Classes (`abstract class BaseEntity`)
- Class Inheritance (`extends`)
- Code Reusability (DRY Principle)
- Polymorphism (referencing derived objects using `BaseEntity` type)
