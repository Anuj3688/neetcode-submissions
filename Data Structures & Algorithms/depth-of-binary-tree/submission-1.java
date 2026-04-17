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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // Calculate each side ONLY ONCE
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        
        // Use Math.max for cleaner logic
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
}
