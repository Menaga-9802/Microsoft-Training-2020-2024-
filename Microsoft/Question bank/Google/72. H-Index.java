class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=n){
                return n;
            }
            n--;
        }
        return 0;
    }
}
