package LEVEL1.A__REVISION.LinkedList;

public class CopyRandomPointer {

    public static void main(String[] args) {

    }
    /*
    public Node copyRandomList(Node head) {

        if(head==null)
            return null;
        HashMap<Node,Node> hmap= new HashMap<>();

        Node dummynode=new Node(-1);
        dummynode.next=new Node(head.val);

        Node newhead=dummynode.next;
        Node temp=head;
        while(temp.next!=null)
        {
            Node n= new Node(temp.next.val);
            newhead.next=n;
            temp=temp.next;
            newhead=newhead.next;
        }

        temp=head;
        newhead=dummynode.next;

        while(temp!=null)
        {
            hmap.put(temp,newhead);
            temp=temp.next;
            newhead=newhead.next;
        }

        temp=head;
        newhead=dummynode.next;
        while(temp!=null)
        {
            Node n1= hmap.get(temp.random);
            newhead.random=n1;
            temp=temp.next;
            newhead=newhead.next;
        }
        return dummynode.next;
    }*/
}
