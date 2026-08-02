# Shapes Area Calculator (Java OOP)

## Overview
This repository contains a simple Java program that demonstrates core Object-Oriented Programming (OOP) concepts, specifically **Inheritance** and **Method Overriding**. 

## Problem Statement
The goal of this exercise is to calculate the area of different geometric shapes. We have a parent class `Shape` with a default `area()` method. Four child classes (`Triangle`, `Circle`, `Square`, and `Rectangle`) inherit from `Shape`. 

Each child class overrides the `area()` method to provide its own specific formula:
- **Triangle Area:** `S = (base * height) / 2`
- **Circle Area:** `S = π * r^2` (Using `Math.PI`)
- **Square Area:** `S = side^2`
- **Rectangle Area:** `S = width * height`

## What I Learned
- How to use the `extends` keyword for inheritance in Java.
- How to properly use the `@Override` annotation.
- How to implement polymorphism by overriding parent class methods to perform child-specific behaviors.
