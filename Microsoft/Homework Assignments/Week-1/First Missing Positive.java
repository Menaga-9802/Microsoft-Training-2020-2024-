class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = Arrays.binarySearch(nums, 0);
        int i = 1, j = 0;

        if (k < -1)
            k = -k - 2;

        while (k + i <= nums.length - 1) {
            if (nums[k + i] == j)
                i++;
            else if (nums[k+i]==j+1) {
                i++;
                j++;
            }
            else if (nums[k+i]>j+1)
                return j+1;
        }
        return j+1;
    }
}
