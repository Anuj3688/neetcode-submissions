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
    public boolean compare(TreeNode p , TreeNode q){
        if (p == null && q == null){
            return true;
        }
        else if (p==null && q!=null){
            return false;
        }
        else if (p != null && q ==null){
            return false;
        }


        boolean   same = p.val == q.val;
        if (same == false){
            return false;
        }
            boolean le =compare(p.left,q.left);
            if (le ==false){
                return false;
            }
            boolean rh = compare(p.right,q.right);
            if (rh == false){
                return false;
            }
        return true;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p,q);
    }
}
