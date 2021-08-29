package LinkList;

class linkedlist{

    private class Node{
        private int data;
        private Node next;

        public Node(){
            this.data=0;
            this.next =null;
        }
        public Node(int data){
            this.data=data;
            this.next =null;
        }

        public Node(int data,Node next){
            this.data=0;
            this.next =next;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public linkedlist(){
        this.head=this.tail=null;
        this.size=0;
    }

    public void addFirst(int val){
        Node temp =new Node(val);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        this.size++;
    }

    public void addLast(int val){
        Node temp =new Node(val);
        if(tail==null)
        {
            tail=temp;
            head=temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        this.size++;
    }


    public int size(){
        return this.size;
    }

    public void display(){
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int getFirst(){
        if(size==0)
        {return -1;}
        else
            return head.data;
    }
    public int getLast(){
        if(size==0)
        {return -1;}
        else
            return tail.data;
    }

    public void addAt(int val,int idx){

        if(idx<0 || idx>this.size)
        {
            System.out.println("Invalid Index");
        }
        else if(idx==0)
        {
            addFirst(val);size++;
        }
        else if(idx == size){
            addLast(val);size++;
        }
        else{
            Node temp =getNthIndex(idx-1);
            Node n1= new Node(val);
            n1.next=temp.next;
            temp.next=n1;
            size++;
        }
    }

    private Node getNthIndex(int i) {
        Node temp=head;
        int pos=0;
        while(pos!=i){
            temp=temp.next;pos++;
        }
        return temp;
    }

    public int getAt(int idx){
        if(idx<0 || idx>=size)
        {
            System.out.println("Invalid Index");
            return -1;
        }
        else
        {
            Node temp =getNthIndex(idx);
            return temp.data;
        }
    }

    public int removeFirst(){
        Node temp=head;
        if(size==0)
        {
            System.out.println("Invalid");
            return -1;
        }
        else if(size==1)
        {
            head=null;
            tail=null;
        }
        else{
        head= head.next;
        }
        size--;
        return temp.data;
    }
    public int removeLast(){
        Node temp=tail;
        if(size==0)
        {
            System.out.println("Invalid");
            return -1;
        }
        else if(size==1)
        {
            head=null;
            tail=null;
        }
        else{
            Node nn=getNthIndex(size-2);
            nn.next=null;
        }
        size--;
        return temp.data;
    }
    public int removeAt(int idx){
        Node temp =head;
        if(idx<0 || idx>=size)
        {
            System.out.println("Invalid index");
            return -1;
        }
        else if(idx==0)
        {
            head=tail=null;
            size--;
            return temp.data;
        }
        else{
            Node n =getNthIndex(idx-1);
            int res = n.next.data;
            n.next=n.next.next;
            size--;
            return res;
        }

    }
}

public class creation {
    public static void demo(){
        linkedlist list = new linkedlist();
        list.addLast(10);
        list.addLast(20);
        list.display();
        list.addLast(30);
        list.addFirst(9);
        list.display();
        list.addFirst(7);
        list.addLast(40);
        list.display();
        System.out.println(list.size());

        System.out.println(list.removeFirst());
        list.addAt(40, 2);
        list.display();

        System.out.println(list.removeAt(3));
        System.out.println(list.getAt(3));
        list.addLast(90);
        list.addLast(85);
        list.addLast(40);
        list.addLast(70);
        list.addLast(60);

        list.display();

        System.out.println(list.size());
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeAt(3);
        list.display();

        list.removeLast();
        list.removeLast();
        list.display();
    }

    public static void main(String[] args) {
        demo();
    }
}
