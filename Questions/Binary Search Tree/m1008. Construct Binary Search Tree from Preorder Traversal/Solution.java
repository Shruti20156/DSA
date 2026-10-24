class Solution {
    int i=0;
    public TreeNode createBST(int[] preorder,int up) {
        if(i==preorder.length||preorder[i]>up){
            return null;
        }
        TreeNode root=new TreeNode(preorder[i]);
        i++;
        root.left=createBST(preorder,root.val);
        root.right=createBST(preorder,up);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
       return createBST(preorder,Integer.MAX_VALUE);
    }
}
