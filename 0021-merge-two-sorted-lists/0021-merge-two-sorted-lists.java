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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n = new ListNode();
        ListNode tn= n;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tn.next=list1;
                list1=list1.next;
            }
            else{
                tn.next=list2;
                list2=list2.next;
            }
            tn=tn.next;
        }
        while(list1!=null){
            tn.next=list1;
            list1=list1.next;
            tn=tn.next;
        }
        while(list2!=null){
            tn.next=list2;
            list2=list2.next;
            tn=tn.next;
        }
        return n.next;
    }
}