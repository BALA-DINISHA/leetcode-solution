# 121. Best Time to Buy and Sell Stock

## Difficulty

Easy

## Problem

Given an array `prices`, where `prices[i]` represents the price of a stock on the `i`th day, find the maximum profit that can be achieved by buying on one day and selling on a later day.

If no profit can be made, return `0`.

---

## Approach

Use a single pass through the array.

- Keep track of the lowest price seen so far.
- For each price, calculate the possible profit if the stock is sold on that day.
- Keep track of the maximum profit found.
- Update the minimum buying price whenever a lower price is found.

---

## Algorithm

1. Initialize the minimum buying price with the first day's price.
2. Traverse the array.
3. Calculate the profit using the current price minus the minimum buying price.
4. Update the maximum profit.
5. Update the minimum buying price.
6. Return the maximum profit.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Key Concepts

- Arrays
- Greedy Approach
- One-Pass Traversal
- Minimum Value Tracking

---

## What I Learned

The key idea is to keep track of the lowest buying price seen so far while checking the best possible selling price at each position. This avoids checking every possible buy-and-sell combination.

---

## Language

Java