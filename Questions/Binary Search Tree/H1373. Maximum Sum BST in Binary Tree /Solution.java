class Solution {
    int maxSum = 0;

    static class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public Info helper(TreeNode root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info lefts = helper(root.left);
        Info rights = helper(root.right);

        if (lefts.isBST && rights.isBST
                && lefts.max < root.val
                && rights.min > root.val) {

            int sum = lefts.sum + rights.sum + root.val;
            int min = Math.min(root.val, Math.min(lefts.min, rights.min));
            int max = Math.max(root.val, Math.max(lefts.max, rights.max));

            maxSum = Math.max(maxSum, sum);

            return new Info(true, sum, min, max);
        }

        return new Info(false, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
}
```
