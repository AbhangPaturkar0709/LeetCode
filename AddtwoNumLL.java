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
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode tmp = l1;
        ListNode res = null;
        while(tmp != null){
            s1.push(tmp.val);
            tmp = tmp.next;
        }
        tmp = l2;
        while(tmp != null){
            s2.push(tmp.val);
            tmp = tmp.next;
        }

        int carry = 0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int digit1 = s1.pop();
            int digit2 = s2.pop();
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode n = new ListNode(digit);
            n.next = res;
            res = n;
        }

        while(!s1.isEmpty()){
            int digit1 = s1.pop();
            // int digit2 = s2.pop();
            int sum = digit1 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode n = new ListNode(digit);
            n.next = res;
            res = n;
        }

        while(!s2.isEmpty()){
            // int digit1 = s1.pop();
            int digit2 = s2.pop();
            int sum = digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode n = new ListNode(digit);
            n.next = res;
            res = n;
        }

        if(carry == 1){
            ListNode n = new ListNode(carry);
            n.next = res;
            res = n;
        }

        return res;
    }
}