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
    
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }
    
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
}

// This code uses a recursive in-order traversal of the BST and maintains the previous node's value in a variable named prev. During the traversal, we calculate the absolute difference between the current node's value and the previous node's value, and update the minDiff variable if this difference is smaller than the current minDiff. Finally, we return the minDiff value at the end of the traversal.
// class Solution {
//     public void bstTraversal(ArrayList<Integer> al , TreeNode root ){
//         if(root==null) return;
//         bstTraversal(al,root.left);
//         al.add(root.val);
//         bstTraversal(al,root.right);
        
//     }
//     public int getMinimumDifference(TreeNode root) {
//         ArrayList<Integer> al = new ArrayList<>();
//         bstTraversal(al,root);
//         return(Math.abs(al.get(0)-al.get(1)));
//     }
// }