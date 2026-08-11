/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null;

    

    public int fun(TreeNode root, TreeNode p, TreeNode q) {
        int total = 0;
        int self = 0;
        int l = 0;
        int r = 0;
        if (root == null) {
            return total;
        }

       l= fun(root.left, p, q);
      r=  fun(root.right, p, q);

        if (root.val == q.val || root.val == p.val) {
            self = 1;
        }

        total = l + r + self;
        if (total == 2 && ans == null) {
            ans = root;

        }
        return total;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return root;
        }

        fun(root, p, q);

        return ans;
    }
}