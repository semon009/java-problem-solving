# Generate Hard-to-Crack Password

## 📌 Problem Description
Generate a password of exact length $N$ satisfying the following conditions:
- Contains at least $A$ uppercase letters.
- Contains at least $B$ lowercase letters.
- Contains at least $C$ digits.
- **Constraint:** No two adjacent characters in the password can be identical (e.g., `AA` is invalid, `ABA` is valid).

Guarantees:
- $A + B + C \le N$
- Any parameter ($A, B, C$) can be zero.

---

### 💡 Solution Approach
1. **Sequential Generation:** Append the mandatory minimum counts sequentially: Uppercase ($A$), Lowercase ($B$), and Digits ($C$).
2. **Preventing Consecutive Duplicates:** Check the last appended character in `StringBuilder`. Alternate characters if a match occurs (e.g., toggle between `'A'` and `'B'`).
3. **Filling to Length $N$:** Use a `while` loop to fill any remaining spaces up to length $N$ while maintaining the non-repeating rule.

---

### 📥 Sample Tests

**Sample 1:**
- **Input:** `3 2 3 10`
- **Output:** `ABAab121AB`

**Sample 2:**
- **Input:** `1 0 0 1`
- **Output:** `A`

---

### 🛠️ Complexity
- **Time Complexity:** $\mathcal{O}(N)$ — Single pass to build a string of length $N$.
- **Space Complexity:** $\mathcal{O}(N)$ — Storage used for `StringBuilder`.
