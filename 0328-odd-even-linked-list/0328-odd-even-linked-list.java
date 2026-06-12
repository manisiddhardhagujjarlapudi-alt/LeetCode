class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode i = head;
        while(i != null){
            t1.next = i;
            i = i.next;
            t1 = t1.next;
            t2.next = i;
           if(i != null) i = i.next;
            t2 = t2.next;
        }
        t1.next = even.next; 
        return odd.next;
    }
}