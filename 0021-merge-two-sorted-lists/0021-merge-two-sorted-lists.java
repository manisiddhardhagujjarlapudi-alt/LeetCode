class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        ListNode i = list1;
        ListNode j = list2;
        if(i == null) return j;
        if(j == null) return i;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
      while(i != null && j != null){
        if(i.val <= j.val){
            temp.next = i;
            i = i.next;
            temp = temp.next;
        }
        else{
            temp.next = j;
            j = j.next;
            temp = temp.next;
        }
        if(i == null) temp.next = j;
        else temp.next = i;
       
      }
       return dummy.next;
    }
}