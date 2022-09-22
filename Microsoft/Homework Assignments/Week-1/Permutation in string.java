class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char c : s1.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }

        int left = 0, right = 0, valid = 0;

        while(right<s2.length()){
            char p = s2.charAt(right);
            right++;

            if(need.containsKey(p)){
                window.put(p, window.getOrDefault(p,0)+1);
                if(need.get(p).equals(window.get(p))){
                    valid++;
                }
            }

            while(right-left==s1.length()){
                if(valid==need.size()) 
                    return true;
                char l = s2.charAt(left);
                left++;

                if(need.containsKey(l)){
                    if(need.get(l).equals(window.get(l))){
                        valid--;
                    }
                    window.put(l, window.getOrDefault(l,0)-1);
                }
            }
        }
        return false;
    } 
    
}
