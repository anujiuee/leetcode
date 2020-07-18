class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int a [] = new int [n];
        
        for (int i=0;i<n;i++){
            a[i]=i;
        }
        
        for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               if(M[i][j]==1){
                   union(a,i,j);
               }
           }
        }
        
        
        Set<Integer> result = new HashSet();
        for(int i=0;i<n;i++){
            result.add(root(a,i));
        }
        
        return result.size();
            
    }
    
    public void union(int a [],int u,int v){
        int m  = root(a,u);
        int n =  root(a,v);
        a[m]=a[n];
    }
    
    public int root(int a[],int m){
        
        while(a[m]!=m){
            m=a[m];
        }
        return m;
    }
}

/*
class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        boolean visited [] = new boolean [n];
        
        int count =0;
        
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
            bfs(visited,M,i);
                count++;
            }
        }
        
        return count;
    }
    
    public void bfs(boolean [] visited ,int[][] M,int u){
        Queue < Integer > q = new LinkedList < > ();

        q.add(u);
        visited[u]=true;
        
        while(!q.isEmpty()){
            int m = q.remove();
                for(int j=0; j<M.length; j++){
                if(M[m][j] == 1 && !visited[j]){
                    visited[j]=true;
                     q.add(j);
                }
          }
        }
        
    
    }
}
*/