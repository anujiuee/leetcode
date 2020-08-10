class Solution {
    public int orangesRotting(int[][] grid) {
        
        int n = grid.length;
        
        int m = grid[0].length;
        
        if(n==0 && m ==0) return 0;
        
        Queue<int []> q= new LinkedList();
        
        int count =0;
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==2) {q.add(new int []{i,j});}
                if(grid[i][j]==1) count++;
            }  
        }
        
        
        int time = -1;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            time++;
            
          //   boolean exist = false;
​
            
            for(int t=0;t<size;t++){
                
                int [] k = q.poll();
                int i = k[0];
                int j = k[1];
                                
                
                if(i+1<n && grid[i+1][j]==1){
                    q.add(new int []{i+1,j});
                    grid[i+1][j]=2;
                    count--;
                   // exist = true;
                }
                
                if(j+1<m && grid[i][j+1]==1){
