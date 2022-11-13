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
public class Solution {
     public ListNode findMid(ListNode head){
    
     ListNode slow = head, fast = head; 
    
    while( fast != null && fast.next != null ){
        
        fast = fast.next.next; 
        slow = slow.next; 
    }
    return slow;  
}




public ListNode reverse(ListNode head){
    
     ListNode prev = null; 
    ListNode curr = head; 
    
    while( curr != null ){
        ListNode next = curr.next; 
        curr.next = prev; 
        prev = curr; 
        curr = next;
    }
        return prev;
    
}






public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null){
        return true;
    }
    
    
    //we can simply use an arrayList;But that will use extra space
    
    
    //we can reverse half of the linked list
    //then we compare the first half with the second half
    
    ListNode mid  = findMid(head);
    
    ListNode secondHalf =reverse(mid);
    
    
    
    
  
    
    
    
    
    
    
    
    while(secondHalf!=null && head!=null){
        
        if(secondHalf.val != head.val){
            
            return false;
        }
        
        secondHalf = secondHalf.next;
        head = head.next;
        
    }
    
    
    return true;

    
    
}

}


