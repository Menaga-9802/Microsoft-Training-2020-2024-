class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node top = new Node(0);
        Node copy = new Node(0);
        top.next = head;
        
        while (head != null){
            copy.next = new Node(head.val);
            copy = copy.next;
            map.put(head, copy);
            head = head.next;
        }
        
        head = top.next;
        while (head != null){
            Node c = map.get(head);
            c.random = map.get(head.random);
            head = head.next;
        }
        
        return map.get(top.next);
    }
}
