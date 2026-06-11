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
        ListNode s = head;
        ListNode f = head;
        ListNode temp = head;
        for(int i = 0; i < n; i++){
            f = f.next;
        }
        if(f == null) return head.next;
        while(f!= null){
            temp = s;
            s= s.next;
            f = f.next;
        }
        temp.next = s.next;
        return head;
    }
}