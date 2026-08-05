# 28. Find the Index of the First Occurrence in a String

## Difficulty

Easy

---

## Problem

Given two strings, `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`. If `needle` is not part of `haystack`, return `-1`.

---

## Approach

- Check whether `needle` exists in `haystack` using `contains()`.
- If it exists, return its first index using `indexOf()`.
- Otherwise, return `-1`.

This solution leverages Java's built-in string methods to keep the implementation simple and readable.

---

## Algorithm

1. Check if `haystack` contains `needle`.
2. If true, return `haystack.indexOf(needle)`.
3. Otherwise, return `-1`.

---

## Complexity Analysis

- **Time Complexity:** `O(n × m)` (depends on the internal implementation of Java's string search)
- **Space Complexity:** `O(1)`

---

## Key Concepts

- String Manipulation
- Built-in String Methods
- Searching

---

## What I Learned

- Java provides efficient built-in methods like `contains()` and `indexOf()` for common string operations.
- Before implementing a custom algorithm, it's worth considering whether the language already provides a suitable solution.
- Readability and simplicity are important when solving straightforward problems.

---

## Language

Java