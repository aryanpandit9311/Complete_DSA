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
    TreeNode ans= null;

    public int fun(TreeNode root, TreeNode p, TreeNode q){
int l=0;
int r=0;

              if(root.left!=null){
                    l= fun(root.left,p,q);
              }
               if(root.right!=null){
                  r= fun(root.right,p,q);
               }
           
               int self = 0;
               if(root==p || root==q){
                 self=1;
                    }
                    int total = l+r+self;
                    if(total ==2 && ans==null){
                        ans=root;
                    }

                    return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        fun(root,p,q);
     
       return ans;

    }
}