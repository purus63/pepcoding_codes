package Tree.GenericTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class NodeWithMaximumSubtreeSumInGenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        // write your code here
        dosum(root);
        System.out.println(node+"@"+maxsum);
    }
    static int maxsum=Integer.MIN_VALUE;
    static int node=-1;
    private static int dosum(Node root) {

        if(root.children.size()==0)
        {
            if(root.data>maxsum)
            {
                maxsum= root.data;
                node=root.data;
            }
            return root.data;
        }

        int sum=0;
        for(Node n:root.children){
            sum+=dosum(n);
        }
        sum+=root.data;
        if(sum>maxsum)
        {
            maxsum=sum;
            node = root.data;
        }
        return sum;
    }

}
