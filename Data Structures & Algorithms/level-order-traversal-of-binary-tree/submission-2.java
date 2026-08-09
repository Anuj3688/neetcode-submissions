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
    public void roaming(TreeNode curr ,List<List<Integer>> result , int level){
        if (curr == null) return;
        List<Integer> running = null;
        if (result.size() == level){
            // case when array is not added;
            running = new ArrayList<>();
            result.add(running);
        }
        else{
            running = result.get(level);
        }
        running.add(curr.val);
        roaming(curr.left ,result , level+1);
        roaming(curr.right ,result , level+1);
        return;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        roaming(root , result , 0);
        return result;
    }
}
