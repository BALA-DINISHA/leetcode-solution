# 3072. Distribute Elements Into Two Arrays II

## Difficulty

Hard

## Problem

Given an integer array `nums`, distribute its elements into two arrays according to the problem's comparison rules and finally concatenate the two arrays to produce the result.

---

## Approach

Maintain two separate arrays, `arr1` and `arr2`.

- Place the first element in `arr1`.
- Place the second element in `arr2`.
- For every remaining element, compare the last elements of both arrays.
- Add the current element to the array whose last element is smaller.
- Finally, concatenate `arr1` and `arr2` into the result array.

---

## Algorithm

1. Create two arrays to store the distributed elements.
2. Add the first two elements to the two arrays.
3. Traverse the remaining elements.
4. Compare the last elements of `arr1` and `arr2`.
5. Add the current element to the appropriate array.
6. Merge both arrays into the result.
7. Return the result.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Concepts

- Arrays
- Greedy Approach
- Array Traversal
- Index Management

---

## What I Learned

This problem was good practice for maintaining multiple arrays while processing elements sequentially. It also reinforced the importance of tracking the current size of each array when accessing the last inserted element.

---

## Language

Java