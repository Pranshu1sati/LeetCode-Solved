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
    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot == null) return true;
        else if(root==null || subRoot == null || subRoot.val!=root.val) return false;
        if(!isIdentical(root.left,subRoot.left)) return false;
        if(!isIdentical(root.right,subRoot.right)) return false;
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //Main tree should always be bigger than sub tree
        if(root==null)return false;
        //When you find a node that might be the start of the subtree check if the 
       // trees are identical from that point on
        if(root.val==subRoot.val)
        {
            if(isIdentical(root,subRoot))
            return true ;
        }
        //Else just check if the subtree start from the left node of the current 
       //  node or the right node of the current node
              
//         boolean subtreeinLeft = isSubtree(root.left,subRoot);
//         boolean subtreeinRight = isSubtree(root.right,subRoot);   
//         return (subtreeinLeft||subtreeinRight);
              
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        
    }
}