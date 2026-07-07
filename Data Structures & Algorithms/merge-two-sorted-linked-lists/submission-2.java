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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode soln;
        if (list1.val <= list2.val) {
            soln = list1;
            list1 = list1.next;
        } else {
            soln = list2;
            list2 = list2.next;
        }
        ListNode head = soln;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                soln.next = list1;
                list1 = list1.next;
            } else {
                soln.next = list2;
                list2 = list2.next;
            }
            soln = soln.next;
        }
        while(list1 != null){
            soln.next = list1;
            list1 = list1.next;
            soln = soln.next;
        }
        while(list2 != null){
            soln.next = list2;
            list2 = list2.next;
            soln = soln.next;
        }
        return head;
    }
}