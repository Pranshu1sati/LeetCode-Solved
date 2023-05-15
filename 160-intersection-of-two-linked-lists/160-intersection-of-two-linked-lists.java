/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 =0;
        int l2 = 0;
        ListNode heada = headA;
        ListNode headb = headB;
        while(heada.next!=null){
            heada= heada.next;
            l1++;
        }
        // ListNode heada = headA;
        while(headb.next!=null){
            headb= headb.next;
            l2++;
        }
        int leave = Math.abs(l1-l2);
        if(l1>l2){
            while(leave-- >0){
                headA = headA.next;
            }
        }else{
            while(leave-- >0){
                headB = headB.next;
            }
        }
        while(headA != headB){
            headA= headA.next;
            headB = headB.next;
            if(headA==null || headB == null) return null;
        }
        return headA;
    }
}