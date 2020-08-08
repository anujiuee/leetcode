class Solution {
    public int uniquePaths(int m, int n) {
   
        int d [][]= new int [m][n];
        
        
        for (int i=m-1;i>=0;i--){
            for (int j=n-1;j>=0;j--){
                if(i==m-1) d[i][j]=1;
                else if(j==n-1) d[i][j]=1;
                else 
                    d[i][j]=d[i+1][j]+d[i][j+1];     
        }
        
    }
        
        return d[0][0];
    
    }
}
