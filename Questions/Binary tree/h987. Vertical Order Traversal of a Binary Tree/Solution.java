class Solution {
    class Pair{
        TreeNode node;
        int row,col;
        Pair(TreeNode node,int row,int col){
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
         List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            TreeNode node=p.node;
            int row=p.row;
            int col=p.col;

            map.computeIfAbsent(col,k->new TreeMap<>())
            .computeIfAbsent(row,k->new PriorityQueue<>())
            .add(node.val);
            if(node.left!=null){
                q.add(new Pair(node.left,row+1,col-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,row+1,col+1));
            }
        }
 for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> list = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
