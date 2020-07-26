class Solution {
    public int numDistinct(String s, String t) {
         int n = s.length();
        int m = t.length();
        
        int dp[][] = new int [n+1][m+1];
        
        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
            if(i==0 && j==0) dp[i][j]=1;
            else if(i==0){
                dp[i][j]=0;
            } else if(j==0){
                dp[i][j]=1;
            }
            
            else {
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                
                 dp[i][j]+=dp[i-1][j];
            }
        }
        }
        return dp[n][m];
    }
}
