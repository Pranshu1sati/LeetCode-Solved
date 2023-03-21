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
    public void binaryTreePaths4real(TreeNode root , String s ,List<String> ls ){
        if (root.left == null && root.right == null){
             ls.add(s + root.val);
             return;
             }
    if (root.left != null) binaryTreePaths4real(root.left, s + root.val + "->", ls);
    if (root.right != null) binaryTreePaths4real(root.right, s + root.val + "->", ls);
    }
    public List<String> binaryTreePaths(TreeNode root) {
       
       List<String> ls = new ArrayList<String>();
      if(root!=null) binaryTreePaths4real(root, "", ls);
      return ls;
         
    }
}