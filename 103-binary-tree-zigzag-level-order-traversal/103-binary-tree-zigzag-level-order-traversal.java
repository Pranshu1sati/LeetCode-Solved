/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return l;
        q.add(root);
        int level = 0 ;
        while(!q.isEmpty()){
            List<Integer> l2 = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0 ; i<size; i++){
                TreeNode curr = q.remove();
                l2.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(level%2!=0){
                Collections.reverse(l2);
            }
            l.add(l2);
            level++;
        }
        return l;
    }
}