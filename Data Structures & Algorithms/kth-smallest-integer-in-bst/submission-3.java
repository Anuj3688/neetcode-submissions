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
    int count = 0;
    int value = -1;
    private boolean element(TreeNode root, int k){
        if (root == null){
            return false;
        }
         // Traverse left
        if (element(root.left, k)) {
            return true;   // 🔥 propagate stop
        }

        // Visit node
        count += 1;
        if (k == count){
            value = root.val;
            return true;
        }

        // Traverse right
        return element(root.right, k);

    }
    public int kthSmallest(TreeNode root, int k) {
        element(root,k);
        return value;
    }
}
