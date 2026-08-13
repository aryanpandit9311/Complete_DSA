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
 */import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public void fun(TreeNode root, int sum, int targetSum) {

        // Base case
        if (root == null) {
            return;
        }

        // Add current node
        path.add(root.val);
        sum += root.val;

        // Check if leaf
        if (root.left == null && root.right == null) {

            // Valid path
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
        }

        // Go left
        fun(root.left, sum, targetSum);

        // Go right
        fun(root.right, sum, targetSum);

        // Backtrack
        path.remove(path.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        fun(root, 0, targetSum);

        return result;
    }
}