class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
           return dfs(nums, 0, nums.length);
    }
    public TreeNode dfs(int[] nums, int strt, int end) {
        int mid = (end+strt)/2;

        if(mid<0 || mid>nums.length-1 || strt>end)
            return null;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums,strt,mid-1);
        node.right = dfs(nums,mid+1,end);
        return node;
    }
}
