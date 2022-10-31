class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode ans = new ListNode();
        ans.next=null;
        ListNode head = ans;
        while(l1!=null || l2!=null || carry >0){
            int data1 = l1 == null ? 0 : l1.val;
            int data2 = l2==null ? 0 : l2.val;
            int sum = data1+data2+carry;
            ListNode curr = new ListNode(sum % 10, null);
            ans.next = curr;
            carry = sum>9 ? 1 : 0;
            l1 = l1==null ? null : l1.next;
            l2 = l2==null ? null : l2.next;
            ans = ans.next;
        }
        return head.next;
    }
}
