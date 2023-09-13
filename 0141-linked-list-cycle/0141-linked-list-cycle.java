/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if(head==null)
        {
            return false;
        }
        
        ListNode t=head;
        ListNode r=head;
        while( r.next!=null && r.next.next!= null)
        {
            r=r.next.next;
            t=t.next;
            if(t==r){
                return true;
            }
        }
   return false;  
    
    }
}