class Solution {
   public ListNode swapPairs(ListNode head) {
    if(head == null  || head.next == null) return head;
    ListNode curr = head.next.next;
    ListNode prev = head;
    head.next.next = head;
    head = head.next;
    while(curr != null && curr.next != null){
        prev.next  = curr.next;
        prev = curr;
        ListNode temp = curr.next.next;
        curr.next.next = curr;
        curr = temp;
    }
    prev.next = curr;
    return head;
    }
}
