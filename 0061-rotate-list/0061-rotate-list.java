class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 ) return head;
        ListNode s = head;
        ListNode f = head;
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        k%=length;
        if(k == 0) return head;
        
        for(int i = 1; i <= k; i++){
            f = f.next;
        }
        while(f.next!= null){
            s = s.next;
            f = f.next;
        }
        ListNode a = s.next;
        s.next = null;
        f.next = head;
        return a; 
    }
    
}