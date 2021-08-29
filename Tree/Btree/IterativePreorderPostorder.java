package Tree.Btree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorderPostorder {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void iterativePrePostInTraversal(Node node) {
        // write your code here
        ArrayList<Integer> pre =new ArrayList<>();
        ArrayList<Integer> ino= new ArrayList<>();
        ArrayList<Integer> post= new ArrayList<>();

        Stack<Pair> st =new Stack<>();
        Pair p = new Pair(node,0);
        st.push(p);
        while(st.size()>0)
        {
            Pair p1= st.peek();
            if(p1.state==0){
                pre.add(p1.node.data);
                p1.state++;
                if(p1.node.left!=null)
                {
                    st.push(new Pair(p1.node.left,0));
                }
            }
            else if(p1.state==1){
                ino.add(p1.node.data);
                p1.state++;
                if(p1.node.right!=null)
                {
                    st.push(new Pair(p1.node.right,0));
                }
            }
            else if (p1.state==2){
                post.add(p1.node.data);
                st.pop();
            }
        }
        for(int a:pre)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a:ino)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a:post)
        {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        iterativePrePostInTraversal(root);
    }

}
