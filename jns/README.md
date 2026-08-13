# 66. Plus One

## Difficulty

Easy

## Problem

Given an integer represented as an array of digits, add one to the integer and return the resulting array of digits.

---

## Approach

Start from the last digit because addition begins from the least significant digit.

- If the current digit is less than `9`, increment it and return the array.
- If the digit is `9`, change it to `0` and continue to the previous digit.
- If all digits are `9`, create a new array with an additional digit and set the first element to `1`.

---

## Algorithm

1. Traverse the array from right to left.
2. Check whether the current digit is less than `9`.
3. If yes, increment it and return the result.
4. If it is `9`, set it to `0`.
5. If all digits were `9`, create a new array of size `n + 1`.
6. Set the first element to `1`.

---

## Example

Input:

`[9, 1, 1]`

Output:

`[9, 1, 2]`

Another example:

Input:

`[9, 9, 9]`

Output:

`[1, 0, 0, 0]`

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` in the normal case
- **Worst-case Space:** `O(n)` when all digits are `9`

---

## Key Concepts

- Arrays
- Carry Handling
- Reverse Traversal
- Edge Cases

---

## What I Learned

The main idea is to handle the carry from right to left instead of converting the entire array into an integer. This also handles very large numbers without integer overflow.

---

## Language

Java