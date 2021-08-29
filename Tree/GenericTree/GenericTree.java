package Tree.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {

    public static class Node{
        int data;
        ArrayList<Node> children;

        public Node() {
            this.data = 0;
            this.children = new ArrayList<>();
        }
        public Node(int val) {
            this.data = val;
            this.children = new ArrayList<>();
        }
    }
    public static Node construct(Integer[] arr){
        Node root=null;
        Stack<Node> st = new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==null)
            {st.pop();continue;}
            Node nn =new Node(arr[i]);
            if(root==null)
            {
                root=nn;
                st.push(nn);
            }
            else{
                st.peek().children.add(nn);
                st.push(nn);
            }
        }
        return root;
    }

    public static void display(Node root){

        System.out.print("["+root.data+"] ");

        for(Node n: root.children)
        {
            System.out.print(n.data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++)
        {
            Node temp = root.children.get(i);
            display(temp);
        }
    }

    public static void main(String[] args) {
        Integer[] data = {10, 20, 50, null, 60, null, null, 30, 70, null, 80, 110, null, 120, null, null, 90, null, null, 40, 100, null, null, null};
        Node root=construct(data);
        display(root);
    }
}
