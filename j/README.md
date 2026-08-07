# 1189. Maximum Number of Balloons

## Difficulty

Easy

---

## Problem

Given a string `text`, return the maximum number of times the word **"balloon"** can be formed using the characters from the string.

Each character can be used only once.

---

## Approach

- Count the frequency of every character in the input string.
- Extract the frequencies of the characters required to form `"balloon"`.
- Since `'l'` and `'o'` appear twice in `"balloon"`, divide their frequencies by `2`.
- The minimum frequency among the required characters determines the maximum number of times `"balloon"` can be formed.

---

## Algorithm

1. Create a frequency array of size 26.
2. Count the occurrences of each character.
3. Retrieve the counts for `b`, `a`, `l`, `o`, and `n`.
4. Divide the counts of `l` and `o` by `2`.
5. Return the minimum of these values.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

where `n` is the length of the input string.

---

## Key Concepts

- Frequency Array
- Character Counting
- Arrays
- Greedy Observation

---

## What I Learned

- Frequency arrays provide an efficient way to solve character-counting problems.
- Paying attention to repeated characters in the target word is essential for obtaining the correct answer.
- Breaking the problem into counting and comparison steps keeps the solution simple and efficient.

---

## Language

Java