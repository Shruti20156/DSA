# Simplify Path

🔗 [LeetCode - Simplify Path](https://leetcode.com/problems/simplify-path/)

## Problem

Given an absolute Unix-style file path, simplify it and return the canonical path.

## Example

Input:
`/home/`

Output:
`/home`

Input:
`/home//foo/`

Output:
`/home/foo`

## Approach

- Split the path using `/`.
- Use a Stack to store valid directory names.
- Ignore `.` because it represents the current directory.
- For `..`, remove the previous directory if possible.
- Ignore empty strings caused by consecutive `/`.
- Finally, build the answer from the stack.

## Data Structure

Stack

## Time Complexity

O(n)

## Space Complexity

O(n)
