class Solution {
    public static List<String> ans;
    public void solve(String s, int i, HashSet<String> hash, String asf) {
        if(i == s.length()) {
            ans.add(asf);
            return;
        }
        for(int k = i + 1; k <= s.length(); k++) {
            if(hash.contains(s.substring(i, k))) {
                if(!asf.equals("")) solve(s, k, hash, asf + " " + s.substring(i, k));
                else solve(s, k, hash, s.substring(i, k));
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        ans = new ArrayList<>();
        HashSet<String> hash = new HashSet<>();
        for(String x: wordDict) {
            hash.add(x);
        }
        solve(s, 0, hash, "");
        return ans;
    }
}
