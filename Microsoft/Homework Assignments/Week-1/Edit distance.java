class Solution {
    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public int minDistance(String word1, String word2) {
         if (word1 == null || word2 == null) return 0;

    int m = word1.length() + 1, n = word2.length() + 1;
    int[] d = new int[n];

    for (int j = 0; j < n; ++j)
      d[j] = j;

    for (int i = 1; i < m; ++i) {
      int pre = d[0];
      d[0] = i;
      for (int j = 1; j < n; ++j) {
        int tmp = d[j];
        if (word1.charAt(i-1) == word2.charAt(j-1)) {
          d[j] = pre;
        } else {
          d[j] = min(pre, d[j], d[j-1]) + 1;
        }
        pre = tmp;
      }
    }
    return d[n-1];
        
    }
}
