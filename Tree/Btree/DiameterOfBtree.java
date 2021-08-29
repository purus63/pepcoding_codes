package Tree.Btree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DiameterOfBtree {
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

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    //Another Solution Approach using global variable
    /*  public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh)+1;
        if(th>=ht1)
        {
            ht2=ht1;
            ht1=th;
        }
        else if(th>=ht2)
        {
            ht2=th;
        }
        return th;
    }
    static int ht1=0;
    static int ht2=0;

    public static int diameter1(Node node) {
        // write your code here

        int lht=height(node.left);
        int rht=height(node.right);
        int th = Math.max(lht, rht)+1;
        if(th>=ht1)
        {
            ht2=ht1;
            ht1=th;
        }
        else if(th>=ht2)
        {
            ht2=th;
        }
        return ht1+ht2+1;
    }*/
    public static int diameter1(Node node) {
        // write your code here
        if(node==null)
            return 0;
        int max=0;
        int max1=diameter1(node.left);
        int max2=diameter1(node.right);
        if(max1>max2)
            max=max1;
        else
            max=max2;
        int lht=height(node.left);
        int rht=height(node.right);
        return Math.max(max,lht+rht+2);
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

        int diameter = 0;
        diameter = diameter1(root);
        System.out.println(diameter);
    }

}
