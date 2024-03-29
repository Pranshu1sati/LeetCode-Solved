//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
     {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> list = new ArrayList<>();
        findKDN(root,target,k,list);
        Collections.sort(list);
        return list;

    }

    static void findKDNdown(Node node, int k, ArrayList<Integer> list){
        if(node==null || k<0) return;
        if(k==0){
            list.add(node.data);
            return;
        }

        findKDNdown(node.left,k-1,list);
        findKDNdown(node.right,k-1,list);
    }

    static int findKDN(Node node, int target, int k, ArrayList<Integer> list){
        if(node==null) return -1;
        if(node.data==target){
            findKDNdown(node,k,list);
            return 0;
        }

        int ld = findKDN(node.left,target,k,list);
        if(ld!=-1){
            if(ld+1==k) list.add(node.data);
            else findKDNdown(node.right,k-ld-2,list);
            return ld+1;
        }

        int rd = findKDN(node.right,target,k,list);
        if(rd!=-1){
            if(rd+1==k) list.add(node.data);
            else findKDNdown(node.left,k-rd-2,list);
            return rd+1;
        }
        return -1;
    }
};