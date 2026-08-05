# Fixing StringIndexOutOfBoundsException

## Problem Description
Write a program that reads a string and an integer `N`, then outputs the `N`-th character of the string (0-indexed). 

If the provided index is out of bounds (negative or greater than/equal to the string length), the program must output `"Out of bounds!"` instead of throwing a `StringIndexOutOfBoundsException`.

### Constraints & Edge Cases
- Handles negative indices (e.g., `-1`).
- Handles indices equal to or greater than the string length (e.g., `index >= length`).

## Example Inputs & Outputs

### Example 1
**Input:**
```text
Java
2
```
**Output:**
```text
v
```
### Example 2
**Input:**
```text
Hello
10
```
**Output:**
```text
Out of bounds!
```
### Example 3
**Input:**
```text
Code
-1
```
**Output:**
```text
Out of bounds!
```
## Solution Logic
Before retrieving the character using `String.charAt(index)`, we validate the given index:
- 1- `index < 0`: Checks for invalid negative inputs.
- 2- `index >= string.length()`: Ensures the index does not exceed valid character positions.

If either condition is met, the program prints `"Out of bounds!"`. Otherwise, it safely accesses and prints the character at position `index`.
