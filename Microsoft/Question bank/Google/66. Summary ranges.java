public class Solution {
    public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		for (int i = 0, len = nums.length, k; i < len; i = k + 1) {
			k = help(nums, i, len);
			if (i != k)
				list.add("" + nums[i] + "->" + nums[k]);
			else
				list.add("" + nums[i]);
		}
		return list;
	}

	private int help(int[] nums, int l, int r) {
		while (l + 1 < r) {
			int m = (l + r) / 2;
			if (nums[m] - nums[l] == m - l)
				l = m;
			else
				r = m;
		}
		return l;
	}
}
