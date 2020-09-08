class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        boolean visited [] = new boolean [n];
        
        int count =0;
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
            dfs(visited,M,i);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(boolean [] visited ,int[][] M,int u){
        if(visited[u]) return;
        visited[u]=true;
        
        for(int j=0; j<M.length; j++){
                if(M[u][j] == 1){
                     dfs(visited,M,j);
                }
    }
    }
}
