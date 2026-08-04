# Find Missing Elements

## Difficulty

Easy

---

## Problem

Given an integer array, find all the missing elements between the minimum and maximum values present in the array.

---

## Approach

- Traverse the array to determine the minimum and maximum values.
- Iterate through every number within this range.
- For each number, search the array to check if it exists.
- If a number is not found, add it to the result list.

---

## Algorithm

1. Find the minimum value.
2. Find the maximum value.
3. Iterate from `min` to `max`.
4. Check whether each value exists in the array.
5. Store values that are not present.
6. Return the list of missing elements.

---

## Complexity Analysis

- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(k)`

where:
- `n` = size of the input array
- `k` = number of missing elements

---

## Key Concepts

- Arrays
- Nested Loops
- Searching
- Minimum and Maximum
- ArrayList

---

## What I Learned

- Finding the range of values simplifies the search for missing elements.
- A brute-force solution is straightforward but can be optimized using a `HashSet` for faster lookups.
- Always analyze the time complexity and think about possible improvements.

---

## Language

Java