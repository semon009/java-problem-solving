# Calculate Square with Exception Handling

## Problem Description
Implement the `calculateSquare` method that receives an array of integers and an index. The method should output the square of the element at the specified index. 

If any exception occurs (e.g., array is `null` or `index` is out of bounds), the program must gracefully catch it and print `"Exception!"`.

### Constraints & Edge Cases Handled
- **Null Reference:** Handles cases where the array is `null` (`NullPointerException`).
- **Invalid Index:** Handles negative indices or indices greater than or equal to the array length (`ArrayIndexOutOfBoundsException`).

## Example Usage & Outputs

### Example 1: Valid Execution
```java
int[] numbers = {2, 3, 5};
calculateSquare(numbers, 1);
```
**Output:**
```text
9
```
### Example 2: Index Out of Bounds
```Java
int[] numbers = {2, 3, 5};
calculateSquare(numbers, 5);
```
**Output:**
```text
Exception!
```
### Example 3: Null Array Reference
```Java
int[] numbers = null;
calculateSquare(numbers, 0);
```
**Output:**
```text
Exception!
```
## Solution Approach
The solution utilizes a `try-catch` block to handle potential runtime exceptions cleanly:
- 1- Inside the `try` block, it accesses `array[index]` and prints its square (`element * element`).
- 2- If any exception occurs during array access, the `catch (Exception e)` block catches it and prints `"Exception!" to prevent the application from crashing.
