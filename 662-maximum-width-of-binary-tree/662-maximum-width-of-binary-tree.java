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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode, Integer > mp= new HashMap<>();
        q.add(root);
        mp.put(root,0);
        int currWidth = 0;
        int MaxWidth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int start = 0,end = 0; 
                for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(i == 0) start = mp.get(node);
                if(i == size - 1) end = mp.get(node);
                if(node.left != null){
                    mp.put(node.left, mp.get(node) * 2+1);
                    q.offer(node.left);
                }
                if(node.right != null){
                    mp.put(node.right, mp.get(node) * 2 + 2);
                    q.offer(node.right);
                }
            }
            currWidth =end - start+1;
            MaxWidth = Math.max(currWidth, MaxWidth);
        }
        return MaxWidth;
    }
}