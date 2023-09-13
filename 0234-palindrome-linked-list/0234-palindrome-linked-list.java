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
     public ListNode findMid(ListNode head){
    
    ListNode t = head;
    ListNode r =head;
    
    
    while(r.next!=null && r.next.next != null){
        r=r.next.next;
        t=t.next;
    }
    return t; 
}




public ListNode reverse(ListNode head){
    
    ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    
}
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
        return true;
    }
    ListNode mid  = findMid(head);
    ListNode secondHalf = mid.next;
    secondHalf = reverse(secondHalf);
    while(secondHalf != null && mid !=null ){
        if(secondHalf.val != head.val){
            
            return false;
        }
        
        secondHalf = secondHalf.next;
        head = head.next;
    }
        return true;
    }
}