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
    public void inOrder(TreeNode root, ArrayList<Integer> al){
        if(root==null)return;
         inOrder(root.left,al);
        System.out.println(root.val);
        al.add(root.val);
        
       inOrder(root.right,al);
    }
    public TreeNode createBst(ArrayList<Integer>al, int l,int r){
        if(l>r)return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left = createBst(al,l,mid-1);
        root.right=createBst(al ,mid+1,r);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder(root,al);
        int l=0,r=al.size()-1;
        TreeNode rt = createBst(al,l,r);
        return rt;
    }
}