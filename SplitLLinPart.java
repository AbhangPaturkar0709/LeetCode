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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int splitSize = size / k;
        int remainingPart = size % k;

        curr = head;

        for(int i = 0; i < k; i++){
            ListNode headNewPart = null;
            ListNode tail = null;
            int currSize = splitSize;
            if(remainingPart > 0){
                currSize++;
                remainingPart--;
            }
            for(int j = 0; j < currSize; j++){
                ListNode newNode = new ListNode(curr.val);
                if(headNewPart == null){
                    headNewPart = newNode;
                }else{
                    tail.next = newNode;
                }
                tail = newNode;
                curr = curr.next;
            }
            ans[i] = headNewPart;
        }
        return ans;
    }
}