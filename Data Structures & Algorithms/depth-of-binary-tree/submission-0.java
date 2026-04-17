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
    public static int depth(TreeNode node){
        if (node==null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return 1;
        }
        if (depth(node.left) >= depth(node.right) ){
            return depth(node.left)+1;
        }
        else{
            return depth(node.right)+1;
        }
    }
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
}
