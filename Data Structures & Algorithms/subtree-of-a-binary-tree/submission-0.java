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
    boolean check = false;
    public boolean compare(TreeNode p, TreeNode q){
        if (p == null || q == null) {
            return p == q;
        }

        if (p.val != q.val){
            return false;
        }
        return compare(p.left, q.left) &&
       compare(p.right, q.right);
    }
    public void treeNode(TreeNode s, TreeNode r){
        if (check == true){
            return;
        }
        if (s!= null && r!=null){
            if (s.val == r.val){
                boolean ch =  compare(s.left,r.left) && compare(s.right,r.right);
                if (ch){
                    check = true;
                    return;
                }
            }
        }

        if (s.left != null)
            treeNode(s.left,r) ;
        if (s.right != null)
            treeNode(s.right ,r);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){
            return root == subRoot;
        }
        treeNode(root,subRoot);
        return check;
    }
}
