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
    int dmax =0;
    public int diameterOfBinaryTree(TreeNode root) {
         diameterofBinarytree(root);
        return dmax;
    }
    public int diameterofBinarytree(TreeNode root){
        if(root==null) return 0;
        int lh = diameterofBinarytree(root.left);
        int rh = diameterofBinarytree(root.right);
        dmax = Math.max(lh+ rh,dmax);
        return 1+Math.max(lh,rh);
    }
}