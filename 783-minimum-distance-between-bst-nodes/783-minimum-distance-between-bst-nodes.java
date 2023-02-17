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
    public void dfs(TreeNode root, List<Integer> l){
    if(root==null) return;
    dfs(root.left,l);
    l.add(root.val);
    dfs(root.right,l);
}
    public int minDiffInBST(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        dfs(root,l);
        int mindiff= Integer.MAX_VALUE;
        for(int i = 0 ; i<l.size()-1;i++){
            int diff = Math.abs(l.get(i) - l.get(i+1));
            mindiff = Math.min(mindiff,diff);
        }
        return mindiff;
    }
}