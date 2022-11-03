class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) 
        return null;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<lists.length;i++)
    {
        while(lists[i]!=null)
        {
            list.add(lists[i].val);
            lists[i]=lists[i].next;
        }
    }
   list.sort(Comparator.naturalOrder());
    ListNode head=null,cur=null;
   
    for(int i:list){
        if(head==null){
           ListNode t=new ListNode(i);
            head=t;
            head.next=null;
            cur=head;
        }
        else{
            ListNode t=new ListNode(i);
            cur.next=t;
            cur=cur.next;
        }
    }
	return head;
	}
}
