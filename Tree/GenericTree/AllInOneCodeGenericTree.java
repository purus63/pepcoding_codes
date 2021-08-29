package Tree.GenericTree;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AllInOneCodeGenericTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
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

    private static void traversals(Node root) {

        if(root==null)
            return;
        System.out.println("Node Pre "+root.data);
        for(int i=0;i<root.children.size();i++)
        {
           System.out.println("Edge Pre "+root.data+"--"+root.children.get(i).data);
            traversals(root.children.get(i));
            System.out.println("Edge Post "+root.data+"--"+root.children.get(i).data);
        }
        System.out.println("Node Post "+root.data);
    }

    public static void levelOrderLinewiseZZ(Node node){
        // write your code here
        Stack<Node> st1= new Stack<>();
        Stack<Node> st2= new Stack<>();

        int cnt=0;
        st1.push(node);

        while(st1.size()>0)
        {
            int n= st1.size();
            if(cnt%2==0){
                while(n>0) {
                    Node nn=st1.pop();
                    System.out.print(nn.data+" ");
                    for (int i = 0; i < nn.children.size(); i++) {
                        st2.push(nn.children.get(i));
                    }
                    n--;
                }
            }
            else{
                while(n>0){
                    Node nn=st1.pop();
                    System.out.print(nn.data+" ");
                    for(int i=nn.children.size()-1;i>=0;i--)
                    {
                        st2.push(nn.children.get(i));
                    }
                    n--;
                }
            }
            System.out.println();
            cnt++;
            Stack<Node> temp=st1;
            st1=st2;
            st2=temp;
        }


    }

    public static void mirror(Node node){
        // write your code here
        Queue<Node> q= new ArrayDeque<>();
        q.add(node);
        while(q.size()>0) {

            int qlen=q.size();
            while(qlen>0) {
                Node nn=q.remove();
                int n =nn.children.size();
                for (int i = 0; i < n; i++) {
                    q.add(nn.children.get(i));
                }

                for (int i = 0; i < n / 2; i++) {
                    Node temp = nn.children.get(i);
                    nn.children.set(i, nn.children.get(n - 1 - i));
                    nn.children.set(n - 1 - i, temp);
                }
                qlen--;
            }
        }

    }

    public static void removeLeaves(Node node) {

        for(int i=node.children.size()-1;i>=0;i--)
        {
            Node nn= node.children.get(i);
            if(nn.children.size()==0)
            {
                node.children.remove(nn);
                continue;
            }
            removeLeaves(nn);
        }

    }

    public static boolean find(Node node, int data) {
        // write your code here
        boolean flag=false;
        if(node==null)
            return flag;
        if(node.data==data)
            return true;
        for(Node n: node.children)
        {
            flag= flag || find(n,data);
        }
        return flag;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        // write your code here
        if(node==null)
            return new ArrayList<>();
        if(node.data==data)
        {
            ArrayList<Integer> bres =new ArrayList<>();
            bres.add(data);
            return bres;
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(Node a:node.children)
        {
            ans=nodeToRootPath(a,data);
            if(ans.size()>0)
                break;
        }
        if(ans.size()>0)
            ans.add(node.data);
        return ans;
    }

    public static int lca(Node node, int d1, int d2) {
        // write your code here
        ArrayList<Integer> al1=nodeToRootPath(node,d1);
        ArrayList<Integer> al2=nodeToRootPath(node,d2);


        int l1=al1.size()-1;
        int l2=al2.size()-1;

        while(l1>=0 && l2>=0){
            if(al1.get(l1)==al2.get(l2))
            {
                l1--;
                l2--;
                continue;
            }
            else
                break;
        }
        if(l1==al1.size()-1)
            return -1;
        return al1.get(l1+1);
    }

    public static int distanceBetweenNodes(Node node, int d1, int d2){
        // write your code here
        ArrayList<Integer> al1= nodeToRootPath(node,d1);
        ArrayList<Integer> al2=nodeToRootPath(node,d2);

        if(al1.size()==0 || al2.size()==0)
            return -1;
        int l1=al1.size()-1;
        int l2=al2.size()-1;

        while(l1>=0 && l2>=0)
        {
            if(al1.get(l1)==al2.get(l2))
            {
               l1--;l2--;continue;
            }
            else break;
        }
        return l1+l2+2;
    }

    public static boolean areSimilar(Node n1, Node n2) {
        // write your code here
        boolean flag=true;
        int n=n1.children.size();
        if(n!=n2.children.size())
            return false;
        for(int i=0;i<n;i++)
        {
            flag=flag && areSimilar(n1.children.get(i),n2.children.get(i));
            if(flag==false)
                break;
        }
        return flag;
    }

    public static boolean areMirror(Node n1, Node n2) {
        // write your code here
        boolean flag=true;
        int n=n1.children.size();

        if(n!=n2.children.size())
            return false;
        for(int i=0;i<n;i++)
        {
            flag= flag && areMirror(n1.children.get(i),n2.children.get(n-i-1));
            if(flag==false)
                break;
        }
        return flag;
    }

    public static boolean areMirror2(Node n1, Node n2) {
        // write your code here
        boolean flag=true;
        int n=n1.children.size();

        if(n!=n2.children.size() && n1.data!=n2.data)
            return false;
        for(int i=0;i<n;i++)
        {
            flag= flag && areMirror(n1.children.get(i),n2.children.get(n-i-1));
            if(flag==false)
                break;
        }
        return flag;
    }

    public static boolean IsSymmetric(Node node) {
        // write your code here
        return areMirror2(node,node);

    }

    static Node predecessor=null;
    static Node successor=null;
    static int state=0;
    public static void predecessorAndSuccessor(Node node, int data) {
        // write your code here
        if(state==0){
            if(node.data==data)
                state++;
            else
                predecessor=node;
        }
        else if(state==1){
            successor=node;
            state++;
            return;
        }
        for(Node n:node.children)
        {
            if(state<2)
                predecessorAndSuccessor(n,data);
        }
    }


    static int ceil=Integer.MAX_VALUE;
    static int floor=Integer.MIN_VALUE;
    public static void ceilAndFloor(Node node, int data) {
        // Write your code here
        if(node.data<data)
        {
            floor=Math.max(node.data,floor);
        }
        if(node.data>data)
        {
            ceil=Math.min(node.data,ceil);
        }
        for(Node n:node.children)
        {
            ceilAndFloor(n,data);
        }
    }

    static int ans=Integer.MAX_VALUE;
    public static int kthLargest(Node node, int k){
        // write your code here
        return 0;
    }

    private static void fun() {
        int[] arr={10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
        Node root = construct(arr);

        int[] arr2={10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
        Node root2 = construct(arr2);

        //traversals(root);             //Preorder-Postorder
        //levelOrderLinewiseZZ(root);   //Levelorderzig-zag
        //mirror(root);                 //Mirror tree
        //removeLeaves(root);           //Remove leaf nodes
        //System.out.println(find(root,100));      //print find

        //ArrayList<Integer> al=nodeToRootPath(root,50);
        //System.out.println(al);

        //System.out.println(lca(root,50,10));

        //System.out.println(distanceBetweenNodes(root,20,60));


        /*boolean similar = areSimilar(root, root2); //TREE SIMILARITY
        System.out.println(similar);*/

        //System.out.println(areMirror(root,root2));
        //System.out.println(IsSymmetric(root));
        /*predecessorAndSuccessor(root, 50);
        System.out.println("Predecessor = " + predecessor.data +" Successor = " + successor.data);*/

        /*ceilAndFloor(root,10);
        System.out.println(floor+" "+ceil);*/

        System.out.println(kthLargest(root,2));

    }



    public static void main(String[] args) throws IOException {

        fun();

    }
}



