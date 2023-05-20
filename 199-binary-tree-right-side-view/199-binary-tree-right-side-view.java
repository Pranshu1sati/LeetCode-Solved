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
    public List<Integer> rightSideView(TreeNode root) {
        //r r l
        List<Integer> al = new ArrayList<>();
        System.out.print(al.size());
        right4real(al , root,  0);
        return al;
    } 
   public void right4real(List<Integer> al , TreeNode root, int size){
       if(root==null) return;
       if(size == al.size()){
           al.add(root.val);
       }
       right4real(al,root.right,size+1);
       right4real(al,root.left,size+1);
   }
}