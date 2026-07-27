# 🎬 Cinema Seats Allocation Problem

## 📌 Problem Description
Given a cinema with `n` rows and `m` seats per row (represented as an `n x m` matrix). 
- `0` represents an **available** seat.
- `1` represents an **occupied** seat.

The goal is to find the **first row** that has `k` consecutive available seats.

## 📥 Input Format
- First line: `n` (number of rows) and `m` (number of seats per row).
- Next `n` lines: The seating matrix (`0` or `1`).
- Last line: `k` (number of adjacent seats required).

## 📤 Output Format
- Output the **1-based index** of the first row that contains `k` consecutive available seats.
- If no such row exists, output `0`.

---

## 🧪 Examples

### Sample 1
**Input:**
```text
3 4
0 1 0 1
1 1 0 1
1 0 0 1
2
```
**Output:**
```text
3
```

### Sample 2
**Input:**
```text
3 3
0 1 0
1 0 0
1 1 1
3
```
**Output:**
```text
0
```

---

## 💡 Solution Explanation
1. Iterate through each row `i` from `0` to `n-1`.
2. Reset a `count` variable to `0` at the beginning of each row.
3. Iterate through each seat `j` in the current row:
   - If the seat is `0`, increment `count`.
   - If `count` reaches `k`, print the row number (`i + 1`) and terminate the program immediately.
   - If the seat is `1`, reset `count` to `0` (sequence broken).
4. If the loops finish without finding any suitable row, print `0`.

---

## ⏱️ Complexity
- **Time Complexity:** $\mathcal{O}(n \times m)$ — In the worst-case scenario, we visit each seat in the matrix once.
- **Space Complexity:** $\mathcal{O}(n \times m)$ — To store the 2D matrix.

---

[Image](Cinema.png)
