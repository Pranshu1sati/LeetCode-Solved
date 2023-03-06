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
     public TreeNode fun(int[] in, int[] post, int s, int e){
        if(s > e)
            return null;
        int index = 0;
        TreeNode node = new TreeNode(post[postIndex]);
        postIndex--;
        for(int i = s; i <= e; i++){
            if(in[i] == node.val){
                index = i;
                break;
            }
        }
        node.right = fun(in, post, index+1, e);
        node.left = fun(in, post, s, index-1);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         fun2(inorder.length-1);
        return fun(inorder, postorder, 0, inorder.length-1);
    }

    int postIndex;

    public void fun2(int i){
        postIndex = i;
    }
}