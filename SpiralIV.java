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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        for(int[] a : ans){
            Arrays.fill(a, -1);
        }

        int top = 0, bottom = m-1;
        int left = 0, right = n-1;

        while(head != null){
            for(int i = left; i <= right && head!=null; i++){
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;
            for(int i = top; i <= bottom && head!=null; i++){
                ans[i][right] = head.val;
                head = head.next;
            }
            right--;
            for(int i = right; i >= left && head!=null; i--){
                ans[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;
            for(int i = bottom; i >= top && head!=null; i--){
                ans[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return ans;
    }
}