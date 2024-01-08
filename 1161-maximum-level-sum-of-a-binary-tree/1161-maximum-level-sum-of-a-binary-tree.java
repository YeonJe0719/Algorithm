class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0, ans = 0, max = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            level++;
            int sum = 0;
            for (int i = q.size() ; i > 0; i--) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (sum > max) {
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
}