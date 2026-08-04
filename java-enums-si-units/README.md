# Java Enum: System of Units (SI)

## Problem Description
This exercise demonstrates the use of fields, constructors, and instance methods inside a Java `enum`.

You are given an enum `SI` representing international units of measurement. Each constant stores its corresponding physical quantity name (`length`, `mass`, `time`). 

### Task
Implement the instance method `getQuantityName()` inside the `SI` enum to return the `quantityName` field of the selected constant.

## Solution

```java
public enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    public String getQuantityName() {
        return quantityName;
    }
}
```

## How to Run

1. Compile the Java files:
   ```bash
   javac SI.java Main.java
   ```
2. Run the Main program:
   ```bash
   java Main
   ```

### Output
```text
M represents: length
KG represents: mass
S represents: time
```
