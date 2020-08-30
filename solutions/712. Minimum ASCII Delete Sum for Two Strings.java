class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int dp[][] = new int [n+1][m+1];
        
        int val=0;
        
        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                if(i==0 && j==0) continue;
                else if(i==0){
                    dp[i][j]=dp[i][j-1]+(int)s2.charAt(j-1);
                }
                 else if(j==0){
                    dp[i][j]=dp[i-1][j]+(int)s1.charAt(i-1);
                }
                
                else if(s1.charAt(i-1)==s2.charAt(j-1))  dp[i][j]=dp[i-1][j-1];
                
                else {
                val = Math.min((int)s2.charAt(j-1)+dp[i][j-1],(int)s1.charAt(i-1)+dp[i-1][j]);
                       dp[i][j]=val;
                     }
                
                
            }
        }
        
        return dp[n][m];
    }
}
