class Solution {
    
    
    public int longestIncreasingPath(int[][] matrix) {
        
        
        int n  = matrix.length;
        
        if(n==0) return 0;
        int m = matrix[0].length;
        
        
        int ans = 1;
        
        int ansMat [][] = new int[n][m];
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                 ans = Math.max(ans,dfs(matrix,i,j,ansMat));
            }
        }
        
        return ans;
    }
    
    int dfs (int[][] matrix, int i , int j,int ansMat [][]){
        
        if(i>=matrix.length || j>=matrix[0].length || i<0 || j<0) return 0;
        if(ansMat[i][j]!=0) return ansMat[i][j];
        
        int res = 1;
        
        if(i+1<matrix.length && matrix[i+1][j]>matrix[i][j]){
            res = Math.max(res,1+dfs(matrix,i+1,j,ansMat));
        }
        
        if(j+1<matrix[0].length && matrix[i][j+1]>matrix[i][j]){
           res = Math.max(res,1+dfs(matrix,i,j+1,ansMat));
        }
        
        if(i-1>=0 && matrix[i-1][j]>matrix[i][j]){
           res = Math.max(res,1+dfs(matrix,i-1,j,ansMat));
        }
        
        if(j-1>=0 && matrix[i][j-1]>matrix[i][j]){
            res = Math.max(res,1+dfs(matrix,i,j-1,ansMat));
        }
        
        ansMat[i][j] = res;
        
        return res;
        
    }
}
