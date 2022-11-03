class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> l = new ArrayList<>();
    int i = 0, N = intervals.length;
    while (i < N && intervals[i][1] < newInterval[0]) 
        l.add(intervals[i++]);
    while (i < N && intervals[i][0] <= newInterval[1]) { 
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
    }
    l.add(newInterval);       
    while (i < N) l.add(intervals[i++]);
    return l.toArray(new int[][]{});
  }
}
