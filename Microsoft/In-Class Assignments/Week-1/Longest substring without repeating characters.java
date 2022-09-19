class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int[] lastPos = new int[256];
        for (int i = 0; i < 256; i++) {
            lastPos[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastPos[c] >= start) {
                start = lastPos[c] + 1;
            }
            lastPos[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
