class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int a [][] = new int [n][m];
        
        int ans = Integer.MAX_VALUE;
        
        for(int i =n-1;i>=0;i--){
            for(int j =m-1;j>=0;j--){
                
                if(i==n-1){
                    a[i][j]=matrix[i][j];
                } else {
                
                int u = j-1>=0?j-1:0;
                int v = j+1<n?j+1:n-1;
                
                a[i][j]=matrix[i][j]+Math.min(a[i+1][u],Math.min(a[i+1][v],a[i+1][j]));
                }
                
                if(i==0) ans = Math.min(ans,a[i][j]);
                
            }
        }
        
        return ans;
        
    }
}
