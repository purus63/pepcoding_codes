package Level2;


import java.util.*;

public class LcaOfBtree {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }

    public static ArrayList<TreeNode> nodetoroot(TreeNode node, int data)
    {
        if(node==null)
            return new ArrayList<>();
        
        if(node.val==data)
        {
            ArrayList<TreeNode> al =new ArrayList<>();
            al.add(node);
            return al;
        }
        
        ArrayList<TreeNode> l1= nodetoroot(node.left,data);
        ArrayList<TreeNode> r1= nodetoroot(node.right,data);
        
        if(l1.size()==0 && r1.size()==0)
        {
            return new ArrayList<>();
        }
        else if(l1.size()>0)
        {
            l1.add(node);
            return l1;
        }
        else
        {
            r1.add(node);
            return r1;
        }
    }

  public static TreeNode lowestCommonAncestor(TreeNode node, int p, int q) {
        
        ArrayList<TreeNode> ntr1= nodetoroot(node,p);
        ArrayList<TreeNode> ntr2= nodetoroot(node,q);
        
        int n=ntr1.size()-1;
        int m=ntr2.size()-1;
        
        if(m<0 || n<0)
            return null;
        while(m>=0 && n>=0)
        {
            if(ntr1.get(n).val!=ntr2.get(m).val)
            {
                break;
            }
            else{
                n--;
                m--;
            }
        }
        
        return ntr1.get(n+1);
        
  }

  // input_section=================================================

  public static void display(TreeNode node) {
    if (node == null)
      return;

    StringBuilder sb = new StringBuilder();
    sb.append((node.left != null ? node.left.val : "."));
    sb.append(" -> " + node.val + " <- ");
    sb.append((node.right != null ? node.right.val : "."));

    System.out.println(sb.toString());

    display(node.left);
    display(node.right);
  }

  public static int idx = 0;

  private static TreeNode deserialize(String[] arr) {
    if (idx >= arr.length || arr[idx].equals("null")) {
      idx++;
      return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
    node.left = deserialize(arr);
    node.right = deserialize(arr);

    return node;
  }

  public static TreeNode deserialize(String str) {
    String[] arr = str.split(" ");
    return deserialize(arr);
  }

  public static void solve() {
    String str = scn.nextLine();
    TreeNode root = deserialize(str);

    int e1 = scn.nextInt();
    int e2 = scn.nextInt();

    TreeNode ans = lowestCommonAncestor(root, e1, e2);
    System.out.println(ans == null ? null : ans.val);
  }

  public static void main(String[] args) {
    solve();
  }
}