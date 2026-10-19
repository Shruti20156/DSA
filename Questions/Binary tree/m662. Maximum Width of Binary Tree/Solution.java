class Solution {
    class Pair{
        TreeNode node;
        int ind;
        Pair(TreeNode node,int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int nmin=q.peek().ind;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int currid=q.peek().ind;
                 TreeNode node=q.peek().node;
                 q.poll();
                 if(i==0) first=currid;
                 if(i==size-1) last=currid;
                 if(node.left!=null){
                    q.add(new Pair(node.left,currid*2+1));
                 }
                  if(node.right!=null){
                    q.add(new Pair(node.right,currid*2+2));
                 }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}
