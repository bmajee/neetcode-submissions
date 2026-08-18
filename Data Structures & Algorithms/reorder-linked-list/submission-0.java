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
    public void reorderList(ListNode head) {
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        slow = head;
        fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        
        // System.out.println(slow.val);
        
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
        }



        // while (head != null){
        //     System.out.println(head.val);
        //     head = head.next;
        // }
        //head - 2,4,6
        //prev - 10,8
        ListNode f = head;
        ListNode s = prev;
        while (s != null){
            ListNode temp1 = f.next;
            ListNode temp2 = s.next;
            f.next = s;
            s.next = temp1;
            f = temp1;
            s = temp2;



        }


       
        
    }
}
