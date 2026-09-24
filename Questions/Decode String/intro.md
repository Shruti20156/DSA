# Decode String

## Problem Link
[LeetCode - Decode String](https://leetcode.com/problems/decode-string/)

## Problem
Given an encoded string, decode it.

Example:
s = "3[a]2[bc]"

Output:
"aaabcbc"

## Approach
- Use one stack for previous strings.
- Use one stack for repeat counts.
- Build the current string.
- When `[` comes, save the current string and count.
- When `]` comes, repeat the current string and combine it with the previous string.

## Data Structures
- Stack<String>
- Stack<Integer>

## Time Complexity
O(n)

## Space Complexity
O(n)

## Key Concept
Stack
