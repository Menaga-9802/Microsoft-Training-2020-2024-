class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<int[]>();
        int min_x = intervals[0][0];
        int max_y = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= max_y) {
                max_y = Math.max(max_y, intervals[i][1]);
            } else {
                list.add(new int[]{min_x, max_y});
                min_x = intervals[i][0];
                max_y = intervals[i][1];
            }
        }
        list.add(new int[]{min_x, max_y});
        return list.toArray(new int[list.size()][]);
    }
}
