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
    public static void invert(TreeNode node){
        if (node == null)
            return;
        // first check 
        if (node.left != null){
            invert(node.left);
        }
        if (node.right != null){
            invert(node.right);
        }
        // swap
        TreeNode dummy = node.left;
        node.left = node.right;
        node.right = dummy;

    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}
