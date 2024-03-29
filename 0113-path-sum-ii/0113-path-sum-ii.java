/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
https://assets.leetcode.com/uploads/2021/01/18/pathsumii1.jpg *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(root, target, result, new ArrayList<Integer>());
        return result;
    }

    private void pathSum(TreeNode root, int sum, List<List<Integer>> result, List<Integer> curr){
        if(root == null) return;
        curr.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            result.add(new ArrayList<>(curr));
        }
        pathSum(root.left, sum - root.val, result, curr);
        pathSum(root.right, sum - root.val, result, curr);
        curr.remove(curr.size() - 1);
    }
}