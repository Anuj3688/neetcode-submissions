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
    public void rightView(TreeNode curr, List<Integer> view, int index){
        if (curr == null) return;
        // if length match current index then move else add
        if (index == view.size()){
            view.add(curr.val);
        } 

        rightView(curr.right,view,index+1);
        rightView(curr.left,view,index+1);

    } 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        rightView(root,view,0);
        return view;
    }
}
