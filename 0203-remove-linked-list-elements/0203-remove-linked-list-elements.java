class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;
        while(i!= null){
            if(i.val != val){
                temp.next = i;
                i = i.next;
                temp = temp.next;
            }else{
                i = i.next;
            }
        }
        temp.next = i;
        return dummy.next;
    }
}