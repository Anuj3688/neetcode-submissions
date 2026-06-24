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
    Map<Integer ,Integer> view = new HashMap<>();
    public void treeView(TreeNode curr, int height){
        if (curr == null){
            return;
        }

        //now check if current height is empty or not
        // if empty then applly current
        if (view.getOrDefault(height , -1) == -1){
            view.put(height , curr.val);
        }
        treeView(curr.right , height+1);
        treeView(curr.left , height+1);
        return;

    }
    public List<Integer> rightSideView(TreeNode root) {
        treeView(root,1);
        return new ArrayList<>(view.values());
    }
}
