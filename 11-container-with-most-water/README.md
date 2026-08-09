# 11. Container With Most Water

## Difficulty

Medium

## Problem

Given an integer array `height`, where each element represents the height of a vertical line, find two lines that together with the x-axis form a container that holds the maximum amount of water.

---

## Approach

Use the **Two Pointer** technique.

- Start with one pointer at the beginning and another at the end.
- Calculate the area between the two lines.
- Move the pointer with the smaller height because the shorter line limits the amount of water.
- Continue until both pointers meet.
- Keep track of the maximum area found.

---

## Algorithm

1. Initialize `left` at `0` and `right` at the last index.
2. Calculate:
   - Width = `right - left`
   - Height = minimum of the two heights
3. Update the maximum area.
4. Move the pointer with the smaller height.
5. Repeat until `left < right` is false.
6. Return the maximum area.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Key Concepts

- Two Pointers
- Arrays
- Greedy Approach
- Optimization

---

## What I Learned

The shorter height limits the amount of water that can be stored. This makes it possible to eliminate unnecessary pairs and solve the problem efficiently using two pointers instead of checking every possible pair.

---

## Language

Java