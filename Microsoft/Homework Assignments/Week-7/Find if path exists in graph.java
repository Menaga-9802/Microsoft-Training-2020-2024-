class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<List<Integer>> e = new ArrayList<>(); 
        boolean[] visited = new boolean[n]; 
        for(int i=0; i<n; i++){
            e.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            e.get(edge[0]).add(edge[1]);
            e.get(edge[1]).add(edge[0]);
        }
         return dfs(n, e, source, destination, visited);
    }
    public boolean dfs(int n, List<List<Integer>> e, int src, int dst, boolean[] visited){
        if(src == dst) return true;   
        if(visited[src]){
            return false; 
        }
        visited[src] = true; 
        List<Integer> list = new ArrayList<>();
        list = e.get(src);
        for(int i: list){
            if(dfs(n, e, i, dst, visited)){
                return true;
            }
        }
        return false;    
    }
}
