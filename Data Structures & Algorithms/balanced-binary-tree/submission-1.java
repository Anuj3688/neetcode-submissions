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
    boolean balanced = true;
    public  int tree(TreeNode node){
        if (node == null){
            return 0;
        }

        //check diff
        int left = tree(node.left);
        int right = tree(node.right);

        if (balanced){
        if (left >= right)
            balanced = left-right <= 1;
        else{
            balanced = right -left <= 1;
        }
        }

        return Math.max(left,right) + 1;

    }
    public boolean isBalanced(TreeNode root) {
        tree(root);
        return balanced;

    }
}
