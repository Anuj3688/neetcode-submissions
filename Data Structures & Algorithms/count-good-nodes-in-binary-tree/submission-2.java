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
    public int valid(TreeNode curr, int max){
        if (curr == null){
            return 0;
        }
        System.out.printf("Curr: %d%n max: %d%n", curr.val , max);
        if (curr.val >= max){
            // here adding current element since it is greater it is new max so carry forward max
            // will be current
            return 1 + valid(curr.left , curr.val) + valid(curr.right , curr.val);
        }
        // here if it is equal or less max wil be the same
        return valid(curr.left , max) + valid(curr.right , max);
    }
    public int goodNodes(TreeNode root) {
        // here we need to maintain the path
        // while going we need to keep adding the elements
        // while returning we need to remove
        // we can keep max element along with last element
        //root is always valid
        return 1 + valid(root.left, root.val) + valid(root.right, root.val);
    }
}
