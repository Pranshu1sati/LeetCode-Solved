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
//     public isSubtee(TreeNode root1, TreeNode root2){
//         if(root1 == null && root2 == null) {

//             return true ;

//         }
//         else if(root1=null||root2==null||root1!=root2)return false;
//         if(!isIdentical(root1.left, root2.left)){

//             return false ;

//         }
//          if(!isIdentical(root1.right, root2.right)) {

//             return false ;

//         }
//         return true;
//     }
     private String solve(TreeNode root,List<TreeNode> ans,HashMap<String,Integer> map){
        if(root==null) return "";
        String s=""+root.val+"-"+solve(root.left,ans,map)+"-"+solve(root.right,ans,map);
        map.put(s,map.getOrDefault(s,0)+1);
        if(map.get(s)==2){
            ans.add(root);
        }
        return s;
    }
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
        if(root==null) return new ArrayList<TreeNode>();
        HashMap<String,Integer> map=new HashMap<>();
        solve(root,ans,map);
        return ans;
    }
}