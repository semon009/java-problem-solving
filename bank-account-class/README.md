# Bank Account Class Implementation

## 📌 Problem Description
Create a Java class named `Account` representing a bank account with three attributes and a constructor to initialize them in a specific order.

### Requirements:
- **Fields:**
  - `balance` of type `long`
  - `ownerName` of type `String`
  - `locked` of type `boolean`
- **Constructor:** A parameterized constructor initializing all three fields in the exact order: `(balance, ownerName, locked)`.

---

### 💡 Implementation Details
- Uses explicit field scoping for `balance`, `ownerName`, and `locked`.
- Employs the `this` keyword inside the constructor to resolve naming ambiguity between parameters and instance fields.

---

### 🛠️ Class Structure
```java
class Account {
    long balance;
    String ownerName;
    boolean locked;

    public Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}
