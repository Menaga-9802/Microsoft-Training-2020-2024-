class Solution {
    public double[] medianSlidingWindow(int[] nums, int a) {
        int len = nums.length, b = 0;
        double[] sol = new double[len - a + 1];
        boolean flag = (a % 2 == 0);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < a - 1; j++) list.add(nums[j]);
        Collections.sort(list);
        
        for (int i = a - 1; i < len; i++) {
            int expectedindex = Collections.binarySearch(list, nums[i]);
            if (expectedindex > -1) {
                list.add(expectedindex + 1, nums[i]);
            } 
            else {
                list.add(Math.abs(expectedindex + 1), nums[i]); 
            }
            if (flag) {
                sol[i - a + 1] = list.get((a / 2) - 1) / 2.0 + list.get((a / 2)) / 2.0;
            } else {
                sol[i - a + 1] = list.get((a / 2));
            }
            int index = Collections.binarySearch(list, nums[b]);
            list.remove(index);
            b++;
        }

        return sol;
    }
}
