/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode s =head;
        ListNode f = head.next;
        //finding mid
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
      ListNode second = s.next;
        ListNode temp = null;
        s.next =null;
ListNode prev = null;
        //reversing second half
        while(second!=null){
            temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        // merging two lists
        ListNode first = head;
        second = prev;
        while( second != null){
            ListNode temp1= first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
        
    }
}