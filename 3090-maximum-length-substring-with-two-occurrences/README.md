# 3090. Maximum Length Substring With Two Occurrences

## Difficulty

Easy

## Problem

Given a string `s`, find the length of the longest substring in which each character appears at most twice.

---

## Approach

This solution uses a brute-force approach.

- Generate different substrings of the given string.
- For each substring, count the frequency of every character.
- If any character appears more than twice, the substring is invalid.
- Keep track of the maximum valid substring length.

---

## Algorithm

1. Use two loops to generate substrings.
2. Pass each substring to a helper method.
3. Use a frequency array to count characters.
4. If any character occurs more than twice, mark the substring as invalid.
5. Otherwise, compare its length with the current maximum.
6. Return the maximum length.

---

## Complexity Analysis

- **Time Complexity:** `O(n³)`
- **Space Complexity:** `O(n)`

The nested loops generate substrings, and each substring is scanned to count character frequencies.

---

## Key Concepts

- Strings
- Substrings
- Frequency Array
- Nested Loops
- Brute Force

---

## What I Learned

This problem helped me practice generating substrings and using a frequency array to validate character occurrences. It also showed me why brute-force solutions can be improved using patterns such as the sliding window technique.

---

## Language

Java