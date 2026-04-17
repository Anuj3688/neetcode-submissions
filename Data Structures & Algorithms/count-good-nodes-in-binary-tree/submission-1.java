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
    private int ans = 0;
    private void traversal(TreeNode root, int max  ){
        if (root == null){
            return;
        }
        if (max<=root.val){
            ans += 1;
        }

        int newMax = Math.max(max,root.val);
        traversal(root.right,newMax);
        traversal(root.left,newMax);

    }
    public int goodNodes(TreeNode root) {
        traversal(root,Integer.MIN_VALUE);
        return ans; 
    }
}
