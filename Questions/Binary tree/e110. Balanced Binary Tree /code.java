//approach 1=O(n^2)
class Solution {
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=find(root.left);
        int rh=find(root.right);
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=find(root.left);
        int rh=find(root.right);
        if(Math.abs(lh-rh)>1){
            return false;
        }
        boolean ls=isBalanced(root.left);
        boolean rs=isBalanced(root.right);
        if(!ls||!rs){
            return false;
        }
        return true;
    }
}
//approach 2  =O(n)
class Solution {
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=helper(root.left);
        if(lh==-1){
            return -1;
        }
        int rh=helper(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=-1;
    }
}
