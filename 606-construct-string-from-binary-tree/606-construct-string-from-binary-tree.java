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
    static String str = "";
        public static void help(TreeNode root){
        if(root==null) return;
        str+=root.val;
        if(root.left != null || root.right!=null){
            str+='(';
            help(root.left);
            str+=')';
        }
        if(root.right!=null){
            str+='(';
            help(root.right);
            str+=')';
        }
        }
   public String tree2str(TreeNode root) {
        str="";
        help(root);
        return str;
    }
}