class Solution {
    public List<Integer> inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return arr;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
         List<Integer> arr1=new ArrayList<>();
         List<Integer> arr2=new ArrayList<>();
         arr1=inorder(root1,arr1);
         arr2=inorder(root2,arr2);
         int i=0;
         int j=0;
         List<Integer> ans=new ArrayList<>();
         while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }else{
                 ans.add(arr2.get(j));
                 j++;
            }
            
        }
        while(i<arr1.size()){
             ans.add(arr1.get(i));
             i++;
        }
        while(j<arr2.size()){
             ans.add(arr2.get(j));
             j++;
        }
        return ans;
    }
}
