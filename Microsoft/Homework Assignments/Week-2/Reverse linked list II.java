 class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left==right)
            return head;
        boolean isStart = false;
        ListNode prev, before, after, th, tt, temp;
        temp = head;
        prev = before = after = th = tt = null;
        int i = 1;
        while (temp != null) {
            if (i == left) {
                before = prev;
                isStart = true;
            }
            if (isStart) {
                ListNode node = new ListNode(temp.val);
                node.next = th;
                if (tt == null && th == null) {
                    tt = th = node;
                } else {
                    th = node;
                }
            }
            if (i == right) {
                after = temp.next;
                isStart = false;
            }
            i++;
            prev = temp;
            temp = temp.next;
        }
        tt.next = after;
        if (before == null)
            return th;
        before.next = th;
        
        return head;
    }
}
