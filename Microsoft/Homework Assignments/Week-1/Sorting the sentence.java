class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        String ans[]=new String[a.length];
        int i;
        for(i=0;i<a.length;i++)
        {
            ans[(a[i].charAt(a[i].length()-1)-'0') - 1]=a[i].substring(0,a[i].length()-1);
        }
        return String.join(" ", ans);
    }
}
