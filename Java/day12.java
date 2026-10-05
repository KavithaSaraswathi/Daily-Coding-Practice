class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class day12{
    static Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }
    public static void main(String[] args){
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=new Node(5);
        node=reverse(node);
        Node current = node;

        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
    }
}