package LEVEL1.A__REVISION.leetcode;

public class LeetCode129 {


        int ans=0;

        public int sumNumbers(TreeNode root) {

            helper(root,0);
            return ans;
        }

        public void helper(TreeNode root,int val)
        {
            if(root==null)
                return;

            if(root.left==null && root.right==null)
            {
                ans+=val*10+root.val;;
            }
            int data= val*10+root.val;
            helper(root.left,data);
            helper(root.right,data);

        }
}
