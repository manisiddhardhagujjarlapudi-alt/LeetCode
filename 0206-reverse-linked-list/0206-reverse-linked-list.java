class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next== null ) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;

        // ListNode c = head;
        // ListNode f = null;
        // ListNode p = null;
        // while(c != null){
        //     f = c.next;
        //     c.next = p;
        //     p = c;
        //     c = f;
        // }
        // return p;
    }
}