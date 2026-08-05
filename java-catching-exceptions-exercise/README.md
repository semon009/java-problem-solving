# Catching Specific Exceptions in Java

## Problem Overview
The goal of this exercise is to implement the `methodCatchingSomeExceptions()` method to invoke a method that throws multiple unchecked exceptions (`methodThrowingExceptions()`).

The solution must selectively catch **only** two specific exception types:
- `ArrayIndexOutOfBoundsException`
- `NumberFormatException`

When caught, the program must print the simple class name of the exception. Any other exception type thrown by `methodThrowingExceptions()` should **not** be caught inside `methodCatchingSomeExceptions()`, allowing them to propagate to the calling `main` method.

## Key Concepts Applied

1. **Selective Exception Handling (`try-catch`):**
   Explicitly handling only expected exception types (`ArrayIndexOutOfBoundsException` and `NumberFormatException`) while letting unhandled exceptions bubble up the call stack.

2. **Alternative Multi-Catch Syntax:**
   In Java 7+, multiple exceptions can also be handled in a single catch block using the pipe (`|`) operator:
   ```java
   try {
       methodThrowingExceptions();
   } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
       System.out.println(e.getClass().getSimpleName());
   }
   ```
3. **How to Run:***
Compile the Java source file:
```bash
javac Main.java
```
Execute the compiled program:
```bash
java Main
```
Input Example:
Inputting invalid numbers (e.g., `abc 123`) triggers a NumberFormatException which prints:
```bash
NumberFormatException
```
Inputting invalid indices triggers an `ArrayIndexOutOfBoundsException` which prints:
```bash
ArrayIndexOutOfBoundsException
```
