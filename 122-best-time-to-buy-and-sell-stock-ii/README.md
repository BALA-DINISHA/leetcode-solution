# 122. Best Time to Buy and Sell Stock II

## Difficulty

Medium

## Problem

Given an array `prices`, where `prices[i]` represents the price of a stock on the `i`th day, find the maximum profit that can be achieved by making as many transactions as needed.

A stock must be sold before buying again.

---

## Approach

Use a greedy approach.

If today's price is greater than yesterday's price, take the difference as profit.

By adding every positive price difference, we capture all possible profitable increases.

---

## Algorithm

1. Initialize `profit = 0`.
2. Start from the second day.
3. Compare the current price with the previous day's price.
4. If the current price is higher, add the difference to `profit`.
5. Return the total profit.

---

## Example

Input:

`[7,1,5,3,6,4]`

Profitable increases:

`5 - 1 = 4`

`6 - 3 = 3`

Total profit:

`4 + 3 = 7`

Output:

`7`

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Key Concepts

- Greedy Algorithm
- Arrays
- One-Pass Traversal
- Profit Calculation

---

## What I Learned

Instead of trying to find every possible buy and sell combination, I can collect every positive price increase. This greedy approach gives the maximum possible profit in a single traversal.

---

## Language

Java