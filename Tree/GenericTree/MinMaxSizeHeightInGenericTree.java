/*
package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class MinMaxSizeHeightInGenericTree {
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

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        // write your code here
        int height=0;
        for(Node n: node.children)
        {
            height= Math.max(height,1+height(n));
        }
        return height;
    }
    private static ArrayList<Integer> minmaxsizeheight(Node root) {
        int min=root.data;
        int max=root.data;
        int size=0;
        int height=0;

        Queue<Node> q= new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int len= q.size();
            Node nn = q.remove();
            size++;
            height++;
            min=Math.min(min,root.data);
            max=Math.max(max,root.data);
            for(int i=0;i<len;i++)
            {
                q.add(nn.children.get(i));
            }


        }
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
        ArrayList<Integer> al = minmaxsizeheight(root);
        System.out.println(al);
        // display(root);
    }


}
*/
