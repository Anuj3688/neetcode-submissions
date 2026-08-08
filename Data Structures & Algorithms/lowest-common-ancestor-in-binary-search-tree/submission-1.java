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
    public TreeNode findancestor(TreeNode curr , TreeNode p , TreeNode q){
        // think in terms of binary searh tree
        //bst is always sorted
        if (curr == null){
            return null;
        }
        if (curr.val > p.val && curr.val > q.val){
            return findancestor(curr.left, p, q);
        }

        if (curr.val < p.val && curr.val < q.val){
            return findancestor(curr.right, p, q);
        }

        return curr;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findancestor(root, p, q);
    }
}
