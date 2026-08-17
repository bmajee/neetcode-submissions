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


 // 1,2,4
 // 1,3,5
 //0->1->1->2

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode nl1 = list1;
        ListNode nl2 = list2;
        ListNode tail = dummy;

        while (nl1 != null && nl2 !=null){
            if(nl1.val <= nl2.val){
                tail.next = nl1;
                nl1 = nl1.next;
            } else {
                tail.next = nl2;
                nl2 = nl2.next;
            }
            tail = tail.next;
            
        }
        if(nl1 != null){
            tail.next = nl1;
        } else {
            tail.next = nl2;
        }
        dummy = dummy.next;
        return dummy;
    }
}