class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(!dfs(graph, color, i, 0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph, int[] color, int i, int prevColor){
        if(color[i] != -1 && color[i] != prevColor){
            return false;
        }
        if(color[i] == prevColor){
            return true;
        }
        color[i] = prevColor;
        for(int adjacent : graph[i]){
            if(!dfs(graph, color, adjacent, prevColor ^ 1)){
                return false;
            }
        }
        return true;
    }
}
