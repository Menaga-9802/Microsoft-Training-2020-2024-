class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashSet<Character> hs = new HashSet<>();
        int p=0;
        char current=' ';
        String res="";
        for(int i=0; i<strs.length; ++i)
        {
            if(p >= strs[i].length())
                break;
            current = strs[i].charAt(p);
            hs.add(current);
            
            if(i == strs.length-1)
            {
                i = -1;
                ++p;
                if(hs.size() > 1)
                {
                    break;
                }
                else
                {
                    res += current;
                    hs.clear();
                }
            }
        }
        return res;
    }
}
   
