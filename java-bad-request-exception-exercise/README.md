# Java Checked Exception Exercise - BadRequestException

## Problem Description
Create a class named `BadRequestException` that satisfies the following conditions:
1. Inherits from a **checked exception** in Java.
2. Contains a constructor that accepts a `String message` argument and passes it to the superclass constructor using `super(message)`.

## Solution Explanation
In Java, custom exceptions can be classified based on the class they extend:
- **Checked Exceptions:** Extend `java.lang.Exception` directly (or any subclass of `Exception` that does not derive from `RuntimeException`). These must be handled at compile-time using a `try-catch` block or declared using the `throws` keyword.
- **Unchecked Exceptions:** Extend `java.lang.RuntimeException`.

### Key Implementation Details:
- Extended `Exception` to mark `BadRequestException` as a **checked exception**.
- Implemented a single-parameter constructor `BadRequestException(String message)` and passed the message up the inheritance chain using `super(message)`.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        try {
            throw new BadRequestException("Invalid request parameters provided.");
        } catch (BadRequestException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```
Expected Output:
```bash
Caught exception: Invalid request parameters provided.
```
