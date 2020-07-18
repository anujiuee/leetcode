class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
         ArrayList[] adj = new ArrayList[n];
        
        for(int i=0; i<adj.length; i++){
            adj[i] = new ArrayList();
        }
        int time = 0;
        for(int i=0; i<manager.length; i++){
            int emp = i;
            int mgr = manager[i];
           
             if(manager[i] == -1)
                continue;
            
            adj[mgr].add(emp);
                          
        }
        
        return dfs(headID, informTime, adj);
    }
    
    
    public int dfs(int manager, int[] informTime, ArrayList[] adj){
         List<Integer> list = adj[manager];
        
        int sum=0;
        int ans=0;
        for(int i=0; i<list.size(); i++){
           sum = informTime[manager]+dfs(list.get(i) , informTime, adj);
            ans=Math.max(sum,ans);
        }
        
        return ans;
    }
}