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
    public int gcd(int num1, int num2){
        while(num2 != 0){
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        return num1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;

        ListNode curr = head;
        ListNode front = head.next;

        while(front != null){
            int gcdValue = gcd(curr.val, front.val);
            ListNode newNode = new ListNode(gcdValue);

            newNode.next = front;
            curr.next = newNode;

            curr = front;
            front = front.next;
        }
        return head;
    }
}