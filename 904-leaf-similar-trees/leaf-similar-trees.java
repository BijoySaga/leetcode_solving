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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> val1 = new ArrayList<>();
        List<Integer> val2 = new ArrayList<>();

        getLeaves(root1, val1);
        getLeaves(root2, val2);

        // Compare the sequences of leaf values
        return val1.equals(val2);
    }

    private void getLeaves(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }

        // Recursively traverse the left and right subtrees
        getLeaves(root.left, leaves);
        getLeaves(root.right, leaves);
    }
}