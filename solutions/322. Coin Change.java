class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        
        int dp [][] = new int [amount+1][n+1];
        
        int max = amount+1;
        
        for (int i=0;i<=amount;i++){
            Arrays.fill(dp[i], max);
        }
​
        
        for (int i=0;i<=amount;i++){
            for (int j=0;j<n+1;j++){
                if(i==0) dp[i][j]=0;
                else if (j==0) dp[i][j]=max;
                else {
                    if(i>=coins[j-1]) 
                        dp[i][j] = Math.min(dp[i][j-1],dp[i-coins[j-1]][j]+1);
                    else dp[i][j] = dp[i][j-1];
                }
            }
        }
        
        return dp[amount][n]!=max?dp[amount][n]:-1;
    }
}
