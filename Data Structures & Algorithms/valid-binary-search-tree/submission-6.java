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
    public boolean groundCheck(TreeNode curr , int min , int max){
        if (curr == null) return true;

       // think in terms of min and max update that as per current value and pass on
       if (curr.val > min && curr.val < max){
        return groundCheck(curr.left , min , curr.val) && groundCheck(curr.right , curr.val, max);
       }

       return false;
    }
    public boolean isValidBST(TreeNode root) {
        return groundCheck(root.left , Integer.MIN_VALUE , root.val) && groundCheck(root.right, root.val , Integer.MAX_VALUE);
    }
}
