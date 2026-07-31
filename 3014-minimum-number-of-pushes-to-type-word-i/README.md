# 3014. Minimum Number of Pushes to Type Word I

## Problem

Given a word, determine the minimum number of button presses required to type it on a remapped keypad.

**Difficulty:** Easy

---

## Approach

Since the characters can be arranged optimally on the keypad, the first **8 characters** require **1 push** each, the next **8 characters** require **2 pushes**, and so on.

For each character in the word:

- Calculate the required pushes using `(index / 8) + 1`.
- Add the pushes to the total count.
- Return the final sum.

---

## Algorithm

1. Initialize `sum = 0`.
2. Traverse the string from left to right.
3. For each index:
   - Calculate `push = (index / 8) + 1`.
   - Add `push` to `sum`.
4. Return `sum`.

---

## Java Solution

```java
class Solution {
    public int minimumPushes(String word) {
        int push;
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            push = (i / 8) + 1;
            sum += push;
        }

        return sum;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

where `n` is the length of the word.

---

## Key Concepts

- Greedy Strategy
- Index-Based Calculation
- String Traversal

---

## What I Learned

- Some optimization problems can be solved without simulating every operation.
- Observing patterns in the constraints can lead to a simple mathematical solution.
- Integer division is useful for grouping elements into fixed-size batches.

---

## LeetCode

- **Problem:** 3014. Minimum Number of Pushes to Type Word I
- **Language:** Java