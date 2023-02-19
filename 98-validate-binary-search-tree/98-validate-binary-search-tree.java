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
    public boolean ishelper(TreeNode root , TreeNode n1, TreeNode n2){
        if(root==null)return true;
         if(n1!=null && root.val<=n1.val)
                return false;
            if(n2!=null && root.val>=n2.val)
                return false;

        if(ishelper(root.left,n1,root) && ishelper(root.right,root,n2))
            return true;
        else 
            return false;

    }
    public boolean isValidBST(TreeNode root) {
        return ishelper(root,null,null);
    }
}