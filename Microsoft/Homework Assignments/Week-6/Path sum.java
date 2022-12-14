class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return searchPathSum(root, 0, targetSum);
    }
     public boolean searchPathSum(TreeNode root, int currentSum, int targetSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }
        return searchPathSum(root.left, currentSum, targetSum) || searchPathSum(root.right, currentSum, targetSum);
    }
}
