class Solution {
    int max;
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefts=Math.max(0,find(root.left));
        int rights=Math.max(0,find(root.right));
        max=Math.max(max,(root.val+lefts+rights));
        return root.val + Math.max(lefts, rights);
    }
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        find(root);
        return max;
    }
}
