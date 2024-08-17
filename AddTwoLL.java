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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, tail = res;

        int sum = 0, carry = 0;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode nn = new ListNode(digit);
            if(res == null && tail == null){
                res = nn;
                tail = nn;
            }else{
                tail.next = nn;
                tail = tail.next;
            }
            // tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum = l1.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode nn = new ListNode(digit);
            if(res == null && tail == null){
                res = nn;
                tail = nn;
            }else{
                tail.next = nn;
                tail = tail.next;
            }
            // tail = tail.next;
            l1 = l1.next;
        }

        while(l2 != null){
            sum = l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode nn = new ListNode(digit);
            if(res == null && tail == null){
                res = nn;
                tail = nn;
            }else{
                tail.next = nn;
                tail = tail.next;
            }
            // tail = tail.next;
            l2 = l2.next;
        }

        if(carry == 1){
            ListNode nn = new ListNode(carry);
            tail.next = nn;
            tail = tail.next;
        }
        
        return res;
    }
}