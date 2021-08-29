package Tree.Btree;


import java.util.Stack;

public class BtreePractice {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left =this.right = null;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
     public static class Pair{
        Node node;
        int state;
        public Pair(Node n,int state)
         {
             this.node=n;
             this.state=state;
         }
     }



    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root=construct(arr);
        display(root);

        System.out.print("\nPreorder Traversal ");
        preorder(root);
        System.out.print("\nInorder Traversal ");
        inorder(root);
        System.out.print("\nPostorder Traversal ");
        postorder(root);
    }

    private static void preorder(Node root) {
        if(root==null)
            return;
        System.out.print(root.data+" ,");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root) {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ,");
        inorder(root.right);
    }

    private static void postorder(Node root) {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ,");
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


    private static Node construct(Integer[] arr) {
        Stack<Pair> st=new Stack<>();
        Node root =new Node(arr[0]);
        Pair p = new Pair(root,0);
        st.push(p);
        int indx=0;
        while(st.size()>0)
        {
            Pair pair= st.peek();
            if(pair.state==0)
            {
                indx++;
                if(arr[indx]!=null) {
                    Node nn = new Node(arr[indx]);
                    pair.node.left = nn;
                    Pair pp = new Pair(nn, 0);
                    st.push(pp);
                }
                pair.state++;
            }
            else if(pair.state==1)
            {
                indx++;
                if(arr[indx]!=null) {
                    Node nn = new Node(arr[indx]);
                    pair.node.right = nn;
                    Pair pp = new Pair(nn, 0);
                    st.push(pp);
                }
                pair.state++;
            }
            else{
                st.pop();
            }

        }
        return root;
    }

}
