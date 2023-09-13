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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null){
            
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size+=1;
            curr=curr.next;
        }
        if(n==size){
            return head.next;
        }
        ListNode prev=head;
        for(int i=1;i<size-n;i++){
            prev=prev.next;
            
        }
        prev.next=prev.next.next;
        return head;
    }
}