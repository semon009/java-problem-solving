# 🔤 English Alphabet Generator

## 📌 Problem Description
Write a Java method using `StringBuilder` that generates all uppercase English letters (`A` to `Z`).
* Each letter must be separated by a single space.
* There should be **no trailing space** after the last letter (`Z`).

## 💡 Solution Logic
1. Loop through characters from `'A'` to `'Z'` using `char` iteration in Java.
2. Append each character to a `StringBuilder`.
3. Append a space `' '` only if the current character is not `'Z'` to avoid extra space at the end.

## 🛠️ Implementation
Check the solution file: [`Main.java`](./Main.java)
