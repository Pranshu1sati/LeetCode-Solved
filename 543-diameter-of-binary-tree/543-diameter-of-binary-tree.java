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
    int ans=0;
    public int diameterreal(TreeNode root){
        if(root==null) return 0;
        int lh = diameterreal(root.left);
        int rh = diameterreal(root.right);
        ans = Math.max(ans,lh+rh);
        return 1+Math.max(lh,rh);
    
    }
    public int diameterOfBinaryTree(TreeNode root) {
         if(root==null){
                return 0;
            }
         diameterreal(root);
        return ans;
    }
}