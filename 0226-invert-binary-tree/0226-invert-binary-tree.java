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
public void reverse(TreeNode node){
    if(node==null){
        return;
    }
    TreeNode a = node.left;
        node.left  = node.right;
        node.right = a;
    reverse(node.left);
    reverse(node.right);


    
}
    public TreeNode invertTree(TreeNode root) {
        if(root== null){
            return root;
        }
        reverse(root);
        
return root;
    }
}