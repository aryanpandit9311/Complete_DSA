/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }

           // Check whether current node is a leaf
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Continue searching in left or right subtree
        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }
}