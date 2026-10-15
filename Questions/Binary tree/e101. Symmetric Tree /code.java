class Solution {
    public boolean isMirror(TreeNode leftn,TreeNode rightn){
        if(leftn==null&&rightn==null){
            return true;
        }
        if((leftn==null)||(rightn==null)){
            return false;
        }
        if(leftn.val!=rightn.val){
            return false;
        }
        return isMirror(leftn.left,rightn.right)&&isMirror(leftn.right,rightn.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
       return isMirror(root.left,root.right);
    }
}
