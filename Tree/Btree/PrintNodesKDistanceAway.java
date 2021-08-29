package Tree.Btree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class PrintNodesKDistanceAway {
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

    public static ArrayList<Node> nodetoroot(Node root,int data){

        if(root==null)
            return new ArrayList<>();

        if(root.data== data)
        {
            ArrayList<Node> bres= new ArrayList<>();
            bres.add(root);
            return bres;
        }
        ArrayList<Node> left= nodetoroot(root.left,data);
        if(left.size()>0)
        {
            left.add(root);
            return left;
        }

        ArrayList<Node> right= nodetoroot(root.right,data);
        if(right.size()>0)
        {
            right.add(root);
            return right;
        }
        return new ArrayList<>();

    }

    public static void PrintKDown(Node node,int k){

        if(node==null || node == blockage){return;}

        if(k==0)
        {
            System.out.println(node.data);
            return;
        }
        PrintKDown(node.left,k-1);
        PrintKDown(node.right,k-1);
    }


    static Node blockage =null;
    public static void printKNodesFar(Node node, int data, int k) {
        // write your code here
        ArrayList<Node> al =nodetoroot(node,data);

        for(int i=0;i<al.size();i++)
        {
            Node nn =al.get(i);
            PrintKDown(nn,k);
            k--;
            blockage=nn;
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

        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        printKNodesFar(root, data, k);
    }

}
