// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
//     int reversDigits(int num){
// // converting number to string
//         String str = to_String(num); 
//         reverse(str.begin(), str.end());
//         num = stoll(str);
//         return num;
// }
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    // traverse list 1 (inreverse) and l2 multiply prev by 10 in each step and add current val
//    // create new list put val at head = sum%10 till sum/10!=0
//         int prev = 0;
//         int sum1=0;
//         ListNode head = new ListNode();
//         head=l1;
//         ListNode curr=l1.next;
//         while(curr!=null){
//             prev=head*10;
//             sum1+=prev;
//             prev=sum1+curr.val;
//             head=head.next;
//             curr=curr.next;
//         }
//         int l1sum= reverseDigits(sum1);
//         int prev2=0;
//         int sum2=0;
//         ListNode head2 = new ListNode();
//         head=l2;
//         ListNode curr2=l2.next;
//         while(curr2!=null){
//             prev2=head2*10;
//             sum2+=prev2;
//             prev2=sum2+curr.val;
//             head2=head.next;
//             curr2=curr2.next;
//         }
//         int l2sum = reverseDigits(sum2);
//         int realsum=l1sum+l2sum;
//         ListNode H = new ListNode();
//         H.val = realsum%10;
//         realsum=realsum/10;
//         ListNode h=H;
//         while(realsum/10!=0){
//             h.next.val=realsum%10;
//             realsum=realsum/10;
//             h=h.next;
//         }
//         return H;
// }
       public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        // Root node is empty node and following nodes will be attached.
        ListNode root = new ListNode();
        ListNode head = root;

        ListNode list1Head = list1;
        ListNode list2Head = list2;

        int carry = 0;
        while (list1Head != null && list2Head != null) {
            int val1 = list1Head.val;
            int val2 = list2Head.val;
            int sum = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;

            // Add a following node with sum.
            head.next = new ListNode(sum);

            // Move forward each head.
            head = head.next;
            list1Head = list1Head.next;
            list2Head = list2Head.next;
        }

        // Check whether there is any remained node in list1.
        while (list1Head != null) {
            int sum = (list1Head.val + carry) % 10;
            carry = (list1Head.val + carry) / 10;

            // Add a following node with sum.
            head.next = new ListNode(sum);

            // Move forward each head.
            head = head.next;
            list1Head = list1Head.next;
        }

        while (list2Head != null) {
            int sum = (list2Head.val + carry) % 10;
            carry = (list2Head.val + carry) / 10;

            // Add a following node with sum.
            head.next = new ListNode(sum);

            // Move forward each head.
            head = head.next;
            list2Head = list2Head.next;
        }

        // After consuming every node of list1, list2,
        // if there is carry, we should create a new node whose value is carry.
        if (carry > 0) {
            head.next = new ListNode(carry);
        }

        return root.next;
    }
}
