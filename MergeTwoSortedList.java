
//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode startMergeListNode = new ListNode();
        ListNode temp = startMergeListNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }

        // while (list1 != null && list2 != null) {
        // // ListNode tempNode;
        // if (list1.val <= list2.val) {
        // // tempNode = new ListNode(list1.val, null);
        // list1 = list1.next;
        // } else {
        // tempNode = new ListNode(list2.val, null);
        // list2 = list2.next;
        // }

        // if (startMergeListNode == null) {
        // startMergeListNode = tempNode;
        // } else {
        // ListNode temp = startMergeListNode;
        // while (temp.next != null) {
        // temp = temp.next;
        // }
        // if (temp.next == null) {
        // temp.next = tempNode;
        // }
        // }

        // }

        return startMergeListNode.next;
    }

    public static void main(String[] args) {
        ListNode list1node3 = new ListNode(4, null);
        ListNode list1node2 = new ListNode(2, list1node3);
        ListNode list1node1 = new ListNode(1, list1node2);
        ListNode list1Head = list1node1;

        ListNode list2node3 = new ListNode(4, null);
        ListNode list2node2 = new ListNode(3, list2node3);
        ListNode list2node1 = new ListNode(1, list2node2);
        ListNode list2Head = list2node1;

        // ListNode resMergeList = null;
        ListNode resMergeList = mergeTwoLists(list1Head, list2Head);
        // System.out.println(resMergeList);

        // // resMergeList = mergeTwoLists(list1node3, list2node3);

        while (resMergeList != null) {
            System.out.println(resMergeList.val);
            resMergeList = resMergeList.next;
        }

    }
}