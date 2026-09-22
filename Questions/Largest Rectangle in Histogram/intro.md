# Largest Rectangle in Histogram

🔗 [LeetCode - Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)

## Approach

1. Find Next Smaller Element to Right (NSR).
2. Find Next Smaller Element to Left (NSL).
3. Calculate the width of the rectangle:
   
   `width = NSR - NSL - 1`

4. Calculate area:
   
   `area = height × width`

5. Keep the maximum area.

## Data Structure

Stack

## Time Complexity

O(n)

## Space Complexity

O(n)

## Status

Solved
