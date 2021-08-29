package Tree.BST;

import com.sun.xml.internal.bind.v2.util.StackRecorder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class XTargetSumPairBST {
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

        Node root = construct(arr);
        // write your code here
        /*method1
        //inorder(root,root,data);
        */
        /*Method2
        ArrayList<Integer> al= new ArrayList<>();
        inorder2(root,al);
        printsumpair(al, data);*/

        

    }
        /*Method2
    private static void inorder2(Node root, ArrayList<Integer> al) {
        if(root==null)
            return;
        inorder2(root.left,al);
        al.add(root.data);
        inorder2(root.right,al);
    }

    public static void printsumpair(ArrayList<Integer> al,int target){
        int left=0;
        int right=al.size()-1;

        while(left<right)
        {
            if(al.get(left)+al.get(right)>target)
            {
                right--;
            }
            else if(al.get(left)+al.get(right)<target)
            {
                left++;
            }
            else
            {
                System.out.println(al.get(left)+" "+al.get(right));
                left++;
                right--;
            }
        }
    }*/

    /*method1
    private static void inorder(Node node,Node root,int target) {
        if(node==null)
            return;
        inorder(node.left,root,target);
            if(node.data<target-node.data && find(root,target- node.data)) {
                System.out.print(node.data + " " + (target - node.data));
            }
        inorder(node.right,root,target);
    }


    static boolean find(Node root,int data)
    {
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        else if(root.data>data)
            return find(root.left,data);
        else if(root.data<data)
            return  find(root.right,data);
        else
            return false;
    }*/

}
