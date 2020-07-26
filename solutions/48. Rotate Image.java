class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        int a,b,c,d;
        
        for(int i=0; i<(n+1)/2; i++){
            for(int j=i; j<n-i-1; j++){
                 a = matrix[i][j];
                 b = matrix[j][n-i-1];
                 c = matrix[n-i-1][n-j-1];
                 d = matrix[n-j-1][i];
                matrix[j][n-i-1] = a;
                matrix[n-i-1][n-j-1] = b;
                matrix[n-j-1][i] = c;
                matrix[i][j] = d;
            }
        }
    }
}
