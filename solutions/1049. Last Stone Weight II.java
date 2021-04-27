class Solution {
    public int lastStoneWeightII(int[] stones) {
        
        int sum =0;
        
        for (int stone:stones) sum+=stone;
        
        int s =sum;
        
        sum=sum/2;
        
        boolean  dp[]= new boolean [sum+1];
        int ans=0;
        boolean yup=false;
        
        dp[0]=true;
        
        for (int i=0;i<stones.length;i++){
            for(int j=sum;j>=0;j--){
                if(j>=stones[i]){
                dp[j]= (dp[j] || dp[j-stones[i]]);
                }
            if(i==stones.length-1 && dp[j]==true && !yup){yup=true;ans=j;}
​
            }
        }
        
        
        
        return Math.abs(s-2*ans);
        
    }
}
