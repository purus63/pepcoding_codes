package Tree.BST;

public class BSTConstruction {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void main(String[] args) {

        int [] data={10,20,30,40,50,60,70,80,90};
        Node root = construct(data,0,data.length-1);
        display(root);
    }

    private static void display(Node root) {
        if(root==null)
            return;
        display(root.left);
        System.out.print(root.data+" ");
        display(root.right);
    }

    private static Node construct(int[] data, int start, int end) {

        if(start>end)
            return null;
        int mid=start+ (end-start)/2;

        Node nn= new Node(data[mid]);
        nn.left =construct(data,start,mid-1);
        nn.right=construct(data,mid+1,end);
        return nn;
    }
}
