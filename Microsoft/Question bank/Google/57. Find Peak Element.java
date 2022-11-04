class Solution {
    public int findPeakElement(int[] nums){
        if (nums.length == 1) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high - 1) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (nums[low] < nums[high]) {
            return high;
        }
        else {
            return low;
        }
    }
}
