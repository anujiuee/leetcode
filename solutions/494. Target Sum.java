class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;
        
        int sum =0;
        for(int num:nums) sum+=num;
        
        if(target<-sum || target>sum) return 0;
        
        int dp [][] = new int[n][2*sum+1];
        
        dp[0][nums[0]+sum]=1;
        dp[0][-nums[0]+sum]+=1;
        
        for (int i=1;i<n;i++){
            for (int j=-sum;j<=sum;j++)
            {
                if(dp[i-1][j+sum]>0){
                dp[i][j+nums[i]+sum]+=dp[i-1][j+sum];
                dp[i][j-nums[i]+sum]+=dp[i-1][j+sum];
                }
            }
        }
        
        return dp[n-1][target+sum];
        
    }
}
