# Java Unchecked Exception Exercise

## Problem Description
Create a class named `UncheckedException`, which must inherit from an unchecked exception type in Java. Inside the `UncheckedException` class, declare a no-argument constructor.

The solution must satisfy the `instanceof RuntimeException` check provided in the `Main` class.

## Solution Concept
In Java, exceptions are divided into two main categories:
- **Checked Exceptions:** Subclasses of `Exception` (excluding `RuntimeException`) that the compiler forces you to handle.
- **Unchecked Exceptions:** Subclasses of `RuntimeException` that occur during runtime.

To fulfill the requirements:
1. Extended `RuntimeException` to make `UncheckedException` an unchecked exception.
2. Implemented a default (no-argument) constructor inside `UncheckedException`.

## How to Run

Compile the code:
```bash
javac Main.java
```
Run the application:
```bash
java Main
```
Expected Output:
```bash
true
```
