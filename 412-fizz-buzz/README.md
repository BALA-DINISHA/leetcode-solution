# 412. Fizz Buzz

## Difficulty

Easy

---

## Problem

Given an integer `n`, return a string array from `1` to `n` where:

- Multiples of **3** are replaced with `"Fizz"`.
- Multiples of **5** are replaced with `"Buzz"`.
- Multiples of both **3** and **5** are replaced with `"FizzBuzz"`.
- Otherwise, return the number as a string.

---

## Approach

Iterate through the numbers from `1` to `n`.

For each number:

- If it is divisible by both `3` and `5`, add `"FizzBuzz"`.
- Else if divisible by `3`, add `"Fizz"`.
- Else if divisible by `5`, add `"Buzz"`.
- Otherwise, convert the number to a string and add it to the result list.

---

## Algorithm

1. Create an empty list.
2. Loop from `1` to `n`.
3. Check divisibility by `3` and `5`.
4. Add the appropriate string.
5. Return the list.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Concepts

- Loops
- Conditional Statements
- Modulo Operator (`%`)
- ArrayList
- String Conversion

---

## What I Learned

- Order of conditions matters when multiple conditions can be true.
- Checking the combined condition (`3` and `5`) first avoids incorrect results.
- Simple problems help reinforce programming fundamentals.

---

## Language

Java