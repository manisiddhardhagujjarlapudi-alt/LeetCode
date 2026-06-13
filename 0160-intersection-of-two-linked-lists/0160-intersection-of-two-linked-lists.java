public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t = headA;
        ListNode t1 = headB;
        int len = 0;
        int len2 = 0;
        while(t!=null){
            t = t.next;
            len ++;
        }
        while(t1!=null){
            t1 = t1.next;
            len2 ++;
        }
        ListNode temp = headA;
        ListNode temp2 = headB;
        if(len > len2){
            int i = 1;
            while(i<=len-len2){
                temp = temp.next;
                i++;
            }
        }else{
             int i = 1;
            while(i<=len2-len){
                temp2 = temp2.next;
                i++;
            }
        }
        while(temp != temp2){
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    }
}