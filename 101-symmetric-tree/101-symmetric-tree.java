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
    public boolean isIdentical(TreeNode root, TreeNode sroot){
        if(root==null && sroot==null) return true;
        if(root==null || sroot==null || root.val != sroot.val) return false;
        if(!isIdentical(root.right,sroot.left)) return false;
        if(!isIdentical(root.left,sroot.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return(isIdentical(root.left,root.right));
    }
}