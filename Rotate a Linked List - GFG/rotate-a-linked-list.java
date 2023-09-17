//{ Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        // Node curr = head;
        // Node prev  = null;
        // Node next =null;
        // Node othercurr = head;
        // Node otherothercurr = head;
        // int i=k;
        // while(otherothercurr!=null){
        //     otherothercurr =otherothercurr.next;
        // }
        // while(i!=0){
        //     othercurr = othercurr.next;
        //     i--;
        // }
        // // while()
        // while(curr != null && k!=0){
        //     Node temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        //     k--;
        // }
        // // otherothercurr.next = prev;
        // return othercurr;
        // Node 
        int length = 0;
        Node currr = head;
        while (currr != null) {
            length++;
            currr = currr.next;
        }
        
        // Adjust k if it's greater than or equal to the length of the list
        k = k % length;
        
        if (k == 0) {
            return head; // No rotation needed
        }
        if (head == null || k == 0) {
            return head; // No rotation needed
        }
        Node curr = head;
        while(k!=1){
            curr =curr.next;
            // System.out.println(curr.data);
            k--;
        }
        Node ans = curr.next;
        Node n = curr.next;
        // System.out.println(n.data+"here");
        curr.next = null;
        while(n.next!=null){
            n = n.next;
        }
        n.next = head;
        return ans;
    }
}
