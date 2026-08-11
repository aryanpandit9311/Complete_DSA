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
 */class Solution {

    HashSet<Integer> set = new HashSet<>();

    public boolean traverse(TreeNode node, int k) {

        if (node == null) {
            return false;
        }

        int required = k - node.val;

        if (set.contains(required)) {
            return true;
        }

        set.add(node.val);

        return traverse(node.left, k) ||
               traverse(node.right, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        return traverse(root, k);
    }
}