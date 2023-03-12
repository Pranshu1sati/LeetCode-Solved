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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode node : lists){
            ListNode cu= node;
            while(cu!=null)
            {
                minHeap.add(cu.val);
                cu = cu.next;
            }
        }
        ListNode d = new ListNode(0);
        ListNode current = d;
        while(!minHeap.isEmpty()){
            current.next=new ListNode(minHeap.remove());
            current = current.next;
        }
        return d.next;
    }
}