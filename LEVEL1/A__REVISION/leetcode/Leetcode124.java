
package LEVEL1.A__REVISION.leetcode;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Leetcode124 {
    int ans=Integer.MIN_VALUE;

    int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        int res=helper(root);
        return ans;
    }

    public int helper(TreeNode root) {
        if(root==null)
            return 0;

        int data=root.val;
        int leftsum=helper(root.left);
        int rightsum=helper(root.right);

        ans=max(ans,data+leftsum+rightsum);
        return max(0,data+max(leftsum,rightsum));

    }
}

