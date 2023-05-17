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
//(n-1-i)th  node, if 0 <= i <= (n / 2) - 1.
class Solution {
    public int pairSum(ListNode head) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int i=0;
        ListNode curr= head;
        while(curr!=null){
            map.put(i++,curr.val);
                curr = curr.next;
        }
        int n = map.size();
        int sum = Integer.MIN_VALUE;
         for (int key : map.keySet()) {
            if (key >= 0 && key <= (n / 2) - 1) {
                int twinSum = map.get(key) + map.get(n - 1 - key);
                sum = Math.max(sum, twinSum);
            }
        }
        
        return sum;
    }
}