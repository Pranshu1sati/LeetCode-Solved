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
    public void helper(TreeNode root , String s ,List<String> ls ){
        if (root.left == null && root.right == null){
             ls.add(s + root.val);
             return;
             }
    if (root.left != null) helper(root.left, s + root.val + "->", ls);
    if (root.right != null)helper(root.right, s + root.val + "->", ls);
    }
    public List<String> binaryTreePaths(TreeNode root) {
       
       List<String> ls = new ArrayList<String>();
      if(root!=null) helper(root, "", ls);
      return ls;
         
    }
}