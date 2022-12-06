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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode newhead = new ListNode(head.val);
        ListNode fast=head;
        ListNode slow = head.next;
        ListNode ns = newhead;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            ListNode nhh = new ListNode(fast.val);
            newhead.next=nhh;
            newhead=newhead.next;
        }
        newhead.next=slow;
        newhead=newhead.next;
        while(slow!=null && slow.next!=null && slow.next.next !=null){
              slow =slow.next.next;
              newhead.next=slow;
              newhead=newhead.next;
         }
        newhead.next = null;
         return ns;
    }

    //  public ListNode oddEvenList(ListNode head) {
    //     if(head == null || head.next == null || head.next.next == null){
    //         return head;
    //     }
    //     ListNode end = head;
    //     ListNode cur = head;
    //     while(end.next!=null){
    //         end = end.next;
    //     }
    //     ListNode stop = end;

    //     while(cur != stop && cur.next != stop){
    //         ListNode e = cur.next;
    //         cur.next = cur.next.next;
    //         cur = cur.next;
    //         end.next = e;
    //         end = end.next;
    //     }
    //     System.out.println(stop.val);
    //     if(cur.next == stop){
    //        end.next = stop;
    //        end = end.next;
    //        cur.next = cur.next.next;
    //     }
    //     end.next = null;
    //     return head;
    // }


}