class Solution {
    public int numSquares(int n) {
        
        int s= (int) Math.sqrt(n);
        
        int dp[]= new int [n+1];
        
       Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0]=0;
        
        for (int i=1;i<=s;i++){
            
            for (int j=1;j<=n;j++){
             
                if(j>=i*i){
                    dp[j]=Math.min(dp[j],1+dp[j-i*i]);
                }
             
            }
            
        }
        
        return dp[n];
        
    }
}