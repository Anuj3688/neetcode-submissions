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
    private Map<Integer, List<Integer>> sol = new HashMap<>();
    public void addLevels(TreeNode root, int level){
        if (root == null) {
            return;
        }
      // If level not present, create new list
        sol.computeIfAbsent(level, k -> new ArrayList<>())
           .add(root.val);

        // Traverse left and right
        addLevels(root.left, level + 1);
        addLevels(root.right, level + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        addLevels(root, 0);

        return new ArrayList<>(sol.values());
    }
}
