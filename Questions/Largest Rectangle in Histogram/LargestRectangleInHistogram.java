import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int area = 0;

        int nsl[] = new int[n];
        int nsr[] = new int[n];

        Stack<Integer> s = new Stack<>();

        // Next Smaller to Right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        s = new Stack<>();

        // Next Smaller to Left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // Calculate maximum area
        for (int i = 0; i < n; i++) {
            int a = heights[i] * (nsr[i] - nsl[i] - 1);
            area = Math.max(area, a);
        }

        return area;
    }
}
