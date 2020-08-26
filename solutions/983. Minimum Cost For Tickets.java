class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        int n = days.length;
        
        if (n==0) return 0;
        
       int dp[] = new int [days[n-1]+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        int a ,b, c=0;
        
        int j = 0;
        
                
        
        for (int i=1;i<days[n-1]+1;i++){
            
            if(days[j]>i){
                dp[i]=dp[i-1];
                continue;
            }
            
            a = dp[i-1]+costs[0];
            
            b = dp[Math.max(i-7,0)]+costs[1];
            
            
            c = dp[Math.max(i-30,0)]+costs[2];
            
            
            dp[i]= Math.min(a,Math.min(b,c));
            
           
            j++;
            
        }
        
        return dp[days[n-1]];
        
    }
}
