class Solution {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }

    private Result dfs(TreeNode root) {

        if (root == null) {
            return new Result(null, 0);
        }

        Result left = dfs(root.left);
        Result right = dfs(root.right);

        if (left.height > right.height) {
            return new Result(left.node, left.height + 1);
        }

        if (right.height > left.height) {
            return new Result(right.node, right.height + 1);
        }

        // Both sides have deepest leaves at the same depth
        return new Result(root, left.height + 1);
    }

    class Result {
        TreeNode node;
        int height;

        Result(TreeNode node, int height) {
            this.node = node;
            this.height = height;
        }
    }
}