# 1780. Check if Number is a Sum of Powers of Three

## Difficulty

Medium

## Problem

Given an integer `n`, determine whether it can be represented as the sum of distinct powers of `3`.

For example:

`12 = 3¹ + 3² = 3 + 9`

So `12` can be represented as a sum of powers of three.

---

## Approach

The key observation is to look at the **base-3 representation** of `n`.

If `n` is a sum of distinct powers of `3`, its base-3 representation can contain only `0` and `1`.

If any digit is `2`, the number cannot be represented as the required sum.

Therefore:

- Find the remainder when `n` is divided by `3`.
- If the remainder is `2`, return `false`.
- Otherwise, divide `n` by `3` and continue.
- If all ternary digits are `0` or `1`, return `true`.

---

## Algorithm

1. While `n > 0`:
   - Check `n % 3`.
   - If it equals `2`, return `false`.
   - Divide `n` by `3`.
2. Return `true`.

---

## Example

For `n = 12`:

```text
12 / 3 → remainder 0
4  / 3 → remainder 1
1  / 3 → remainder 1
```

Ternary representation:

`110`

Since it contains only `0` and `1`, the answer is `true`.

---

## Complexity Analysis

- **Time Complexity:** `O(log₃ n)`
- **Space Complexity:** `O(1)`

---

## Key Concepts

- Base-3 / Ternary Representation
- Modulo Operator
- Integer Division
- Mathematical Observation

---

## What I Learned

A number can be checked for a sum of distinct powers of three by examining its ternary representation. If the representation contains a `2`, the number cannot be formed using distinct powers of `3`.

---

## Language

Java