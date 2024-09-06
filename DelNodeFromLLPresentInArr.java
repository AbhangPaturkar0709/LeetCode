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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for(int num : nums){
            if(max < num){
                max = num;
            }
        }
        boolean[] b = new boolean[max+1];
        for(int num : nums){
            b[num] = true;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            if(curr.val <= max && b[curr.val]){
                if(prev == null){
                    curr = head = curr.next;
                }else{
                    curr = curr.next;
                    prev.next = curr;
                }
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}