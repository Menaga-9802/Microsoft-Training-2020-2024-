class Solution {
    public boolean wordBreak(String sentence, List<String> dictionary) {
        int[] dp = new int[sentence.length()];
		if(dictionary.contains(sentence.substring(0, 1)))
			dp[0] = 1;
		
		for(int i = 1; i < dp.length; i++) {
			int ans = dictionary.contains(sentence.substring(0, i + 1)) == true ? 1 : 0;
			for(int j = 0; j < i; j++) {
				int val = dictionary.contains(sentence.subSequence(j + 1, i + 1)) == true ? 1 : 0;
				ans += val * dp[j];
			}
			dp[i] = ans;
		}
		
		return dp[sentence.length() - 1] > 0 ? true : false;
    }
}
