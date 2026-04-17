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
        System.out.println(root.val+" "+count+" "+value);

        boolean check = element(root.left,k);
        count += 1;
                if (k == count){
            value = root.val;
            return true;
        }
        if (check == false){
            element(root.right,k);
        }
        return false;

    }
    public int kthSmallest(TreeNode root, int k) {
        element(root,k);
        return value;
    }
}
