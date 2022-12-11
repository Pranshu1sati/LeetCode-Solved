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
        int curr_sum = 0;
    int max_sum = 0;
    int neg_sum = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root==null) return 0;

        
        int left_sum = solve(root.left);
        int right_sum = solve(root.right);

        curr_sum = left_sum + right_sum + root.val;
        if(curr_sum<0) curr_sum = 0;
        max_sum = Math.max(max_sum,curr_sum);
        
        // just in case if we don't find any positive number
        neg_sum = Math.max(neg_sum,root.val);

        return Math.max(0,(Math.max(left_sum + root.val, right_sum + root.val) ) );
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        if(max_sum==0) max_sum = neg_sum;
        return max_sum;
    }
}