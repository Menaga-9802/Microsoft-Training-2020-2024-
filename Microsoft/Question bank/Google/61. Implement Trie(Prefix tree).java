class Trie {
    public Trie[] children;
    public boolean end = false;
    public Trie() {
        children = new Trie[26];
        end = false;
    }
    public void insert(String word) {
        int i = 0;
        Trie curr = this;
        while (i < word.length()) {
            if (curr.children[word.charAt(i) - 'a'] == null) curr.children[word.charAt(i) - 'a'] = new Trie();
            curr = curr.children[word.charAt(i) - 'a'];
            i++;
        }
        curr.end = true;
    }
    public boolean search(String word) {
        Trie curr = this;
        int i = 0;
        while (i < word.length()) {
            if (curr.children[word.charAt(i) - 'a'] == null) return false;
            curr = curr.children[word.charAt(i) - 'a'];
            i++;
        }
        return curr.end == true;
    }
    public boolean startsWith(String prefix) {
        Trie curr = this;
        int i = 0;
        while (i < prefix.length()) {
            if (curr.children[prefix.charAt(i) - 'a'] == null) return false;
            curr = curr.children[prefix.charAt(i) - 'a'];
            i++;
        }
        return true;
    }
}
