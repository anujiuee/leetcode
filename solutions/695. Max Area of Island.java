class Solution {
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int result=0;
        
        for(int i=0;i< grid.length; i++){
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] == 1){
                    count = 0;
                    dfs(grid, i, j);
                    
                    if(count > result)
                        result = count;
                }
                    
            }
        }
        
        return result; 
    }
    
    void dfs(int[][] grid, int i, int j){
        if(i < 0 || i> grid.length-1 || j < 0 || j> grid[i].length-1)
            return;
        
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            count++;
        }else
            return;
        
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        
    }
}
