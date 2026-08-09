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
    public int statifiedNodes(TreeNode curr , int max){
        if (curr==null) return 0;
        if (curr.val>=max){
            return 1 + statifiedNodes(curr.left , curr.val) +statifiedNodes(curr.right , curr.val);
        }
        return statifiedNodes(curr.left , max) + statifiedNodes(curr.right , max);
    }
    public int goodNodes(TreeNode root) {
        // here the game is about ranges need to keep max 
        return statifiedNodes(root, Integer.MIN_VALUE);
    }
}
