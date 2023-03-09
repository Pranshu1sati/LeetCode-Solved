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
    public ListNode detectCycle(ListNode head) {
         ListNode r=head;
        ListNode t=head;
        ListNode start;
        ListNode meet;
        while(r!=null && r.next!=null)
        {
          r=r.next.next;
             t=t.next;
            if(r==t)
            { 
                start = head;
                meet = t;
               while(start!=meet)
               {
               start=start.next;
               meet=meet.next;
               }
              return meet;
            }
            
        }
        return null;
    }
}