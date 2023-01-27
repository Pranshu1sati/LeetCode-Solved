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
    public List<List<Integer>> levelOrder(TreeNode node) {
         List<List<Integer>> al = new ArrayList<>();

    List<Integer> al1= new ArrayList<>();
 if(node==null){
            return al;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        //When Ever We Reach Null WE WILL KNOW ITS THE END OF THE CURRENT LINE SO WE CREATE A NEW EMPTY LIST FOR THE NEXT LINE
        
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(!(currNode==null))
            al1.add(currNode.val);
            else{
                al.add(al1);
                al1=new ArrayList<>(); 
                //IF ITS EMPTY IT MEANS THERES NOTHING MORE TO ADD TO THE QUEUE WE NEED TO BREAK OUT OF THE WHILE LOOP
                if(q.isEmpty()) break;
                //ALL THE LEAF AT THAT lEVEL ARE IN THE QUEUE NOW SIGNAL THE NEXT LINE
                else{
                    q.add(null);
                }
            }
            if(!al1.isEmpty()){
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
        
        return al;

    }
}