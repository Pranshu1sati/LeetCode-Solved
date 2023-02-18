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
     Integer prev;
    int minDiff = Integer.MAX_VALUE;
    
    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prev));
        }
        prev = root.val;
        inOrderTraversal(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }
}