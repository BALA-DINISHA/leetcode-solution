# 2149. Rearrange Array Elements by Sign

## Difficulty

Medium

## Problem

Given an integer array containing positive and negative numbers, rearrange the elements so that:

- Positive and negative numbers appear alternately.
- The first element is positive.
- The relative order of positive numbers is maintained.
- The relative order of negative numbers is maintained.

---

## Approach

Use a new array and maintain two positions:

- `pos = 0` for positive numbers.
- `neg = 1` for negative numbers.

While traversing the input array:

- Place positive numbers at even indexes.
- Place negative numbers at odd indexes.

After placing an element, move the corresponding position by `2`.

---

## Algorithm

1. Create a result array of the same size.
2. Initialize `pos = 0` and `neg = 1`.
3. Traverse the input array.
4. If the number is positive, place it at `pos` and increase `pos` by `2`.
5. If the number is negative, place it at `neg` and increase `neg` by `2`.
6. Return the result array.

---

## Example

Input:

`[3, 1, -2, -5, 2, -4]`

Output:

`[3, -2, 1, -5, 2, -4]`

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Concepts

- Arrays
- Array Indexing
- Two Position Pointers
- Traversal

---

## What I Learned

Using separate indexes for positive and negative numbers makes the rearrangement straightforward. Instead of repeatedly searching for positions, each number can be placed directly at its required index.

---

## Language

Java