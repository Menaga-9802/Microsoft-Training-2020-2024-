class Solution {
    Set<String> set = new HashSet<>();
    List<String> res = new ArrayList<>();
    public boolean find(String word, String origin) {
        if (word.length() == 0) {
            return true;
        }
        boolean res = false; 
        for (int i = 1; i <= word.length(); i++) {
            String sub = word.substring(0, i);
            if (set.contains(sub) && !sub.equals(origin)) {
                res |= find(word.substring(i, word.length()), origin);
            }
        }
        return res;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for (String word : words) {
            set.add(word);
        }
        for (String word : words) {
            if (find(word, word)) {
                res.add(word);
            }
        }
        return res;
    }
}
