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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        int size = 1;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }
        // System.out.println(size);
        int nodeToRemove = size -n+1;
        System.out.println(nodeToRemove);
        ListNode curr = head;
        ListNode prev = null;
        if(nodeToRemove == 1){
            return head.next;
        }
       for(int i=1;i<=nodeToRemove;i++){
        //  ListNode dummy = curr.next;
        
       
         prev = curr;
         curr = curr.next;
        //  System.out.println(curr.val);
        //   System.out.println(prev.val);
         
         if(i == nodeToRemove-1){
            prev.next = curr.next;
         }
       }      

        
        return head;
    }
}
