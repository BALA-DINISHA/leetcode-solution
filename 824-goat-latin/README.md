# 824. Goat Latin

## Difficulty

Easy

---

## Problem

Given a sentence, convert each word into Goat Latin by following specific transformation rules based on whether the word begins with a vowel or a consonant.

---

## Approach

- Split the sentence into individual words.
- For each word:
  - If it starts with a vowel, append `"ma"`.
  - If it starts with a consonant, move the first character to the end and then append `"ma"`.
- Add one additional `'a'` for each word based on its position in the sentence.
- Join all transformed words to form the final sentence.

---

## Algorithm

1. Split the sentence into words.
2. Traverse each word.
3. Check whether the first character is a vowel.
4. Apply the required transformation.
5. Append `"a"` characters according to the word's index.
6. Join all words and return the result.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

where `n` is the total number of characters in the sentence.

---

## Key Concepts

- String Manipulation
- StringBuilder / StringBuffer
- Character Checking
- Arrays
- Loops

---

## What I Learned

- Breaking a sentence into words makes string-processing problems easier to solve.
- Using a mutable string object such as `StringBuilder` improves efficiency when constructing the final result.
- Following the problem rules step by step leads to a clean implementation.

---

## Language

Java