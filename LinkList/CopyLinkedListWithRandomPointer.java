package LinkList;

import java.util.Scanner;

public class CopyLinkedListWithRandomPointer {
    public static class ListNode {
        int val = 0;
        ListNode next = null;
        ListNode random = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode copyRandomList(ListNode head) {

        ListNode temp=head;

        ListNode dummy = new ListNode(-1);
        ListNode t1=dummy;
            //LL creation
        while(temp!=null)
        {
            ListNode nn = new ListNode(temp.val);
            t1.next=nn;
            t1=nn;
            temp=temp.next;
        }

            //zigzag
        ListNode h1= head;
        ListNode h2=dummy.next;

        while(h1!=null && h2!=null)
        {
            ListNode n1= h1.next;
            ListNode n2= h2.next;

            h1.next =h2;
            h2.next=n1;

            h1=n1;
            h2=n2;
        }
        // connecting random ptr
         t1 =head;

        while(t1!=null)
        {
            if(t1.random==null)
                t1.next.random=null;
            else
                t1.next.random=t1.random.next;
            t1=t1.next.next;
        }
        // seggreagte
        t1=head;
        h1=head;
        h2=head.next;
        while(t1.next.next!=null)
        {
            h1.next= h1.next.next;
            h1=h1.next;
            h2.next=h2.next.next;
            h2=h2.next;
            t1=t1.next;
        }
        h1.next=null;
        h2.next=null;

        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ListNode[] arr = new ListNode[n];
        ListNode prev = null;

        for (int i = 0; i < n; i++) {
            arr[i] = new ListNode(0);
            if (prev != null)
                prev.next = arr[i];
            prev = arr[i];
        }

        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            int idx = scn.nextInt();

            arr[i].val = val;
            if(idx != -1) arr[i].random = arr[idx];
        }

        ListNode head = copyRandomList(arr[0]);
        while (head != null) {
            System.out.print("(" + head.val + ", " + (head.random != null ? head.random.val : -1) + ") ");
            head = head.next;
        }
    }
}
