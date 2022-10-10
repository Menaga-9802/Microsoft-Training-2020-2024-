class Solution {
    public int findCenter(int[][] edges) {
        int a1=edges[0][0],a2=edges[0][1];
        int b1=edges[1][0],b2=edges[1][1];
        if(a1==b1){
            return b1;
        }
        else if(a1==b2){
            return b2;
        }
        else if(a2==b1){
            return b1;
        }
        else{
            return b2;
        }
    }
}
