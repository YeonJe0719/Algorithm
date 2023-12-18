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
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }
     private int countGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int goodNodes = 0;

        // Check if the current node is good
        if (node.val >= maxSoFar) {
            goodNodes++;
            maxSoFar = node.val;
        }

        // Recursively count good nodes in left and right subtrees
        goodNodes += countGoodNodes(node.left, maxSoFar);
        goodNodes += countGoodNodes(node.right, maxSoFar);

        return goodNodes;
    }

}