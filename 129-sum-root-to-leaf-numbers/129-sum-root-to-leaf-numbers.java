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
    int sum=0;
     public void findSum(TreeNode root,int currSum){
        if (root==null) return;
        currSum=currSum*10+root.val;
        if(root.left==null && root.right==null)
        {  
            sum+=currSum;
            return;
        }
        findSum(root.left,currSum);
        findSum(root.right,currSum);
    }
    public int sumNumbers(TreeNode root) {
         findSum(root,0);
        return sum;
    }
}