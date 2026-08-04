# Java Enum: Danger Levels

## Problem Description
This exercise focuses on extending a Java `enum` by encapsulating an integer state variable and exposing an accessor method.

You are given an enum `DangerLevel`. The goal is to associate each enum constant with a specific numerical priority:
- `HIGH` — 3
- `MEDIUM` — 2
- `LOW` — 1

### Task
1. Add an integer field to store the danger level values.
2. Implement the `getLevel()` instance method that returns the integer associated with the constant.

## Solution

```java
public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
```

## How to Run

1. Compile the files:
   ```bash
   javac DangerLevel.java Main.java
   ```
2. Execute the compiled program:
   ```bash
   java Main
   ```

### Output
```text
Is HIGH > MEDIUM? true
Is LOW < MEDIUM? true
HIGH level is: 3
MEDIUM level is: 2
LOW level is: 1
```
