class Solution {
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode f = null;
        ListNode p = null;
        while(c != null){
            f = c.next;
            c.next = p;
            p  = c;
            c = f;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode head2 = s.next;
        s.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j!= null){
            if(i.val != j.val) return false;
            i= i.next;
            j = j.next;
        }
        return true;
    }
}