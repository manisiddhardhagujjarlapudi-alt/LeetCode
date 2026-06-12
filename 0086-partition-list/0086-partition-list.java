class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode dummy1 = new ListNode(-1);
        ListNode t = dummy;
        ListNode t1 = dummy1;
        ListNode i = head;
        while( i != null){
            if(i.val < x){
                t.next = i;
                i = i.next;
                t = t.next;
            }else{
                t1.next = i;
                i = i.next;
                t1 = t1.next;
            }
        }
        t.next = dummy1.next;
        t1.next = null;
        return dummy.next;
    }
}