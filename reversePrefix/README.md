# 2000. Reverse Prefix of Word

## Difficulty

Easy

---

## Problem

Given a string `word` and a character `ch`, reverse the prefix of `word` ending at the first occurrence of `ch`. If `ch` does not exist in the string, return the original word.

---

## Approach

- Traverse the string to find the first occurrence of the target character.
- If the character is not found, return the original string.
- Otherwise, extract the prefix ending at that character.
- Reverse the prefix using a helper method.
- Append the remaining part of the string and return the result.

---

## Algorithm

1. Find the first occurrence of `ch`.
2. If not found, return `word`.
3. Reverse the substring from index `0` to `i`.
4. Append the remaining substring.
5. Return the final string.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Concepts

- Strings
- String Manipulation
- Substring
- Traversal

---

## What I Learned

- Breaking a problem into smaller helper methods improves readability.
- String manipulation becomes simpler by combining `substring()` with a custom reverse function.
- Always handle edge cases, such as when the target character is not present.

---

## Language

Java