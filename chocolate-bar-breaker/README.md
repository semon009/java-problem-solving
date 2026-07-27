# 🍫 Chocolate Bar Problem

A Java solution to determine if a specific number of chocolate segments ($K$) can be broken off an $N \times M$ chocolate bar using **a single straight line cut** (horizontal or vertical).

---

## 💡 Logic & Math Approach

To split exactly $K$ segments with **one straight cut**:
1. **Boundary Check:** $K$ must not exceed the total number of segments ($K \le N \times M$).
2. **Horizontal Cut:** Removes full rows of width $N$. Therefore, $K$ must be a multiple of $N$ (`K % N == 0`).
3. **Vertical Cut:** Removes full columns of height $M$. Therefore, $K$ must be a multiple of $M$ (`K % M == 0`).

If $K$ satisfies the boundary check **and** is divisible by either $N$ or $M$, the output is `YES`; otherwise, `NO`.

---

## 📥 Input / Output Format

### Input
Three integers separated by whitespace/newlines:
- `N`: Width of the chocolate bar
- `M`: Height of the chocolate bar
- `K`: Target number of segments to break off

### Output
- `YES` or `NO`

---

## 🧪 Examples

| Input ($N, M, K$) | Output | Explanation |
| :--- | :--- | :--- |
| `4`<br>`2`<br>`6` | `YES` | $K = 6$ is divisible by $M = 2$ ($3 \times 2 = 6$). Cut 3 full columns. |
| `2`<br>`10`<br>`7` | `NO` | $K = 7$ is not divisible by $N=2$ or $M=10$. Impossible in 1 cut. |
| `7`<br>`4`<br>`21` | `YES` | $K = 21$ is divisible by $N = 7$ ($3 \times 7 = 21$). Cut 3 full rows. |

---
