class Solution{
     public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int n=getlength(head);
        k=k%n;
        ListNode tail=null;
        ListNode curr=head;
        while(curr!=null){
            tail=curr;
            curr=curr.next;
        }
        tail.next=head;
        tail=null;
        curr=head;
        for(int i=0;i<n-k;i++){
            tail=curr;
            curr=curr.next;
        }
        tail.next=null;
        return curr;
    }
    public int getlength(ListNode node){
        ListNode temp=node;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n+=1;
        }
        return n;
    }
}
