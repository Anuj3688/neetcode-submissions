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
    private void visit(TreeNode root , List<Integer> ans, int level){
        if (root == null){
            return ;
        }
        // need to find out if level is already visited or not
        // if visited then skip and go deeper
        if (ans.size() == level){
            ans.add(root.val);
        }
        visit(root.right,ans,level+1);
        visit(root.left,ans,level+1);

        return;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        visit(root,ans,0);
        return ans;
    }
}
