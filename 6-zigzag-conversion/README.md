# 6. Zigzag Conversion

## Difficulty

Medium

---

## Problem

Given a string `s` and an integer `numRows`, arrange the characters in a zigzag pattern across the specified number of rows. After forming the pattern, read the characters row by row to produce the converted string.

---

## Approach

Instead of constructing the zigzag pattern explicitly, maintain a `StringBuilder` for each row.

- Traverse each character in the string.
- Append the character to the current row.
- Change the traversal direction when reaching the first or last row.
- Finally, concatenate all rows to produce the result.

---

## Algorithm

1. Handle the edge case when `numRows` is `1`.
2. Create a `StringBuilder` for each row.
3. Traverse the input string.
4. Append each character to the current row.
5. Reverse the direction at the first and last rows.
6. Combine all rows into the final string.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

where `n` is the length of the input string.

---

## Key Concepts

- Simulation
- String Manipulation
- StringBuilder
- Arrays
- Traversal

---

## What I Learned

- Some problems become easier when they are simulated step by step instead of searching for a mathematical formula.
- Maintaining the current row and traversal direction simplifies the implementation.
- `StringBuilder` is efficient for repeated string concatenation.

---

## Language

Java