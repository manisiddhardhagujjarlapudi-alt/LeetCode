class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode s = head;
        ListNode f = head;
        while(f.next!= null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode head1 = s.next;
        s.next = null;
        head = sortList(head);
        head1 = sortList(head1);
        return merge(head,head1);
    }
    public ListNode merge(ListNode head,ListNode head1){
        ListNode i = head;
        ListNode j = head1;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i ;
                i = i.next;
                temp = temp.next;
            }
            else{
                temp.next = j;
                j = j.next;
                temp = temp.next;
            }
        }
        if(i == null) temp.next = j;
        else temp.next = i;
        return dummy.next;
    }
}